import java.util.Scanner;

public class Solution {
    
    public static int calculateResult(int N, int option) {
        if (option == 1) {
            return N - (N - 1) + (N - 2) - (N - 3) + (N - 4) - 1;
        } else if (option == 2) {
            return N + (N - 1) - (N - 2) + (N - 3) - (N - 4) + 1;
        } else {
            throw new IllegalArgumentException("Invalid option. Choose 1 or 2.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number: ");
        int N = sc.nextInt();
        
        System.out.print("Enter option (1 or 2): ");
        int option = sc.nextInt();
        
        try {
            int result = calculateResult(N, option);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}
