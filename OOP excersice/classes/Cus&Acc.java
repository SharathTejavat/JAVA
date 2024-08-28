class Customer {
    private int id;
    private String name;
    private int discount;

    // Constructor
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // toString() method
    @Override
    public String toString() {
        return "Customer[id=" + id + ",name=" + name + ",discount=" + discount + "]";
    }
}

class Account {
    private int id;
    private Customer customer;
    private double balance;

    // Constructor
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCustomerDiscount() {
        return customer.getDiscount();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    // Methods for deposit and withdrawal
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // toString() method
    @Override
    public String toString() {
        return "Account[id=" + id + ",customer=" + customer + ",balance=" + balance + "]";
    }
}

public class TestCustomerAccount {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(101, "John Doe", 10);
        System.out.println(c1);  // Customer's toString()

        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount());

        // Test Account class
        Account acc1 = new Account(201, c1, 1000.0);
        System.out.println(acc1);

        acc1.setBalance(1500.0);
        System.out.println(acc1);
        System.out.println("id is: " + acc1.getId());
        System.out.println("customer is: " + acc1.getCustomer());  // Customer's toString()
        System.out.println("balance is: " + acc1.getBalance());
        System.out.println("customer's name is: " + acc1.getCustomerName());
        System.out.println("customer's discount is: " + acc1.getCustomerDiscount());

        // Test deposit and withdrawal
        acc1.deposit(500.0);
        System.out.println("After deposit: " + acc1);
        
        acc1.withdraw(200.0);
        System.out.println("After withdrawal: " + acc1);
        
        acc1.withdraw(2000.0); 
    }
}

