public class StringToAscii {
  public static void main(String[] args) {
      String input = "Hello";  // Change this to any string
      int asciiSum = 0;
      
      System.out.println("Character to ASCII conversion:");
      for (char ch : input.toCharArray()) {
          int asciiValue = (int) ch;
          asciiSum += asciiValue;  // Summing ASCII values
          System.out.println("'" + ch + "' -> " + asciiValue);
      }
      
      System.out.println("\nTotal ASCII Sum: " + asciiSum);
  }
}
