package section12;

public class ApplePhone implements Phone {
  int batteryCapcity = 40;
  boolean isOn = false;

  @Override
  public void powerOn() {
    if (batteryCapcity > 30) {
      System.out.println("🍎Power on!!\n");
      isOn = true;
    } else {
      System.out.println("Low battery...");
    }
  }

  @Override
  public void powerOff() {
    System.out.println("🍎Power OFF!!\n");
    isOn = false;
  }

  @Override
  public boolean isOn() {
    if (isOn) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void watchUtube() {
    if (batteryCapcity > 15) {
      System.out.println("--- watching Utube ---");
      batteryCapcity -= 10;
      System.out.println("battery is..." + batteryCapcity + "%\n");
    } else {
      System.out.println("Low battery.");
      powerOff();
    }
  }

  @Override
  public void charge() {
    if (batteryCapcity < Phone.MAX_BATTERY_CAPACITY - 20) {
      System.out.println("--- Charging ---");
      batteryCapcity += 10;
      System.out.println("Charged..." + batteryCapcity + "%\n");
    } else {
      System.out.println("You don't have to charge");
      System.out.println("It's enough..." + batteryCapcity + "%\n");
    }
  }

}
