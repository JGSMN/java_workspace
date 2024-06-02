package section07;

public class Ex07_11 {
  public static void main(String[] args) {
    Family father = new Family();
    Family son = new Family();

    father.name = "김아빠";
    son.name = "김아들";
    System.out.println(father.name + " " + father.address);

    Family.address = "서울";
    father.name = "김일남";
    
    System.out.println(father.name + " " + father.address);
    System.out.println(son.name + " " + son.address);
  }
}
