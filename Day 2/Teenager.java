import java.util.Scanner;
public class Teenager {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your age:");
    int age=sc.nextInt();
    
    if(age>12&&age<20)
    {
      System.out.println("You are a teenager");

    }
    else{
      System.out.println("You are not a teenager");
    }
  }
}
