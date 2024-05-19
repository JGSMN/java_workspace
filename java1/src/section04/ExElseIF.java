package section04;

public class ExElseIF {
  public static void main(String[] args) {
    String s1 = "circle";
    String s2 = "square";
    String s3 = "triangle";  
    String s4 = "any";  
    String s5 = "any2";  
    


    String pick = s5;

    if (pick == "circle")
    System.out.println("동그라미 접시로 옮기기");
    else if (pick == "square")
    System.out.println("네모 접시로 옮기기");
    else if (pick == "triangle"){
    System.out.println("세모 접시로 옮기기");
    }else{ 
    System.out.println("그냥 놔두기");
    System.out.println("옮기기 완료!");
  }
  }
}
