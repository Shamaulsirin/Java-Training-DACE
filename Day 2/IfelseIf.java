public class IfelseIf {

  public static void main(String[] args) {
    int a =10,b=20,c=30;
    if(a>b&&a>c){
      System.out.println("a is greater"); //or sysout(b+" is greater");
    }
    else if(b>a&&b>c){
      System.out.println("b is greater");
    }
    else{
      System.out.println("c is greater"); //or sysout(c+" is greater");
    }
  }
}