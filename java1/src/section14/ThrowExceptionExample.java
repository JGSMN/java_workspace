package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowExceptionExample {
    public static void checkYourSelf(Scanner scan) throws InputMismatchException{ 
        System.out.println("1. 사람과 어울리는것이 좋다. 2. 혼자 있는 것이 좋다.");
        System.out.println("선택하세요 >>>");
        int check = scan.nextInt();

        if (check == 1) {
            System.out.println("당신은 ENFP");
        } else {
            System.out.println("당신은 ISFP");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("======성격  유형 검사======");
            ThrowExceptionExample.checkYourSelf(scan);
        } catch (InputMismatchException e) {
            System.out.println("키보드 입력이 잘못되었습니다.");
        } finally {
            if (scan != null) {
                scan.close();
            }
            System.out.println("프로그램 종료");
        }
    }
}
