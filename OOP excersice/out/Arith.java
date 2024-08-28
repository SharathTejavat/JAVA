import java.util.Scanner;
import complex.Arithutil;

public class Arith {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        Arithutil a1=new Arithutil(a,b);
        a=sc.nextInt();
        b=sc.nextInt();
        Arithutil a2=new Arithutil(a,b);
        Arithutil ans=new Arithutil();

        ans.add(a1,a2);
        System.out.println(ans.rp+" "+ans.ip+"i");
        ans.sub(a1,a2);
        System.out.println(ans.rp+" "+ans.ip+"i");
    }    
}
