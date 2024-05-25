package section06;

public class Ex06_05 {
  public static void main(String[] args) {
    char[] cards = { '1', 'L', 'O', '2', 'V', '3', 'E' };
    String myWord = "";

    // System.out.println(cards.length);
    // 대문자 : 65 ~ 90
    // 소문자 : 97 ~ 122
    for (int i = 0; i < cards.length; i++) {
      int word = cards[i];

      if ((word >= 65 && word <= 90) || (word >= 97 && word <= 120)) {
        // System.out.print(cards[i]);
        myWord += (char)word;

      }
    }
    System.out.println(myWord);
  }
}
