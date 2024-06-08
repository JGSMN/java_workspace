package section10.access2;

public class Customer extends Person {
  int memberID;

  Customer(String name, int age, int memberID) {
    super(name, age);
    this.memberID = memberID;
  }
  void enter() {
    System.out.println("회원번호 : " + memberID + "(" + name + ", " + age + "세" + ")님 입장하셨습니다.");
  }
}
