class Myclass extends Thread
{
      int count=0;
        public void run()
        {
              for(int i=1;i<=10000;i++)
              {
                 count++;
              }
                 System.out.println("completed thread :" +  Thread.currentThread().getName()+"its priority"+Thread.currentThread().getPriority());
}
}

class Priority
{
      public static void main(String args[])
     {
                Myclass obj=new Myclass();

                   Thread t1=new Thread(obj,"ONE");
                   Thread t2=new Thread(obj, "TWO");
             
                   t1.setPriority(1);
                   t2.setPriority(Thread.MAX_PRIORITY);

                    t1.start();
                    t2.start();
     }
}
