package C14Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyImplements myip = new MyImplements();
        myip.methodA();
        System.out.println(myip.my_constant);

    }
}

interface MyInterface{
//    아래 변수는 컴파일 타임에 static final이 붙는다. (상수이자 클래스 변수)
    int my_constant = 100;

    void methodA();

}

class MyImplements implements MyInterface{


    @Override
    public void methodA() {
        System.out.println("hello");
    }
}