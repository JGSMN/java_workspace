package section09;
class Phone{
  String brand = "갤럭시";
  int series;
  String color = "검정색";
  Phone(int s) {

    series = s;
    
  }
  Phone(String b, int s) {

    brand = b;
    series = s;
    
  }
  Phone(String b, int s,String c) {

    brand = b;
    series = s;
    color = c;
  }
    

void phoneInfo() {
  System.out.println(color + " " + brand + " " + series);
}

public class Ex09_08 {
  public static void main(String[] args) {
    Phone p1 = new Phone("갤럭시", 1);
    Phone p2 = new Phone("아이폰", 2 );
    Phone p3 = new Phone( 3 );
    
    p1.phoneInfo();
    p2.phoneInfo();
    p3.phoneInfo();
  }
}
}