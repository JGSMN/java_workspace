package section02;

public class Ex02_24 {
  public static void main(String[] args) {
    double pie = 3.14;
    int pieInt = (int)pie; //강제적 형변환,
    System.out.println(pieInt);
    
    byte num1 = 127;
    int num2 = num1; //자동형변환, 묵시적 형변환, upcasting
    System.out.println(num2);


    int num = 100;
    double numD = num;
    float numF = 100;
    System.out.println(numD);
    System.out.println(numF);



    int i = 99999999;
    float f = i;
    System.out.println(f);







    


  }
}
