package section12;

public interface Phone {
  public static final int MAX_BATTERY_CAPACITY = 100;

  public abstract void powerOn();

  public abstract void powerOff();

  abstract boolean isOn();

  abstract void watchUtube();

  void charge();

}
