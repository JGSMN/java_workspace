package section10.access2;

public class Ex10_09 {
  public static void main(String[] args) {
    Samsong s = new Samsong();
    s.powerOn();

    s.powerOff();

    System.out.println();

    Computer c = new Computer();
    c.powerOn();
    c.powerOff();
  }
}
