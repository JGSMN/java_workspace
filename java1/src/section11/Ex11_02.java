package section11;

class Car {
}

class Bus extends Car {
}

class SchoolBus extends Bus {
}

class OpenCar extends Car {
}

class SportCar extends OpenCar {
}

public class Ex11_02 {
  public static void main(String[] args) {
    Car c1 = new SchoolBus();

    Bus b1 = new Bus();
    Bus b2 = new SchoolBus();

    Car c2 = new OpenCar();
    OpenCar oc = new SportCar();

    // Bus b3 = new OpenCar();
    // Bus b4 = new SportCar();

    // OpenCar oc2 = new Bus();
    // SportCar sc = new SchoolBus();
  }
}
