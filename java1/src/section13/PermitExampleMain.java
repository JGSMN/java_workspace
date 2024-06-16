package section13;

class PermitExample {
  public interface InClassInterface {
    void print();

  }

  private class InClass implements InClassInterface {
    public void print() {
      System.out.println("접근을 private로 제한합니다");
    }
  }

  public InClass getInClass() {
    return new InClass();
  }
}

public class PermitExampleMain {

  public static void main(String[] args) {
    PermitExample permit = new PermitExample();
    // PermitExample.InClass inClass = permit.new InClass();
    // inClass.print();

    PermitExample.InClassInterface inClass = permit.getInClass();
    inClass.print();
  }
}
