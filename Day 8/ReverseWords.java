// 5. Reverse words in a sentence
public class ReverseWords {
  public static String reverseWords(String s) {
      String[] words = s.split(" ");
      String result = "";
      for (int i = words.length - 1; i >= 0; i--) {
          result += words[i] + " ";
      }
      return result.trim();
  }

  public static void main(String[] args) {
      System.out.println(reverseWords("Today is Holiday")); // Output: "Holiday is Today"
  }
}