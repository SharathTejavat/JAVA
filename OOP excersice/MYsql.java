// Step 1: Define an interface DatabaseConnector
interface DatabaseConnector {
    void connect();
    void disconnect();
    void executeQuery(String query);
}

// Step 2: Implement the interface in MySQLConnector and PostgreSQLConnector
class MySQLConnector implements DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL database.");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query in MySQL database: " + query);
    }
}

class PostgreSQLConnector implements DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL database.");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query in PostgreSQL database: " + query);
    }
}

// Step 3: Create a class named DatabaseUser
class DatabaseUser {
    public void performDatabaseOperations(DatabaseConnector connector, String query) {
        connector.connect();
        connector.executeQuery(query);
        connector.disconnect();
    }
}

// Step 4: Test the program
public class Main {
    public static void main(String[] args) {
        DatabaseUser databaseUser = new DatabaseUser();

        // Test with MySQL database
        MySQLConnector mySQLConnector = new MySQLConnector();
        System.out.println("Performing operations with MySQL Database:");
        databaseUser.performDatabaseOperations(mySQLConnector, "SELECT * FROM users");

        // Test with PostgreSQL database
        PostgreSQLConnector postgreSQLConnector = new PostgreSQLConnector();
        System.out.println("\nPerforming operations with PostgreSQL Database:");
        databaseUser.performDatabaseOperations(postgreSQLConnector, "SELECT * FROM users");
    }
}

