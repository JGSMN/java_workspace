package section15;

public class Ex15_01 {
    public static void main(String[] args) {
        String str1 ="hello";
        String str2 ="hello";
        String str3 =new String("hello");
        String str4 =new String("hello");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("str1 == str2 : " + (str1 == str2)); // true
        System.out.println("str1 == str3 : " + (str1 == str3)); // false
        System.out.println("str3 == str4 : " + (str1 == str3)); // false
        
        System.out.println("System.identityHashCode(str1) : " + System.identityHashCode(str1));
        System.out.println("System.identityHashCode(str2) : " + System.identityHashCode(str2));
        System.out.println("System.identityHashCode(str3) : " + System.identityHashCode(str3));
        System.out.println("System.identityHashCode(str4) : " + System.identityHashCode(str4));
        

        System.out.println("str1.equals(str3)" + str1.equals(str3)); //true
    }
}
