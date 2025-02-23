@FunctionalInterface
public interface Citizen1 {
  default void rule1()
  {

  }
  default void rule2()
  {

  }
  static void rule3(){

  }
  static void rule4(){

  }
  abstract void rule5();    //functional interface: only one abstract method and can have any no. of default and static methods
  
}
