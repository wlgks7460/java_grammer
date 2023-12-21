package C15AnonymousLambda;

public class C1501InnerClass {

    public static void main(String[] args) {
        MenberInnerClass.StaticInnerClass si = new MenberInnerClass.StaticInnerClass();

    }
}
//일반내부클래스
class MenberInnerClass{

    private int a;

    void display() {
        System.out.println("data값은 " + a + " 입니다.");
    }
    static class StaticInnerClass{
//  static 내부 클래스
//  이 클래스는 C1501InnerClass의 정적멤버처럼 활용
        int data;

        void display(){
            System.out.println("data값은 "+ data + " 입니다.");
        }
    }
}

