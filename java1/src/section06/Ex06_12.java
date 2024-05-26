package section06;

import java.util.Arrays;

public class Ex06_12 {
  public static void main(String[] args) {
    int[] card = { 3, 1, 4, 5, 10 };
    
    System.out.println("card 배열(전) : " + Arrays.toString(card));
    
    // int[] newCard = Arrays.copyOf(card, card.length);
    int[] newCard = Arrays.copyOf(card, 2);
    
    card[0] = 0;

    
    System.out.println("card 배열(후) : " + Arrays.toString(card));
    System.out.println("newCard 배열 : " + Arrays.toString(newCard));
  }
}
