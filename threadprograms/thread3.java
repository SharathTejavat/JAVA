import java.io.*;

class MyThread implements Runnable
{
   String str;
    MyThread(String str)
     {
            this.str=str;
      }
     public void run()
     { 
         for(int i=1; i<=10;i++)
         {
                 System.out.println(str+" to audience with ticket number "+i);
                  try
                  {
                       Thread.sleep(1000);
                   } catch(Exception e)
                      { System.out.println(e);}
           }
       }
}

class thread3
{
    public static void main(String args[])
    {
         MyThread obj1=new MyThread("Issue the ticket");
          MyThread obj2=new MyThread("Deliver the snacks");
           
                 Thread t1=new Thread(obj1);
                 Thread t2=new Thread(obj2);

                        t1. start();
                        t2.start();
       }
}
