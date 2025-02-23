package Inheritance;

public class Office {
  final int salary=45000;
  public static void main(String[] args) {
    Office off=new Office();
    off.work();
    off.salary=50000;
  }
  public void work()
  {
    System.out.println("Working in office");
  }
  void recruit()
  {
    System.out.println("Recruitment");
  }
  protected void wfm()
  {
    System.out.println("Work from home");
  }
  private void do_business_plan()
  {
    System.out.println("planning.....");
  }
}
