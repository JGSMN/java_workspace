package section11;

public class Ex11_08 {
  public static void main(String[] args) {
    // FourWheelBike fwb = new FourWheelBike("윤기");
    Bike b = new FourWheelBike("윤기");
    b.info();
    b.ride();

    System.out.println();

    FourWheelBike fwb = (FourWheelBike) b;
    fwb.addWheel();
    fwb.info();
    fwb.ride();
  }
}
