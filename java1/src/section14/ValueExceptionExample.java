package section14;

public class ValueExceptionExample {
    public static void main(String[] args) {
        int data = 10;
        double result = 0;

        try {
            result = data / 0;

        } catch (ArithmeticException e) {
            result = 0;
        }

        System.out.println("결과는 : " + result);
    }
}
