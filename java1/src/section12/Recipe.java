package section12;

public abstract class Recipe {
  String chef;

  Recipe(String chef) {
    this.chef = chef;
  }

  void info() {
    System.out.println("이 레시피는 " + chef + "셰프님의 레시피입니다.");
  }

  abstract void recipe();
}
