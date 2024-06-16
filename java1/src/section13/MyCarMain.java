package section13;

import section13.MyCar.Promotion;

class MyCar {
    private int price;
    private String myName;
    public MyCar(String myName, int price) {
        this.myName = myName;
        this.price = price;
    }
    public String getInfo() {
        String str = "차량 : " + myName + ", 가격 : " + price;
        return str;
    }
    public class Promotion {
        public int discount() {
            int discount = 0;
            discount = price / 100;
            return discount;
        }
    }
}
public class MyCarMain {
    public static void main(String[] args) {
        MyCar mycar = new MyCar("소나타", 4000);
        MyCar.Promotion promotion = mycar.new Promotion();
        
        System.out.println(mycar.getInfo() + ", 할인금액 : " + promotion.discount());
        
    }
}
