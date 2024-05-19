package section04;

public class Ex04_10 {
  public static void main(String[] args) {
    int num = 'A';


    switch (num) { // 소괄호에 값이 들어옵니다!
      case 'A':
        System.out.println("num은 A입니다.");
        break;
      case 7:
        System.out.println("num은 7입니다.");
        break;
      case 8:
        System.out.println("num은 8입니다.");
        break;
      default:
        System.out.println("num은 1, 7, 8이 아닙니다");
        break;
    }
  }
}
