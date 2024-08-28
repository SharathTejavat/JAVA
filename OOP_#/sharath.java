import java.util.*;
interface Vehicle{

String getCompany();
  String getModel();
 String getType();
 double getConsumption();
 }
 class TW implements Vehicle{
 
  String company,model,type;
  double dis;
  int k;
  public TW(String company, String model,String type, double dis){
  this.company=company;
  this.model=model;
  this.type=type;
  this.dis=dis;
  if(this.type.equalsIgnoreCase("petrol")){
    k=62;
  }
  else if(this.type.equalsIgnoreCase("diesel")){
  k=82;
  }
  else
  k=72;
  }
  
  
  
  public String getCompany(){
  return this.company;
  }
  public String getModel(){return this.model;}
  public String getType() {return this.type;}
  public double getConsumption(){
  return (dis/k);
 }
 }
 class FW implements Vehicle{
 
  String company,model,type;
  double dis;
  int k;
  public FW(String company, String model,String type, double dis){
  this.company=company;
  this.model=model;
  this.type=type;
  this.dis=dis;
  if(this.type.equalsIgnoreCase("petrol")){
    k=62;
  }
  else if(this.type.equalsIgnoreCase("diesel")){
  k=82;
  }
  else
  k=72;
  }
  
  
  
  public String getCompany(){
  return this.company;
  }
  public String getModel(){return this.model;}
  public String getType() {return this.type;}
  public double getConsumption(){
  return (dis/k);
 }
 }
 
 class sharath{
 
   public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   String company=sc.next();
   String model= sc.next();
   String type= sc.next();
   double dis= sc.nextDouble();
   TW t= new TW(company,model,type,dis);
   System.out.println("Company name: "+t.getCompany());
      System.out.println(" model name : "+t.getModel());
         System.out.println("Type of fuel vehcile can consume: "+t.getType());
            System.out.println("fuel consumed by the vehice  : "+t.getConsumption());
   
   }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
