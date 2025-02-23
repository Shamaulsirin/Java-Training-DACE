public class StringtoInteger{
  public static void main(String[] args)
  {
    String s="123";  //Integer.valueOf(s);   
    int w=1;
    Integer result=Integer.valueOf(s);
    System.out.println(result+w);

    int p=1234;
    String r=String.valueOf(p);
    System.out.println(r+12);
  }
}

