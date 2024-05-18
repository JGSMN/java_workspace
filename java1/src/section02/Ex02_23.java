package section02;

public class Ex02_23 {
  public static void main(String[] args) {
    double d1 = 1.0e100;
    // d1 = 1000;
    //double d1 = 1.0 * Math.pow(10,100);
    System.out.println(d1); //1.0E100
    
    float f1 = (float) d1;
    System.out.println(f1); //Infinity
    
    double d2 = 1.0e-100;
    
    System.out.println(d2); //
    
    float f2 = (float) d2;
    System.out.println(f2); //0.0
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}
