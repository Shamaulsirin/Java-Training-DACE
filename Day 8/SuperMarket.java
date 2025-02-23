public class SuperMarket {
  static String name="Reliance Mall";   //non static variables or global variables or fields
  String pname;
  int price;
  int discount;

  SuperMarket(){
    System.out.println("I am hello");
  }
  SuperMarket(String pname,int price,int discount)
  {
    this.pname=pname;
    this.price=price;
    this.discount=discount;
  }
  public static void main(String[] args) {
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
