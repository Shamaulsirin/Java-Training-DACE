import java.util.Arrays;

public class Solution2 {
  public static void main(String[] args) {
    int[] arr={3,0,0,4,5,0,2,1};
    MoveZeroes(arr);
      System.out.println(Arrays.toString(arr));
  }
  public static void MoveZeroes(int[] arr)
  {
    int index=arr.length-1;
    for(int i=arr.length-1;i>=0;i--){
      if(arr[i]!=0){  
      arr[index--]=arr[i];
    }}
    while(index>=0){
      arr[index--]=0;
    }
  }

}
  

