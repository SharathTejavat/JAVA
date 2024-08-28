class Account{

String id,name;
double bal=0;
 public Account(String id, String name){ this.id=id;
 this.name=name;
 }
 public Account(String id, String name, double bal){
 this.id=id;
 this.name=name;
 this.bal=bal;
 }
 public String getId(){ return id;}
 public String getName(){ return name;}
 public double getBalance(){ return bal;}
 public void credit(int amount){ bal+=amount;
    
 }
 public void debit(int amount){
 if(amount<=bal){
    bal-=amount;
 } else{
 System.out.println("Amount exceeded balance");
 }
 }

 public void transferTo(Account a1, int amount){
    if(amount <= bal){
     this.bal-=amount;
     a1.credit(amount);
    System.out.println("Transferred $" + amount + " to Account " + a1.getId());
            System.out.println("New Balance: $" + bal);
        } else {
            System.out.println("Invalid amount for transfer or insufficient funds.");
        }
    }
 }
 public class TestMain {
   public static void main(String[] args) {
      // Test constructor and toString()
      Account a1 = new Account("A101", "Tan Ah Teck", 88);
      //System.out.println(a1);  // toString();
      Account a2 = new Account("A102", "Kumar"); // default balance
      //System.out.println(a2);

      // Test Getters
      System.out.println("ID: " + a1.getId());
      System.out.println("Name: " + a1.getName());
      System.out.println("Balance: " + a1.getBalance());

      // Test credit() and debit()
      a1.credit(100);
      System.out.println(a1);
      a1.debit(50);
      System.out.println(a1);
      a1.debit(500);  // debit() error
      System.out.println(a1);

      // Test transfer()
      a1.transferTo(a2, 100);  // toString()
      System.out.println(a1);
      System.out.println(a2);
   }
}


