import java.util.Scanner;
class Arrays{
  public static void main(String[] args){
    Scanner read=new Scanner(System.in);
    int n=read.nextInt();
    int[] array=new int[n];
     int sum=0;
    for(int i=0;i<n;i++){
      array[i]=read.nextInt();
       sum+=array[i];
    }
   // int sum=0;
    /*for(int i=0;i<n;i++){
      sum+=array[i];
    }*/
    System.out.println(sum);
  
  }
  }
