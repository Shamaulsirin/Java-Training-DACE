public class SumNonRepeating {
  public static void main(String[] args) {
      int[] arr = {1, 1, 2, 3, 2, 4};
      System.out.println("Sum of non-repeating numbers: " + findSumOfNonRepeating(arr));
  }

  public static int findSumOfNonRepeating(int[] arr) {
      int sum = 0;

      for (int i = 0; i < arr.length; i++) {
          int count = 0;

          // Count how many times arr[i] appears in the array
          for (int j = 0; j < arr.length; j++) {
              if (arr[i] == arr[j]) {
                  count++;
              }
          }

          // If the number appears exactly once, add it to sum
          if (count == 1) {
              sum += arr[i];
          }
      }
      return sum;
  }
}
