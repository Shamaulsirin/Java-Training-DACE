public class String2 {
  public static void main(String[] args) {
    String str="Hello";
    String str1=new String("Hello");

    /*if(str==str1)
    {
      System.out.println("same");
    }
    else{
      System.out.println("Not Same");
    }*/
    if(str.equals(str1))
    {
      System.out.println("same");
    }
    else{
      System.out.println("Not same");
    }
  }
  
}
