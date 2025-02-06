import java.util.Scanner;

public class Divisibility {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a=sc.nextInt();

    if(a%5==0&&a%3==0){
      System.out.println("It is divisible by both 5 & 3");
    }
    else{
      System.out.println("It is not divisible");
    }
  }
  
}
