package Inheritance;

public class Branch_office extends Office{
  Branch_Office()
  {
    System.out.println("welcome to branch_office");
  }
  public static void main(String[]args)
  {
    Branch_Office bff=new Branch_Office();
    bff.work();
    bff.wfm();
    bff.recruit();  
  }
  
  
}
