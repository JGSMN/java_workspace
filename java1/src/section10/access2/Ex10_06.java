package section10.access2;

public class Ex10_06 {
  public static void main(String[] args) {
    Customer c1 = new Customer("김일남", 99, 1);
    Customer c2 = new Customer("김이남", 98, 2);
  
    c1.enter();
    c2.enter();
  }
}
