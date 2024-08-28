import java.util.*;

class product{
    String name,cmpy;
    int qnt;

    product(String name,String cmp,int qnt){
        this.name=name;
        this.cmpy=cmp;
        this.qnt=qnt;
    }
}

class amazon{
    public static double getAmount(product p,boolean h,double amt){
        double tot_amt=p.qnt*100;
        if(h){
            tot_amt*=0.9;
        }
        if(amt>=50000){
            tot_amt*=0.85;
        }
        return tot_amt;
    }
}


class flipkart{
    public static double getAmount(product p,boolean stu,double amt){
        double tot_amt=p.qnt*100;
        if(stu){
            tot_amt*=0.7;
        }
        if(amt>=50000){
            tot_amt*=0.95;
        }
        return tot_amt;
    }
}

class Ecomm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter product name");
        String name=sc.next();
        System.out.println("enter company name");
        String cmp=sc.next();
        System.out.println("enter quantity");
        int qnt=sc.nextInt();

        product p=new product(name,cmp,qnt);

        System.out.println("do you have hdfc card:- ");
        boolean h=sc.nextBoolean();
        System.out.println("are you rgukt student:- ");
        boolean stu=sc.nextBoolean();
        System.out.println("enter total purchase amount");
        int amt=sc.nextInt();

        double amazon_amt=amazon.getAmount(p,h,amt);
        double flipkart_amt=flipkart.getAmount(p,stu,amt);



        if(amazon_amt<flipkart_amt){
            System.out.println("buy on amazon at "+amazon_amt);
        }else{
            System.out.println("buy on flipkart at "+flipkart_amt);
        }
    }
}