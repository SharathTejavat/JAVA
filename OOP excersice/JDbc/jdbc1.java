import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDatabaseExample {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://your_database_host:your_database_port/your_database_name";
    private static final String JDBC_USER = "your_database_username";
    private static final String JDBC_PASSWORD = "your_database_password";

    public static void main(String[] args) {
        // Load the JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error loading JDBC driver: " + e.getMessage());
            System.exit(1);
        }

        // Get user input for employee details
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter employee designation: ");
        String designation = scanner.nextLine();
        System.out.print("Enter employee address: ");
        String address = scanner.nextLine();

        // Establish a connection
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            // Insert the employee data into the database
            String sql = "INSERT INTO employee (id, name, salary, designation, address) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setDouble(3, salary);
                preparedStatement.setString(4, designation);
                preparedStatement.setString(5, address);
                preparedStatement.executeUpdate();
                System.out.println("Employee added to the database.");

                // Retrieve and display the inserted employee
                displayEmployeeDetails(connection, id);
            }
        } catch (SQLException e) {
            System.err.println("Error executing SQL statement: " + e.getMessage());
        }
    }

    private static void displayEmployeeDetails(Connection connection, int employeeId) throws SQLException {
        // Retrieve and display the employee details
        String sql = "SELECT * FROM employee WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, employeeId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println("Employee Details:");
                    System.out.println("ID: " + resultSet.getInt("id"));
                    System.out.println("Name: " + resultSet.getString("name"));
                    System.out.println("Salary: " + resultSet.getDouble("salary"));
                    System.out.println("Designation: " + resultSet.getString("designation"));
                    System.out.println("Address: " + resultSet.getString("address"));
                } else {
                    System.out.println("Employee not found in the database.");
                }
            }
        }
    }
}

