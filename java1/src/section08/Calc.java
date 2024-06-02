package section08;

import java.util.Arrays;

public class Calc {
  void sum(int num1, int num2) {
    System.out.println("두 수의 합은 " + (num1 + num2) + "입니다");
  }
  void numbers(int[] numbers) {
    System.out.println("입력한 수는 " + Arrays.toString(numbers) + "입니다");
  }
}
