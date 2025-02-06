

public class Prime{
  public static void main(String[] args) {    
    int n=11;
    int div=2;
    boolean isprime=true;
    while(div<=n/2){
      if(n%div==0){
        isprime=false;
      }
    }
    /*if(isprime)
    {
      System.out.println("prime");
    }
    else{
      System.out.println("not prime");
    }*/

    System.out.println(isprime?"prime":"not a prime");
    
  }
  
}
