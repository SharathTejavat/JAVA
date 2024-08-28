import java.util.Scanner;

interface Vechile{
    String getCompany();
    String getModel();
    String getType();
    double getConsumption();
}

class twowheeler implements Vechile{
    String model,company,type;
    double dist;
    twowheeler(String model,String company,String type,double dist){
        this.model=model;
        this.company=company;
        this.type=type;
        this.dist=dist;
    }

    public String getCompany(){
        return this.company;
    }

    public String getModel(){
        return this.model;
    }

    public String getType(){
        return this.type;
    }

    public double getConsumption(){
        String ty=this.type;
        if(ty.equals("petrol"))return this.dist/62;
        if(ty.equals("diesel"))return this.dist/82;
        return this.dist/72;
    }
}

class fourwheeler implements Vechile{
    String model,company,type;
    double dist;
    fourwheeler(String model,String company,String type,double dist){
        this.model=model;
        this.company=company;
        this.type=type;
        this.dist=dist;
    }

    public String getCompany(){
        return this.company;
    }

    public String getModel(){
        return this.model;
    }

    public String getType(){
        return this.type;
    }

    public double getConsumption(){
        String ty=this.type;
        if(ty.equals("petrol"))return this.dist/14;
        if(ty.equals("diesel"))return this.dist/22;
        return this.dist/18;
    }
}

public class VechileMain {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1 for two wheeler\n2 for four wheeler");
            int k=sc.nextInt();
            System.out.println("1 for petrol\n2 for diesel\n3 for cng");
            int pp=sc.nextInt();
            System.out.println("enter dist");
            double dist=sc.nextDouble();

            if(k==1){
                twowheeler tw;
                if(pp==1){tw=new twowheeler("x", "abc", "petrol", dist);}
                else if(pp==2){ tw=new twowheeler("x", "abc", "diesel", dist);}
                else if(pp==3){ tw=new twowheeler("x", "abc", "cng", dist);}
                else tw=new twowheeler("x", "abc", "cng", dist);

                System.out.println("company "+tw.getCompany());
                System.out.println("Consumption " +tw.getConsumption());
                System.out.println("model "+tw.getModel());
                System.out.println("type "+tw.getType());
            }else if(k==2){
                fourwheeler fw;
                if(pp==1){fw=new fourwheeler("x", "abc", "petrol", dist);}
                else if(pp==2){ fw=new fourwheeler("x", "abc", "diesel", dist);}
                else if(pp==3){ fw=new fourwheeler("x", "abc", "cng", dist);}
                else fw=new fourwheeler("x", "abc", "cng", dist);

                System.out.println("company "+fw.getCompany());
                System.out.println("Consumption " +fw.getConsumption());
                System.out.println("model "+fw.getModel());
                System.out.println("type "+fw.getType());
            }else{
                System.out.println("wrong input ....");
            }
        }
    }
}
