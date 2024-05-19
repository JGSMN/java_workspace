package section05;

public class Ex05_01 {
  public static void main(String[] args) { // 이 중괄호 안의 것을 실행
    int sum = 0;

    for (int i = 1; i <= 100; i++){
    if (i % 2 == 0) 
    
    sum += i;
    }
    System.out.println("합 : " + sum);
  }
}