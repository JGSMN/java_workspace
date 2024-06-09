package section11;

class Parent {
}

class Child extends Parent {
}

public class Ex11_01 {
  public static void main(String[] args) {
    Parent p1 = new Parent();
    Child c1 = new Child();

    Parent p2 = new Child();
    Parent p3 = c1;// 자동 형 변환

    // Child c2 = (Child) p1; // 런타임에서 에러가 뜸

    Child c3 = (Child) p2;

    if (p3 == c1) {
      System.out.println("p3과 c1은 같은 객체를 참조하고 있습니다.");
    }
  }
}
