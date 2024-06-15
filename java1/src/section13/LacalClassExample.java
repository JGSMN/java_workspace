package section13;

import section13.local_class.LocalClassExample;

public class LacalClassExample {
  private int speed = 10;

  public void getUnit(String unitName) {
    String newUnitName = unitName + " 님"; // 불변(immutable)
    class Unit {
    public void move() {
    // System.out.println(unitName + "이 " + speed + " 속도로 이동합니다.");
    }
    }
    Unit unit = new Unit();
    unit.move();
    System.out.println(unitName + "이 " + speed + " 속도로 이동합니다.");
  }

  public static void main(String[] args) {
    LocalClassExample local = new LocalClassExample();
    local.getUnit("마린");
  }
}
