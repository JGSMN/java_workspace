package section12;

public class Ex12_14 {
  public static void main(String[] args) {

    Person kim1 = new Person(new ApplePhone());
    kim1.turnOnPhone();
    // Person kim2 = new Person(new ThreeStarPhone());
    // kim2.turnOnPhone();
    for(int i = 1; i < 6; i++) {
      kim1.watchUtube();
      if(i % 3 ==0) {
        kim1.chargePhone();
      }
    }
    kim1.buyNewPhone(new ThreeStarPhone());
    kim1.turnOnPhone();

    for(int i = 1; i < 5; i++) {
      kim1.watchUtube();

      if(i % 3 == 0) {
        kim1.chargePhone();
      }
    }
  }
}
