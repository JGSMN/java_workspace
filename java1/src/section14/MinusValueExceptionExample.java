package section14;

import java.util.Scanner;

public class MinusValueExceptionExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int data = 0;
        int sum = 0;

        while (count < 5) {
            System.out.println("숫자를 입력하세요");
            data = scan.nextInt();
            sum += data;
            count++;
        }
        System.out.println("숫자 합 : " + sum);
        scan.close();
    }
}
