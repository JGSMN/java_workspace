package section05;

public class Practice05_03 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {

      if (i % 2 != 0) {
        continue;
      }
      sum += i;
    }
    System.out.println("1~100 짝의 합" + sum);

  }
}
