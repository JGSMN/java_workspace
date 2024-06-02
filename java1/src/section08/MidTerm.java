package section08;

public class MidTerm {
  public int score(int[] scores) {
    int result = 0;
    for (int i = 0; i < scores.length; i++) {
      result += scores[i];
    }
    System.out.println(result);
    // 하나의 값만 반환.
    // return 아래에 있는 코드는 실행 X
    // 제어문에서 break와 같은효과
    return result; 
    
    
  }
}
