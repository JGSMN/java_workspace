package section14;

public class NullPointExceptionExample {
    public static void main(String[] args) {
        String[] strArray = null;

        try{

            System.out.println(strArray[0]);
        } catch(Exception e) {
            System.out.println("NullPointException 예외가 발생했습니다.");
        }
    }
}
