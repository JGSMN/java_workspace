package section08;

public class Ptartice08_04 {
  public static void main(String[] args) {
    Calc c = new Calc();
    int result = c.plus(1,2);
    System.out.println("반환받은 결과는 " + result + "입니다.");
class Calc{
  int plus(int num1, int num2) {
    int res = num1 + num2;
    return res;

  }
  
}
System.out.println("계산 결과는 " + res + "입니다.");
  }
}

  

