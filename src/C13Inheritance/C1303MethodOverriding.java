package C13Inheritance;

//Animal 클래스 sound() -> 동물은 소리를 냅니다.
//Dog 클래스 : Animal상속 -> sound overriding : 멍멍
//Cat 클래스 : Animal상속 -> sound ovverriding : didyd

//main 매서드에서 객체 2개 생성해서 sound 호출

import java.util.LinkedList;
import java.util.List;

public class C1303MethodOverriding {
    public static void main(String[] args) {

//        상속관계일때 부모클래스 타입을 자식클래스 객체의 타입으로 지정가능
//        Animal클래스에 정의된 매서드만 사용가능하도록 제약이 발생/
        Animal myDog = new Dog();
        myDog.sound();
        Cat myCat = new Cat();
        myCat.sound();

        List<String> myList = new LinkedList<>();
    }
}

class Animal{
    void sound(){
        System.out.println("동물은 소리를 냅니다. ");
    }

}

class Dog extends Animal{
    void sound(){
        System.out.println("멍멍");
    }


}

class Cat extends Animal{
    void sound(){
        System.out.println("야옹 ");
    }

}
