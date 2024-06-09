package section11;

public class Ex11_12 {
  public static void main(String[] args) {
    ComputerRoom cr = new ComputerRoom();
    cr.computer1 = new Samsong();
    // cr.computer2 = new Samsong();
    // cr.computer1 = new Lz();
    cr.computer2 = new Lz();

    cr.allPowerOn();
    cr.allPowerOff();
  }

}
