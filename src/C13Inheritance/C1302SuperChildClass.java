package C13Inheritance;

//super() : 부모클래스의 생성자를 의미, super키워드 : 부모클래스의미
public class C1302SuperChildClass extends SuperParents {
    int b;
    int a;

    C1302SuperChildClass(){
        super(100);
        a=30;
        b=20;
    }
    void display(){
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        C1302SuperChildClass sc = new C1302SuperChildClass();
        sc.display();

    }
}

class SuperParents{
    int a;
    SuperParents(int a){
        this.a =a;
    }
}
