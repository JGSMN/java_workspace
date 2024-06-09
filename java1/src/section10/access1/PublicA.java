package section10.access1;

public class PublicA {
  public int a;

  private PublicA(int a) {
    this.a = a;
  }

  public void printA() {
    System.out.println("PublicA 클래스의 PrintA()매서드입니다");

  }

  public static void main(String[] args) {
    PublicA a = new PublicA(10);
    a.printA();
  }

  // DefaultC dc = new DefaultC();
  // void methodA() {
  // dc.variableC = 20;
  // }

  // public int a;
  // PublicA() {

  // }

  // public PublicA(int a) {
  // this.a = a;
  // }
  // public void printA() {
  // System.out.println("PublicA 클래스의 PrintA()메서드입니다.");

  // }
}
