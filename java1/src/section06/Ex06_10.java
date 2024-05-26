package section06;

import java.util.Arrays;

public class Ex06_10 {
  public static void main(String[] args) {
    int[] arr01 = {1, 2, 3};
    
    int[] arr02 = arr01;

    System.out.println("arr01 배열 : " + Arrays.toString(arr01));

    arr01[0] = 0;
    
    System.out.println("arr02 배열 : " + Arrays.toString(arr02));
    
  }
}
