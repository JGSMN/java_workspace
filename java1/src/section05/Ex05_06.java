package section05;

public class Ex05_06 {
  public static void main(String[] args) {
    int sum = 0;
    int i = 1;

    do {
      sum += i;
      i++;
    } while(i <= 10);
    System.out.println("합 : " + sum);
    
  }
}
