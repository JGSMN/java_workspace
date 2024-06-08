package section11;

public class Ex11_05 {
  public static void main(String[] args) {
    DeskCalendar dc = new DeskCalendar("보라색", 6);
    dc.info();
    dc.hanging();
    dc.onTheDesk();

    System.out.println();

    Calendar c = new DeskCalendar("검은색", 12);
    c.info();
    c.hanging();
    // c.onTheDesk(); // DeskCalendar(자식) 가 Calender(부모) 안에 포함되어있기 때문에 사용불가 오버라이딩 된것은 호출가능?
  }
}
