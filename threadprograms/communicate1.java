import java.io.*;
import java.lang.*;

class communicate1
{
       public static void main(String args[]) throws Exception
       {
           Producer obj1=new Producer();
           Consumer obj2=new Consumer(obj1);
 
           Thread t1=new Thread(obj1);
           Thread t2=new Thread(obj2);

                   t2.start();
                   t1.start();
     }
}


class Producer extends Thread
{
   StringBuffer sb;
  boolean dataprodover=false;

     Producer()
     {
                sb=new StringBuffer();
     }
    public void run()
    {
                   System.out.println("producer started producing data");
               for(int i=1;i<=10;i++)
              {
                        try
                          {
                             sb.append(i+":");
                               Thread.sleep(1000);
                               System.out.println("appending : "+ i);
                              }
                    catch(Exception e)
                     {}
              }
                   System.out.println("producer finihed with producing data");
                  dataprodover=true;
         }
}


class Consumer extends Thread
{
    Producer prod;
        Consumer(Producer prod)
       {
                this.prod=prod;
       }
  public void run()
  {
        try
       {
               while(!prod.dataprodover)
               {
                   Thread.sleep(10000);
                }}
                 catch(Exception e)
                  {}
                 System.out.println("Consumer now consuming"+prod.sb);
  }
}
    
       
