package section11;

class Animal {
  void cry() {

  }
}

class Pig extends Animal {
  @Override
  void cry() {
    System.out.println("꿀꿀");
  }
}

class Cow extends Animal {
  @Override
  void cry() {
    System.out.println("음메");
  }
}

class Farm {
  void sound(Animal animal) {
    animal.cry();
  }
}

public class Ex11_17 {
  public static void main(String[] args) {
    Farm f = new Farm();
    Pig p = new Pig();
    Cow c = new Cow();

    f.sound(p);
    f.sound(c);
  }

}
