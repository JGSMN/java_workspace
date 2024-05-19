package section05;

public class Ex05_05 {
  public static void main(String[] args) {
    int sum = 0;
    int i = 1;

    // while (true) { // 무한루프
    //   System.out.println("*");
    // }

    do {
      sum += i;
      i++;
      } while(i <= 10);
      System.out.println("합 : " + sum);
  }
}
