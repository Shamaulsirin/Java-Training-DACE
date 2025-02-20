import java.util.Arrays;

public class Solution1 {
  public static void main(String[] args) {
    int[] arr={3,0,0,4,5,0,2,1};
    MoveZeroes(arr);
      System.out.println(Arrays.toString(arr));
  }
  public static void MoveZeroes(int[] arr)
  {
    int index=0;
    for(int num:arr){
      if(num!=0){
        arr[index++]=num;
        
      }
    }
    while(index<arr.length){
      arr[index]=0;
      index++;
    }
  }

}
  

