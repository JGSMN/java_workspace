package section06;

public class Ex06_04 {
  public static void main(String[] args) {
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();
    // System.out.println(numbers.length);
    for (int i = 0; i < numbers.length; i++) {
     numbers[i] = (int) (Math.random() * 30) + 1;
      
    }
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {  
      sum += numbers[i];
      }

    }
    System.out.println("배열의 짝수의 합 : " + sum);
  }
}
