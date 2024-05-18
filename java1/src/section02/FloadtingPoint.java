package section02;

import java.math.BigDecimal;

public class FloadtingPoint {
  public static void main(String[] args) {
    double dNum1 = 0.1;
    dNum1 += 0.1;
    dNum1 += 0.1;
    //dNum1 = dNum1 + 0.1;
    System.out.println(dNum1);
    

    BigDecimal bdNum1 = new BigDecimal("0.1");
    BigDecimal bdNum2 = new BigDecimal("0.1");
    BigDecimal bdNum3 = new BigDecimal("0.1");
    System.out.println(bdNum1.add(bdNum2).add(bdNum3));
    
    BigDecimal ibdNum1 = new BigDecimal(0.1);
    BigDecimal ibdNum2 = new BigDecimal(0.1);
    BigDecimal ibdNum3 = new BigDecimal(0.1);
    System.out.println(ibdNum1.add(ibdNum2).add(ibdNum3));
















  }
  
}
