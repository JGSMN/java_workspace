package section08;

public class Ex08_17 {
  public static void main(String[] args) {
    int[] studentA = {97, 53};
    int[] studentB = {95, 66};
    
    MidTerm mid = new MidTerm();
    int sumA = mid.score(studentA);
    int sumB = mid.score(studentB);
    
    System.out.println(sumA);
    System.out.println(sumB);
    
    if (sumA > sumB) {
      System.out.println("A학생의 중간고사 총점이 더 높습니다");
    } else if (sumA < sumB) {
      System.out.println("B학생의 중간고사 총점이 더 높습니다");
    } else {
      System.out.println("두 학생의 중간고사 총점이 같습니다");
      
    }
  }
}
