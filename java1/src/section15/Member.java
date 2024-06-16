package section15;

public class Member {
    private int memberId;
    private String memName;

    public int getMemberId() {
        return this.memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemName() {
        return this.memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }
    @Override
    public int hashCode() {
        return memberId;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member compare = (Member) obj;
            if(this.memberId == compare.memberId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
