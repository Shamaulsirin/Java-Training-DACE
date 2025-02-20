public class ExceptionDemo2 extends ChildDemo{

  public static void main(String[] args) throws ArithmeticException {
    ExceptionDemo2 e=new ExceptionDemo2();

    try{
      e.divide(2,0);
    }
    catch(ArithmeticException ae)
    {
      System.out.println("Check second no");
    }
  }
  public final void work()
  {
    System.out.println("IT");
  }
}