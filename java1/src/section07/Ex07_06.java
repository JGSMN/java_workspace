package section07;

public class Ex07_06 {
  public static void main(String[] args) {
    Car c = new Car();
    System.out.println("wheel의 개수는" + c.wheel + "개입니다.");

    c.wheel = 5;
    System.out.println("wheel의 개수는" + c.wheel + "개입니다");
  }
}
