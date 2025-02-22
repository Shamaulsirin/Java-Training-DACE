import java.util.Scanner;

public class ShiftString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the shift value: ");
        int shift = scanner.nextInt();

        scanner.close();
 
        System.out.println("Output: " + shiftString(str, shift));
    }

    public static String shiftString(String str, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            char shiftedChar = (char) (ch + shift);

            if (shiftedChar > 'z') {
                shiftedChar = (char) ('a' + (shiftedChar - 'z' - 1));
            }

            result.append(shiftedChar);
        }
        return result.toString();
    }
}
