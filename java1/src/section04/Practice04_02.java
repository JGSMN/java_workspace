package section04;

public class Practice04_02 {
  public static void main(String[] args) {
    int score = 77;
    char result = 'A';

    if(score >= 60){
      result = 'D';
      } else if(score >= 70) {
        result = 'C';
      }
    System.out.println(score + "점의 학점은" + result + "입니다.");
  }
}
