package section05;

public class Practice05_06 {
  public static void main(String[] args) {
    // System.out.println("012*_");
    // System.out.println("01*_*_");
    // System.out.println("0*_*_*_");
    // System.out.println("*_*_*_*_");
    for (int i = 0; i < 4; i++) {
      for (int j = 3 - i; j > 0; j--) {
        System.out.print(" ");

      }
      for (int j = 0; j < i + 1; j++) {
        System.out.print("* ");

      }
      System.out.println();
    }

  
  
  
  
  
  }
}
