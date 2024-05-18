package section02;

import java.util.Scanner;

public class ScannerSplit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name, address;
    int age;
    double weight;

    System.out.println("이름, 주소, 나이, 체중을 빈칸을 구분하여 순서대로 입력하시오");

    name = scanner.next();
    address = scanner.next();
    age = scanner.nextInt();
    weight = scanner.nextDouble();

    System.out.printf("당신의 이름은 %s입니다.\n", name);
    System.out.printf("당신의 주소는 %s입니다.\n", address);
    System.out.printf("당신의 나이는 %s세입니다.\n", age);
    System.out.printf("당신의 몸무게는 %fkg입니다.\n", weight);

  
  
  }
}
