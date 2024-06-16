package section13;

public class InnerExam {
    public int puls(int value) {
        class Cal {
            public int add() {
                // value = value + 1;
                return value + 1;
            }
        }
        Cal cal = new Cal();
        return cal.add();
    }
    public static void main(String[] args) {
        InnerExam ie = new InnerExam();
        System.out.println(ie.puls(10));
    }
}
