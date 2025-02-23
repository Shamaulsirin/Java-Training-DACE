import java.util.regex.*;

public class RegixDemo {
  public static void main(String[] args) {
    String s="Tamil is the oldest language ABC &*!@#$%^&*() 1234567890";

    Pattern p=Pattern.compile("tAMIL");
    Pattern p=Pattern.compile("[a-z]");
    Pattern p=Pattern.compile("[A-Z]");
    Pattern p=Pattern.compile("[0-9]");



    Matcher m=p.matcher(s);

    while(m.find())
    {
      System.out.println(m.group()+" comes at "+m.start()+" ends at"+m.end());
    }
  }
}