package section05;

public class ExForComma {
  public static void main(String[] args) {
    for (int i = 0, j = 10; i<= 30; i++, j--) {
      System.out.printf("i = %d, j = %d\n", i, j);
    }
  }
}
