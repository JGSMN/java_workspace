package section03;

public class Ex03_15 {
  public static void main(String[] args) {
    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = true;
    boolean b4 = false;



    System.out.println("###논리곱(&&)###");
    System.out.println(b1 && b2);
    System.out.println(b1 && b3);
    System.out.println(b2 && b4);
    System.out.println();
    
    System.out.println("###논리합(||)###");
    System.out.println(b1 || b2);
    System.out.println(b1 || b3);
    System.out.println(b2 || b4);
    System.out.println();
    
    int num1 = 1;
    int num2 = 2;
    System.out.println("###비트연산###");
    System.out.println(num1 & num2);
    System.out.println(num1 | num2);//1+2
    System.out.println(num1 ^ num2);
    System.out.println(3 ^ 2);
    
    

  }
}
