package section05;

public class Ex05_04 {
  public static void main(String[] args) {
    
    for (int i = 0; i < 7; i++) { 
      for (int j = 0; j < 6 - i; j++) {
        System.out.print(" ");

      }
      for(int k = 0; k < i * 2 + 1; k++) {
      System.out.print("*");

      }
      // System.out.print("*".repeat(i * 2 + 1));
      System.out.println();
    }



  }
}
