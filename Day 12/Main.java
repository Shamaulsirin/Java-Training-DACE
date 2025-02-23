import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int N=sc.nextInt();

    System.out.println("Enter option (1 or 2): ");
    int option=sc.nextInt();

    if(option==1){
      System.out.println(N-(N-1)+(N-2)-(N-3)+(N-4)-1);
    }
    else if(option==2)
    {
      System.out.println(N+(N-1)-(N-2)+(N-3)-(N-4)+1);
    }
    else{
      System.out.println("Choose correct option");
    }

  
  }
}