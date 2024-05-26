package section06;

import java.util.Arrays;

public class Ex06_11 {
  public static void main(String[] args) {
    int[] card = { 1, 6, 4, 5, 3, 2 };
    int[] newCard = new int[card.length];
    System.out.println("card 배열 : " + Arrays.toString(card));
    
    
    
    // newCard[0] = card[0];
    // newCard[1] = card[1];
    // newCard[2] = card[2];
    // newCard[3] = card[3];
    // newCard[4] = card[4];
    // newCard[5] = card[5];
    
    for (int i = 0; i < card.length; i++){
      newCard[i] = card[i];
      
    }
    
    card[0] = 0;
    
    System.out.println("card 배열 : " + Arrays.toString(card));
    System.out.println("newCard 배열 : " + Arrays.toString(newCard));
  }
}
