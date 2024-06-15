package section12.inheritance;

public class Ex12_23 {
  public static void main(String[] args) {
    System.out.println("---TJmic 객체---");
    TJmic tj = new TJmic();
    tj.connect();
    tj.music();
    tj.sing();
    System.out.println("\n---TJmic 객체를 BluetoothMIC로 타입 변환");
    BluetoothMIC bm = tj;
    bm.connect();
    bm.music();
    bm.sing();

    System.out.println("\n---TJmic 객체를 Microphone 으로 타입 변환---");
    Microphone m = tj;
    // m.connect();
    // m.music();
    m.sing();

    System.out.println("\n---TJmic 객체를 Speaker로 타입 변환");
    Speaker s = tj;
    // s.connect();
    s.music();
    // s.sing();
  }

}
