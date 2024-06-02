package section06;

import java.util.Arrays;
import java.util.Comparator;

public class Ex06_09 {
  public static void main(String[] args) {
    Integer[] arr = { 5, 3, 2, 4, 1 };

    System.out.println("정렬 전 : " + Arrays.toString(arr));
    
    Arrays.sort(arr, Comparator.reverseOrder());
    
    System.out.println("정렬 후 : " + Arrays.toString(arr));

  }
}
