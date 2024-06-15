package section12.multi;

public class Ex12_18 {
  public static void main(String[] args) {
    BluetoothMIC bm = new BluetoothMIC();
    
    bm.music();
    bm.sing();
    System.out.println("------------");

    MicroPhone m = bm;
    // m.music(); 
    m.sing();

    System.out.println("------------");

    Speaker s = bm;
    // s.sing();
    s.music();
  }
}
