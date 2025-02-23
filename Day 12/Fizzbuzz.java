import java.util.Scanner;

public class Fizzbuzz {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter N: ");
    int N=sc.nextInt();
    for(int i =0;i<=N;i++){

    
    if(i%3==0&&i%5!=0)
    {
      System.out.println("Fizz");
    }
    else if(i%5==0&&i%3!=0)
    {
      System.out.println("Buzz");
    }
    else if(i%3==0&&i%5==0)
    {
      System.out.println("Fizz Buzz");
    }
    else{
      System.out.println(i);
    }
  }
  }
  
}
