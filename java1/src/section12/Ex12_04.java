package section12;

public class Ex12_04 {
  public static void main(String[] args) {
    PastaRecipe pr = new PastaRecipe("최연석");
    pr.info();
    pr.makeSource();

    System.out.println();

    StakeRecipe sr = new StakeRecipe("이현복");
    sr.info();
    sr.grillStake();

    System.out.println();
    // 추상클래스
    // Recipe r = new Recipe("백종원");
    // r.info();
  }
}
