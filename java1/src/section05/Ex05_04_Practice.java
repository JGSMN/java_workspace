package section05;

public class Ex05_04_Practice {
  public static void main(String[] args) {
    // System.out.println("000000*");          // 6, 1
    // System.out.println("00000***");         // 5, 3
    // System.out.println("0000*****");        // 4, 5
    // System.out.println("000*******");       // 3, 7
    // System.out.println("00*********");      // 2, 9
    // System.out.println("0***********");     // 1, 11
    // System.out.println("*************");    // 0, 13
    for (int i = 0; i < 7; i++) { 
      for (int j = 0; j < 6 - i; j++) {
        System.out.print(j);

      }
      for(int k = 0; k < i * 2 + 1; k++) {
      System.out.print("*");

      }
      // System.out.print("*".repeat(i * 2 + 1));
      System.out.println();
    }

    }

  }
