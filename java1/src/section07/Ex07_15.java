package section07;

public class Ex07_15 {
  public static void main(String[] args) {
    Student stu1 = new Student();
    Student stu2 = new Student();

    stu1.studentName = "김고이";
    stu1.hello();
    System.out.println("학교는" + Student.schoolName + "입니다.");
    Student.goToSchool();
    
    
    
    stu2.studentName = "김고삼";
    stu2.hello();
    System.out.println("학교는" + Student.schoolName + "입니다.");
    Student.goToSchool();
  }
}
