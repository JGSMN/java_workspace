package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        try{    
            int[] cards = { 4, 5, 1, 2, 7, 8 };
            System.out.println("몇번째 카드를 뽑으시겠습니까? >>");
            int cardIndex = scan.nextInt();
            System.out.println("뽑은 카드 번호는 : " + cards[cardIndex]);
        } catch(InputMismatchException e) {
            System.out.println("입력이 잘못되었습니다. 숫자만 가능합니다.");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("해당 번호의 카드는 없습니다.");
        } catch(Exception e) {
            System.out.println("알수 없는 예외가 발생했습니다.");
        } finally { //fianlly는 예외발생이든 실행되든 무조건 실행되는 코드 입력함
        scan.close();
        System.out.println("프로그램 종료!");
        System.out.println("반드시 실행되는 코드입니다.");
    }
    }
}

