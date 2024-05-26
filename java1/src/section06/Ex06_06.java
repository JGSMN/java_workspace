package section06;

public class Ex06_06 {
  public static void main(String[] args) {
    int[] arr = { 5, 3, 2, 4, 1 };

    int temp = 0;
    for (int i = arr.length - 1; i > 0; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }
}
