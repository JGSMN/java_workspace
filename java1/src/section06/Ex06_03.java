package section06;

public class Ex06_03 {
  public static void main(String[] args) {
    int[] intArray = new int[5];
    intArray[3] = 3;
    intArray[4] = 4;


    System.out.println("intArray[0] : " + intArray[0]);
    System.out.println("intArray[1] : " + intArray[1]);
    
    // System.out.println(intArray[2]);
    // System.out.println(intArray[3]);
    // System.out.println(intArray[4]);
    
    String[] strArray = new String[5];
    System.out.println("strArray[0] : " + strArray[0]);
    System.out.println("strArray[1] : " + strArray[1]);

    int[] varArray = { 1, 2, 3, 4, 5 };
    
    System.out.println("varArray[0] : " + varArray[0]);
    System.out.println("varArray[1] : " + varArray[1]);
  }
}
