// 1. Find the length of the last word
public class LengthOfLastWord {
  public static int lengthOfLastWord(String s) {
      s = s.trim();
      int lastSpace = s.lastIndexOf(" ");
      return s.length() - lastSpace - 1;
  }

  public static void main(String[] args) {
      System.out.println(lengthOfLastWord("Hello World")); // Output: 5
      System.out.println(lengthOfLastWord(" fly me to the moon ")); // Output: 4
  }
}
