import java.util.regex.*;

public class RegixDemo {
  public static void main(String[] args) {
    String s="Thuppaarkkuth Thuppaaya Thuppaakkith Thuppaarkkuth Thuppaaya Thooum Mazhai";

    Pattern p=Pattern.compile("Thuppa");

    Matcher m=p.matcher(s);

    while(m.find())
    {
      System.out.println(m.group()+" comes at "+m.start()+" ends at"+m.end());
    }
  }
}