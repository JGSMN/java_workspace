package section09;

import section08.Book;

class book{
  String str1 = "제목없음";
  int num1 = 1;
  int num2 = 100;

    OverTest(String s) {
    str1 = s;
  }
    OverTest(int n1, String s, int n2) {
    num1 = n1;
    num2 = n2;
  }
    OverTest(int n1, int n2, String s) {
    num1 = n1;
    num2 = n2;
  }
    OverTest(String s, int n2, int n1) {
    num1 = n1;
    num2 = n2;
  }

}

public class OverLoadingEx {
  public static void main(String[] args) {
    OverTest b1 = new OverTest("자바");
    System.out.println(b1.str1 + ", " + b1.num1 + ", " + b1.num2);
  System.out.println();    
    OverTest b2 = new OverTest(10,100);
    System.out.println(b1.str1 + ", " + b1.num1 + ", " + b1.num2);
  System.out.println();    
  }
}
