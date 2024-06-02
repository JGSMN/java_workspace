package section08;

public class Ex08_03 {
  public static void main(String[] args) {
    Jogger jogger = new Jogger();
    jogger.name = "김일남";
    jogger.sayName();
    jogger.run();

    System.out.println();

    Jogger kim2 = new Jogger();
    kim2.name = "김이남";
    kim2.sayName();
    kim2.run();

  }
}
