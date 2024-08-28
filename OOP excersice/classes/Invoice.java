class Invoice{
  private  String id,desc;
  private int qty;
  private double up;
  public Invoice(String id, String desc, int qty,double up){
  this.id=id;
  this.desc=desc;
  this.qty=qty;
  this.up=up;
  }
 public String getId(){return id;}
 public String getDesc(){return desc;}
 public int getQty(){return qty;}
 public void setQty(int qty){ qty=qty;}
 public double getUp(){ return up;}
 public void setUp(double up){ up=up;}
 public double getTotal(){ return up*qty;}
 public String toString(){
 return "InvoiceItem[id="+id+",desc="+desc+",qty="+qty+",up="+up+"]";
 }
}
public class TestMain {
   public static void main(String[] args) {
      // Test constructor and toString()
      Invoice inv1 = new Invoice("A101", "Pen Red", 888, 0.08);
      System.out.println(inv1);  // toString();

      // Test Setters and Getters
      inv1.setQty(999);
      inv1.setUp(0.99);
      System.out.println(inv1);  // toString();
      System.out.println("id is: " + inv1.getId());
      System.out.println("desc is: " + inv1.getDesc());
      System.out.println("qty is: " + inv1.getQty());
      System.out.println("unitPrice is: " + inv1.getUp());

      // Test getTotal()
      System.out.println("The total is: " + inv1.getTotal());
   }
}
