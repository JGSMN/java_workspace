package section12.inheritance;

abstract class Bike {
  int wheel;

  Bike(int wheel) {
    this.wheel = wheel;
  }
  void info() {
    System.out.println("이 자전거는 " + wheel + "발 자전거입니다.");
  }
  abstract int getWheel();
}

class ChildBike extends Bike {
  ChildBike(int wheel) {
    super(wheel);
    int getWheel() {
      return wheel;
    }
  }
}

class Practice12_02 {
  public static void main(String[] args) {
    
    Bike b = new ChildBike(2);
    b.info();
    ChildBike cb = new ChildBike(4);
    cb.info();
  }
}
