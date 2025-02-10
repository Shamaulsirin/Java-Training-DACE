// 4. Shift characters by n positions
public class ShiftString {
  public static String shiftString(String str, int n) {
      String result = "";
      for (char c : str.toCharArray()) {
          result += (char) (c + n);
      }
      return result;
  }

  public static void main(String[] args) {
      System.out.println(shiftString("abc", 3)); // Output: "def"
  }
}