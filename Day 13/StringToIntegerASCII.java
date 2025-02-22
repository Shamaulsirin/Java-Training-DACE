public class StringToIntegerASCII {
  public static void main(String[] args) {
      String str = "123";
      int number = 0;

      // Convert each character to integer using ASCII values
      for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
          number = number * 10 + (ch - '0'); // Subtracting '0' gives the numeric value
      }

      // Output the result
      System.out.println("Converted integer: " + number);
      System.out.println(number+1);
  }
}
