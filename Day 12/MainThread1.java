public class MainThread1 {
  public static void main(String[] args) throws InterruptedException {
    ChildThread1 ct1=new ChildThread1();
    ct1.start();
    System.out.println(ct1.getState());
    System.out.println(ct1.getName());
    //Thread.yield();
    //ct1.interrupt();
    ct1.join();
    for(int i=1;i<=5;i++)
    {
      System.out.println("MainThread "+i);
    }
  }
}         
  class ChildThread1 extends Thread{
    @Override
    public void run()
    {
      for(int i=1;i<=5;i++)
      {
        try{
          Thread.sleep(1000);
        }
        catch(InterruptedException ie)
        {         
          System.out.println("Interuppted my sleep");
        }
        System.out.println("Childthread "+i);
      }
    }
  }
  

