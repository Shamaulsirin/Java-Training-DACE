// 3. Product Except Itself
public class ProductExceptSelf {
  public static int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] result = new int[n];
      for (int i = 0; i < n; i++) {
          int product = 1;
          for (int j = 0; j < n; j++) {
              if (i != j) {
                  product *= nums[j];
              }
          }
          result[i] = product;
      }
      return result;
  }

  public static void main(String[] args) {
      int[] nums = {1, 2, 3, 4};
      int[] product = productExceptSelf(nums);
      for (int num : product) {
          System.out.print(num + " "); // Output: 24 12 8 6
      }
      System.out.println();
  }
}