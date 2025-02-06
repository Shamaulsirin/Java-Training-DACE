import java.util.Scanner;
public class VowelConsonant {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an alphabet: ");
    String c=sc.nextLine().toLowerCase();

    if(c.length()>1)
    {
      System.out.println("Enter a single character");
    }
    else if (!Character.isLetter(c.charAt(0))) {
      System.out.println("Enter a valid character");
    }
    else if(c.equals("a")||c.equals("e")||c.equals("i")||c.equals("o")||c.equals("u"))
    {
      System.out.println("It is a vowel");
    }
    else
    {
      System.out.println("It is a consonant");
    }
  }
  
}
