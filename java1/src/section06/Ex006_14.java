package section06;

public class Ex006_14 {
  public static void main(String[] args) {
    int[][] arr = new int[2][3];
    
    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[0][2] = 3;
    
    arr[1][0] = 11;
    arr[1][1] = 12;
    arr[1][2] = 13;
    // arr[4][0] = 41;
    // arr[4][1] = 42;
    // arr[4][2] = 43;
    
    System.out.println("2차원 배열 : " + arr);
    System.out.println("2차원 배열 1행 : " + arr[0]);
    System.out.println("2차원 배열 2행 : " + arr[1]);
    
    System.out.println("행의 크기 : " + arr.length);
    System.out.println("행의 크기 : " + arr[0].length);
    System.out.println("행의 크기 : " + arr[1].length);
    
    System.out.println("arr[0][0] : " + arr[0][0]);
  }
}
