package section11;

class Animal {
  void sound() {

  }
}

class Pig extends Animal {
  @Override
  void sound() {
    System.out.println("꿀꿀");
  }
}

class Cow extends Animal {
  @Override
  void sound() {
    System.out.println("음머");
  }
}

class Cat extends Animal {
  @Override
  void sound() {
    System.out.println("야옹");
  }
}

class Farm {
  void sound(Animal animal) {
    // if (animal instanceof Pig) {
    // System.out.println("꿀꿀");
    // } else {
    // System.out.println("음머");
    // }
    animal.sound();

  }
}

public class Ex11_15 {
  public static void main(String[] args) {
    Farm f = new Farm();
    Pig p = new Pig();
    Cow c = new Cow();
    Cat cat = new Cat();

    f.sound(p);
    f.sound(c);
    f.sound(cat);

  }
}
