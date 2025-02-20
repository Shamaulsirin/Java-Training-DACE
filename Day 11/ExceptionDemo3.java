public class ExceptionDemo3 {
  public static void main(String[] args) {
    LowAttendanceException l=new LowAttendanceException("Check my attendance");
    try{
      l.checkAttendance(60);
    }
    catch(LowAttendanceException le){
      System.out.println("Ready to pay fine");
    }
}
}
class LowAttendanceException extends RuntimeException
{
  public LowAttendanceException(String msg)
  {
    System.out.println(msg);
  }
  public void checkAttendance(int percentage)
  {
    if(percentage>60)
    {
      System.out.println("Allow for exam");
    }
    else{
        throw new LowAttendanceException("Attendance is low");
      }
  }
}
