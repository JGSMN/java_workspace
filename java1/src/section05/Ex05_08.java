package section05;

import java.util.Scanner;

public class Ex05_08 {
  public static void main(String[] args) {
    // 0.0 <= random value < 1.0
    double magicNumber = (int) (Math.random() * 10) + 1;
    System.out.println(magicNumber);

    Scanner sc = new Scanner(System.in);
    System.out.println("찾는 숫자를 입력 >>> ");
    int guess = sc.nextInt();
    for (int i = 0; i < 10; i++) {
      boolean isMatched = false;
      

      if (guess == magicNumber) {
        System.out.println((i + 1) + "번째에 맞췄습니다!");
        break;
      } else if (guess > magicNumber) {
        System.out.println("맞춰야할 숫자가 더 작습니다.");
      } else {
        System.out.println("맞춰야할 숫자가 더 큽니다.");

      }
      if (isMatched) {
        System.out.println("정답을 맞추지 못했습니다!");

      }
    }
  }
}
