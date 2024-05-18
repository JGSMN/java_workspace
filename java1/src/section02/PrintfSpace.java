package section02;

public class PrintfSpace {
  
  public static void main(String[] args) {
    System.out.printf("숫자%d끝\n",1);
    System.out.printf("숫자%5d끝\n",1);
    System.out.printf("숫자%-5d끝\n",1);
    System.out.printf("숫자%-5d끝\n",123);
    System.out.printf("숫자%100d끝\n",123);
    System.out.printf("숫자%-100d끝\n",123);
}       
}