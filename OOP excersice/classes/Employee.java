class Employee {
    private int id;
    private String fname, lname;
    private int salary;

    public Employee(int id, String fname, String lname, int salary) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    String name = this.fname + this.lname;

    public int getId() {
        return this.id;
    }

    public String getLname() {
        return this.lname;
    }

    public String getFname() {
        return this.fname;
    }

    public String getName() {
        return this.fname  +" " + this.lname;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        int k = this.salary * percent / 100;
        return this.salary + k;
    }

    public String toString() {
        return "Employee[id=" + this.id + ", name= " + this.fname + " " + this.lname + ", salary=" + this.salary + "]";
    }
}

public class TestMain {
    public static void main(String[] args) {
        // Test constructor and toString()
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1); // toString();

        // Test Setters and Getters
        e1.setSalary(999);
        System.out.println(e1); // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFname());
        System.out.println("lastname is: " + e1.getLname());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

        // Test raiseSalary()
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}

