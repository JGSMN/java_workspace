package section05;


public class Practice05_04 {
  
  public static void main(String[] args) {
    int dice1 = 1;
    int dice2 = 2;
    int count = 0;
    
    while(dice1 !=dice2){
      
      dice1 = (int)(Math.random() * 6) + 1;
      dice2 = (int)(Math.random() * 6) + 1;
      count++;
      
    }
    System.out.println("반복 횟수" + count + "주사위 눈 : " + dice1);
    
    















  }
}
