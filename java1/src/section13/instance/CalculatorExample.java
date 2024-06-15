package section13.instance;

class Calculator {
  private int val1;
  private int val2;
  
  public Calculator(int val1, int val2) {
    this.val1 = val1;
    this.val2 = val2;

  }  
  public int add() {
    return this.val1 + this.val2;
  }
  public class InnerCalculator {
    public int add() {
      return val1 + val2;
    }
  }
}
public class CalculatorExample {
  public static void main(String[] args) {
    Calculator cal = new Calculator(10, 11);
    int result = cal.add();
    System.out.println("Calculator 합 : " + result);

    System.out.println("------------------");
    Calculator.InnerCalculator ic = cal.new InnerCalculator();
    
    result = ic.add();

    System.out.println("Calculator.InnerCalculator합 : " + result);
  }

}

