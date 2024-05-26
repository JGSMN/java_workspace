package section06;

public class Ex06_17 {
  public static void main(String[] args) {
    int[] score = {90, 92, 93};
    
    int sum = 0;
    double avg = 0;

    for (int num : score) {
      System.out.println(num);
      sum += num;
    }
    avg = (double)sum / score.length;
    System.out.println("총점 : " + sum + ", 평균 : " + avg);

  }
}
