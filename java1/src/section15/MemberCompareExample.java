package section15;
import java.util.HashSet;
import java.util.Set;

public class MemberCompareExample {
    public static void main(String[] args) {
        Member mem1 = new Member();
        Member mem2 = new Member();

        mem1.setMemberId(100);
        mem1.setMemName("김일남");
        
        mem2.setMemberId(200);
        mem2.setMemName("김이남");
        
        Set<Member> list = new HashSet<>();
        list.add(mem1);
        list.add(mem2);

        System.out.println("데이터 크기 : " + list.size());

        System.out.println(mem1.hashCode());
        System.out.println(mem2.hashCode());
    }
}
