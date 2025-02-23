public class RomantoInteger {
  public static int convert(String s) {
      int total = 0;
      int prevValue = 0;
      
      for (int i = s.length() - 1; i >= 0; i--) {
          int currentValue = getValue(s.charAt(i));
          
          if (currentValue < prevValue) {
              total -= currentValue;
          } else {
              total += currentValue;
          }
          
          prevValue = currentValue;
      }
      
      return total;
  }

  private static int getValue(char c) {
      switch (c) {
          case 'I': return 1;
          case 'V': return 5;
          case 'X': return 10;
          case 'L': return 50;
          case 'C': return 100;
          case 'D': return 500;
          case 'M': return 1000;
          default: return 0; // Should never be reached for valid inputs
      }
  }

  public static void main(String[] args) {
      System.out.println(romanToInt("III"));      // Output: 3
      System.out.println(romanToInt("LVIII"));    // Output: 58
      System.out.println(romanToInt("MCMXCIV"));  // Output: 1994
  }
}
