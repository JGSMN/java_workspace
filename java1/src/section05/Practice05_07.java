package section05;

public class Practice05_07 {
  public static void main(String[] args) {
    // for (int i = 0; i < 4; i++) {
      // for (int j = 3 - i; j > 0; j--) {
      //   System.out.print("  ");

      // }
      // for (int j = 0; j < (2 * i) + 1; j++) {
      //   System.out.print("* ");

      // }
      // System.out.println();
      for (int i = 3, j = 0; j < 4 ;i--, j++) {
        System.out.printf("%s", "  ".repeat(i));
        System.out.printf("%s\n", "* ".repeat(2 * j + 1));
        System.out.println();
        
      }
    }
  }

