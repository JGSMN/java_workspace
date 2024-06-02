package section03;

public class Ex03_13_Practice {
    public static void main(String[] args) {
        boolean a = true ;
        boolean b = false ;
        
        if (b) {
            System.out.println("참입니다."); // b = false 들어갔기 때문에 참입니다 라는 명제가 조건이 부정되어서 실행 불가능
            
        } else if(a) {
            System.out.println("거짓입니다.");// a = true 가 들어갔기 때문에 거짓이라는 조건문이 돌아게끔 됬다
        }

    
    }
}
