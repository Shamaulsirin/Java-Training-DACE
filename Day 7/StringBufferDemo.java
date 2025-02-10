public class StringBufferDemo {
  public static void main(String[] args) {
    String s="hello"; //scp,immutable
    //StringBuilder sb1="abc"; //not valid

    StringBuilder sb=new StringBuilder("abc");
    StringBuilder sb1=new StringBuilder("abc");
    System.out.println(sb==sb1);
    System.out.println(sb.equals(sb1));
    sb.append("abc");
    

    /*if(sb.equals(sb1))
    {
      System.out.println("equal");
    }
    else{
      System.out.println("not equal");
    }*/
    //String s1="abc";
    //String s2=s1;
    //s1="pqr";

    

    
  }
  
}
