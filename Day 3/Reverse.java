//Write a prg to reverse a number

import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();    //n=123     
    int sum=0;
    int rem=0;
    while(n!=0)
    {
      rem=n%10;        //3//2//1
      sum=sum*10+rem;  //3//32//321
      n=n/10;          //12//1
    }
    System.out.println(sum);
    
  }
}
