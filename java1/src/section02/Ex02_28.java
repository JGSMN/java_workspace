package section02;

public class Ex02_28 {
  public static void main(String[] args) {
    double d1 = 1.1234;
    float f1 = (float)d1;
    System.out.println(f1);


    double d2 = 1.0e-50;
    float f2 = (float) d2;
    System.out.println(f2);
    
    
    double d3 = 1.0e50;
    float f3 = (float) d3;
    System.out.println(f3);

    double d4 = 9.123456789;
    float f4 = (float) d4;
    System.out.println(f4);


  }
}
