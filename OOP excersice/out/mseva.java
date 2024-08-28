import java.util.*;
import mseva.msevautil;

public class mseva {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean sz,vomit,eye,mus,fev,fat,skin,bp;
        System.out.println("do you have Stomach ache");
        sz=sc.nextBoolean();
        System.out.println("do you have vomiting");
        vomit=sc.nextBoolean();
        System.out.println("do you have  low eye sight");
        eye=sc.nextBoolean();

        System.out.println("do you have  Muscle ache");
        mus=sc.nextBoolean();
        System.out.println("do you have  fever");
        fev=sc.nextBoolean();
        System.out.println("do you have  fatigue");
        fat=sc.nextBoolean();
        System.out.println("do you have  skin allergy");
        skin=sc.nextBoolean();
        System.out.println("do you have  bp");
        bp=sc.nextBoolean();

        msevautil m=new msevautil(sz,vomit,eye,mus,fev,fat,skin,bp);
        if(m.checkAP()){
            System.out.println("\nAcute pancreatitis");
        }
        if(m.checkA()){
            System.out.println("Appendicitis");
        }
        if(m.checkBC()){
            System.out.println("Bladder Cancer");
        }
        if(m.checkPC()){
            System.out.println("Pancreatic Cancer");
        }
    }
}
