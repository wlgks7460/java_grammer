package C15AnonymousLambda;

import javax.sound.midi.Soundbank;

public class C1502AnonymousClass {
    public static void main(String[] args) {

//        클래스명이 Animal이 아닌 이름 없는 익명클래스와 객체를 동시에 생성
        Animal dog = new Animal() {
            @Override
            public void makeSound(int n) {
                System.out.println("멍멍"+n);
            }
        };
        dog.makeSound(10);

//        익명객체에 구현 매서드가 1개 밖에 없을 경우에 람다 표현식(화살표함수)로 표현 가능
//        ()붑문엣 매개변수 지덩하여 구형체에서 활용, 변수의 개수가 많을 때는 개수를 맞춰 지정(a,b...
        Animal cat = (a)-> System.out.println("야옹" + a);
    }
}

interface Animal{
    void makeSound(int n);
}