package section14;

import java.util.Scanner;

public class Ex14_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
            try {
                System.out.println("당신의 나이를 입력하세요 >>>");
                int age = scan.nextInt();

                if (age < 0) {
                    throw new InputErrorException("입력이 잘못되었습니다!!!");
                    
                }
                if (age > 19) {
                    System.out.println("성인입니다.");
                } else if (age > 13) {
                    System.out.println("청소년입니다.");
                } else if (age > 6) {
                    System.out.println("어린이입니다.");
                } else {
                    System.out.println("아동입니다.");
                }
            } catch (InputErrorException e) {
                
                System.out.println("에러 메시지 : " + e.getMessage());
            } finally {
                scan.close();
                System.out.println("프로그램 종료!");
                
            }
        
        }
    }
    

