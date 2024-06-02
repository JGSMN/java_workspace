package section07;

public class Calculator {
public static void main(String[] args) {
  onCalc();
  System.out.println(2 * pie());
    System.out.println(add(2, 3));
    offCalc("김삼남");

}
  static void onCalc() {
    System.out.println("계산기 전원이 켜졌습니다");
  }

  static double pie() {
    return 3.14;
  }
  static int add(int num1, int num2) {
    return num1 + num2;
  }
  static void offCalc(String name) {
    String owner = name;
    System.out.println(owner + "님 안녕히 계세요!");
  }
}
