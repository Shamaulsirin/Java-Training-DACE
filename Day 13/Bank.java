public class Bank {
  private int minbalance=2000;
  private int balance=10000;

  public Bank()
  {
    System.out.println("Welcome to bank");     
  }
  ///getter()
  public int getMinbalance()
  {
    return this.minbalance;
  }
  //getter()
  public int getBalance()
  {
    return this.balance;
  }
  //setter()
  public void setAmount(int amount)
  {
    this.balance=this.balance+amount;
  }
}
