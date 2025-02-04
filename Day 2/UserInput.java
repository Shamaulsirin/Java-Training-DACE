import java.util.Scanner;
public class UserInput {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //integer
    System.out.println("Enter the integer: ");
    int a =sc.nextInt();
    System.out.println("Integer: "+a);
    sc.nextLine();
    

    //float
    //System.out.println("Enter the float: ");
    //float f=sc.nextFloat();
    //System.out.println(f);

    //String
    System.out.println("Enter a string: ");
    String s=sc.nextLine();
    System.out.println("String: "+s);

    //char
    System.out.println("Enter a character: ");
    char c=sc.next().charAt(0);
    System.out.println("Character: "+c);

  }
  
}
