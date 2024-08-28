import java.util.Scanner;

class Account{
    double bal;
    String bname,brname,acname,acno,acadd;
    Account(String bname,String brname, String acname,String acno,String acadd,double bal){
        this.bal=bal;
        this.bname=bname;
        this.brname=brname;
        this.acadd=acadd;
        this.acname=acname;
        this.acno=acno;
    }

    void credit(double amount){
        this.bal+=amount;
    }

    void debit(double amount){
        if((this.bal-1000)>=amount){
            this.bal-=amount;
        }else{
            System.out.println("insufficient balanace");
        }
    }

    void getBalance(){
        System.out.println(this.bal);
    }

}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //existing accounts
        Account a[] = new Account[5];   
        a[0] = new Account("SBI", "basar", "xxx", "1234", "basar", 1000);
        a[1] = new Account("SBI", "basar", "yyy", "1234", "basar", 1000);
        a[2] = new Account("SBI", "Nzmbd", "zzz", "1234", "basar", 1000);  
        a[3] = new Account("SBI", "Nzmbd", "www", "1234", "wgl", 1000);
        a[4] = new Account("SBI", "basar", "ppp", "1234", "wgl", 1000);  

        while(true){
            
            System.out.println("enter username and password");
            String username = sc.next();
            String password = sc.next();

            int flag = -1;

            for(int i = 0; i < 5; i++){
                if(username.equalsIgnoreCase(a[i].acname) && password.equalsIgnoreCase(a[i].acno)){
                    flag = i;
                    break;
                }
            }

            if(flag != -1){
                    System.out.println("Your successfully logined and do your activity below and have a nice day sir/Madam");
                while(true){
                    System.out.println("1 for credit\n2 for debit\n3 for balance\nother nums to exit");
                    int k = sc.nextInt();
                    switch(k){
                        case 1:
                            int amt;
                            System.out.println("enter amount");
                            amt = sc.nextInt();
                            a[flag].credit(amt);
                            break;
                        case 2:
                            System.out.println("enter amount");
                            int am = sc.nextInt();
                            a[flag].debit(am);
                            break;
                        case 3:
                            a[flag].getBalance();
                            break;
                        default:
                            k = -1;
                            break;
                    }
                    if(k == -1)
                    System.out.println("Your existing from your Transaction");
                     break;
                }

                int lastchk = 0;
                System.out.println("are you sure to exit(enter 1)");
                lastchk = sc.nextInt();
                if(lastchk == 1){
                    break;
                }
            } else {
                System.out.println("wrong credentials");
            }
        }

    }
}

