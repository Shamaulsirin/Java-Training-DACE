public class SuperMarket {
  static String name="Reliance Mall";   //non static variables or global variables or fields
  String pname;
  int price;
  int discount;
  public static void main(String[] args) {
    int a=20;
    SuperMarket product1=new SuperMarket();
    product1.pname="rice";
    product1.price=50;
    product1.discount=5;
    System.out.println(product1.pname);

    SuperMarket product2=new SuperMarket();
    product2.pname="biscuits";
    product2.price=10;
    product2.discount=2;
    System.out.println(product2.pname);

    System.out.println(name);


  }
  
}
