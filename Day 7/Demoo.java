public class Demoo {
  static{
    System.out.println("hello world from static block");
  }
  {
    System.out.println("hello world from non static block-1");
  }
  {
    System.out.println("hello world from non static block-2");
  }
  public static void main(String[] args) {
    Demoo d=new Demoo();
    Demoo d1=new Demoo();
  }
}
