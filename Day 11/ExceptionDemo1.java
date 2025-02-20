import java.util.Scanner;

public class ExceptionDemo1 {

  public static void main(String[] args) {
    divide();
  }
  public static void divide()
  {
    Scanner sc=new Scanner(System.in);

    try{
      int a=sc.nextInt();
      int b=sc.nextInt();
      int result=a/b;

      int arr[]=new int[-1];
      for(int i=0;i<10;i++)
      {
        System.out.println(arr[i]);
      }
      Class.forName("ExceptionDemo1");
    }
    catch(ClassNotFoundException ce)
    {
      System.out.println("Class not found");
    }
    catch(NegativeArraySizeException na)
    {
      System.out.println("Check the array size");
    }
    catch(ArithmeticException ae)
    {
      System.out.println("Check vaue of b");
    }
    catch(ArrayIndexOutOfBoundsException aio)
    {
      System.out.println("Check the loop");
    }
    catch(Exception e)
    {
      System.out.println("Soething went wrong");
    }
    finally{
      System.out.println("I am done"); 
    }
  }
}