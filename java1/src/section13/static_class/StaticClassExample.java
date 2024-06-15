package section13.static_class;
class PrintOut {
  public static class StaticInner {
    public void println(String str) {
      System.out.println(str);
    }
  }
}
public class StaticClassExample {
  public static void main(String[] args) {
    PrintOut.StaticInner out = new PrintOut.StaticInner();
    out.println("정적 내부 클래스 테스트");
    
  }
}
