public class ExceptionDemo {
  public static void main(String[] args) {
    int a=10;
    int b=0;
    
    try
    {
      System.out.println(a/b);
    }
    catch(ArithmeticException abc)
    {
      System.out.println("Check b value");
    }
    System.out.println("Hi");

  }
}
