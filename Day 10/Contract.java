public interface Contract {
  public static void main(String[] args) {
    System.out.println("hello");
  }
  static void print(){
    System.out.println("I am from print");
  }
  default void display()
  {
    System.out.println("I am from display");
  }
  
  default void calculate(int a,int b){
    System.out.println(a-b);
  }
  public abstract void result();
  //defendender methods or virtual extension methods
  //we can also hve 
  //we can hve static or non static(default) method in interface
  
}
