package section15;

public class Ex15_03 {
    public static void main(String[] args) {
        String str1 ="hello";
        String str2 ="hello";
        String str3 ="hi";

        System.out.println("System.identityHashCode(str1) : " + System.identityHashCode(str1));
        System.out.println("System.identityHashCode(str2) : " + System.identityHashCode(str2));
        System.out.println("System.identityHashCode(str3) : " + System.identityHashCode(str3));

        System.out.println("---------------");

        System.out.println("str1.hashCode()" + str1.hashCode());
        System.out.println("str2.hashCode()" + str2.hashCode());
        System.out.println("str3.hashCode()" + str3.hashCode());

        
    }
}
