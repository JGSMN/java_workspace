package section13.anonymous_class;

class Person {
  public void mySelf() {
    System.out.println("나는 인간입니다.");
  }

}
// class Student extends Person{
// @Override
// public void mySelf() {
// System.out.println("나는 학생입니다.");
// }
// }

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.mySelf();
    // Person p2 = new Student();
    // p2.mySelf();
    Person student = new Person() {
      @Override
      public void mySelf() {
        System.out.println("나는 학생입니다.");
      }
    };
    student.mySelf();
  }
}
