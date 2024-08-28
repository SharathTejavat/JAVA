
import java.util.*;
abstract class Employee{

abstract void getAmount(int h, int w);

}
class WE extends Employee{
  
  public void getAmount(int h, int w){
  System.out.println("Amount is paid for Weekly Employee");
  System.out.println("NO.OF Weekly hours: "+w);
  System.out.println("amount for a week:"+ h+"/--");
  System.out.println("Amount is paid for a employee is:"+h*w+"/--");
  
  
  }
  

}
class HE extends Employee{

  public HE(){System.out.println("your now at hours");}
    public void  getAmount(int h, int w){
    System.out.println("Amount is paid for Hourly Employee");
  System.out.println("NO.OF  hours: "+w);
  System.out.println("Amount for a hour:"+ h+"/--");
  System.out.println("Amount is paid for a employee is:"+h*w+"/--");
  
    } 

}
class employee {

            public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("enter amount for hourly emplloyee");
            int k=sc.nextInt();
                System.out.println("enter no.of hours");
                int s=sc.nextInt();
                
              System.out.println("enter amount for weekly emplloyee");
            int k1=sc.nextInt();
                System.out.println("enter no.of weeks");
                int s1=sc.nextInt();
                HE h=new HE();
                WE w= new WE();
                w.getAmount(k1,s1);
                h.getAmount(k,s);
                  
 }
 }
