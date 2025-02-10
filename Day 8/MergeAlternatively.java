// 2. Merge alternatively
public class MergeAlternatively {
  public static String mergeAlternatively(String word1, String word2) {
      String result = "";
      int i = 0, j = 0;
      while (i < word1.length() || j < word2.length()) {
          if (i < word1.length()) result += word1.charAt(i++);
          if (j < word2.length()) result += word2.charAt(j++);
      }
      return result;
  }

  public static void main(String[] args) {
      System.out.println(mergeAlternatively("abc", "pqr")); // Output: "apbqcr"
  }
}
