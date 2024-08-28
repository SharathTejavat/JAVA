import java.util.*;

abstract class customer{
    double incm;
    boolean job_type;
    double bal=0;

    customer(double incm,boolean job_type){
        this.incm=incm;
        this.job_type=job_type;
        this.bal=0;
    }

    void credit(double a){
        this.bal+=a;
    }
    void debit(double a){
        if(a>this.bal){
            System.out.println("insufficient balance");
        }else{
            this.bal-=a;
        }
    }
    void getBalance(){
        System.out.println(this.bal);
    }

    abstract boolean PersonalLoanEligibility();
    abstract boolean homeLoanEligibility();
    abstract boolean vehicleLoanEligibilty();
}

class SBI extends customer{
    SBI(double incm,boolean job_type){
        super(incm,job_type);
    }

    boolean PersonalLoanEligibility(){
        if(job_type==true && incm>1000){
            return true;
        }
        return false;
    }

     boolean homeLoanEligibility(){
        if(job_type==false && incm>1000){
            return true;
        }
        return false;
    }

    boolean vehicleLoanEligibilty(){
        if(job_type==true && incm>1000){
            return true;
        }
        return false;
    }
}

class HDFC extends customer{
    HDFC(double incm,boolean job_type){
        super(incm,job_type);
    }

    boolean PersonalLoanEligibility(){
        if(job_type==true && incm>1000){
            return true;
        }
        return false;
    }

     boolean homeLoanEligibility(){
        if(job_type==true && incm>1000){
            return true;
        }
        return false;
    }

    boolean vehicleLoanEligibilty(){
        if(job_type==true && incm>1000){
            return true;
        }
        return false;
    }
}

class DCB extends customer{
    DCB(double incm,boolean job_type){
        super(incm,job_type);
    }
    
   boolean PersonalLoanEligibility(){
        if(job_type==true && incm>1000){
            return true;
        }
        return false;
    }

     boolean homeLoanEligibility(){
        if(job_type==true && incm>1000){
            return true;
        }
        return false;
    }

    boolean vehicleLoanEligibilty(){
        if(job_type==true && incm>1000){
            return true;
        }
        return false;
    }
}

class RBI{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        SBI c1=new SBI(20000, true);
        System.out.println("sbi home loan "+c1.homeLoanEligibility());
        System.out.println("sbi personal loan "+c1.PersonalLoanEligibility());
        System.out.println("sbi vehicle "+c1.vehicleLoanEligibilty());

        c1.credit(2000);
        c1.debit(1000);
        c1.getBalance();
    }
}