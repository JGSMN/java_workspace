package section11;

class Pig extends Animal {

}

public class Ex11_16 {
  public static void main(String[] args) {
    Pig p1 = new Pig();
    Pig p2 = new Pig();
    Animal a = p1;

    if (a instanceof Pig) {
      System.out.println("객체 변수 a는 Pig 타입으로 생선된 객체입니다.");
    }
    if (a instanceof Animal) {
      System.out.println("객체 변수 a는 Animal 타입으로 생선된 객체입니다.");
    }
    if (a instanceof Animal) {
      System.out.println("객체 변수 a는 Animal 타입으로 생선된 객체입니다.");
    }
    System.out.println();

    if (a == p1) {
      System.out.println("a와 p1은 같은 객체를 참조하고 있습니다.");
    }
    if (a == p2) {
      System.out.println("a와 p2은 같은 객체를 참조하고 있습니다.");
    }

    System.out.println(a.equals(p2));
    System.out.println(a.equals(p1));
  }

}
