package section02;

public class Ex02_10 {
  int myAge;
  public static void main(String[] args) {
    int myAge = 20;
    int yourAge, tempAge;
    yourAge = 30;
    System.out.println("myAge : " + myAge);
    System.out.println("yourAge : " + yourAge);
    
    
    tempAge = myAge;
    myAge = yourAge;
    yourAge = tempAge;

    System.out.println();

    System.out.println("myAge : " + myAge);
    System.out.println("yourAge : " + yourAge);
  }
}
