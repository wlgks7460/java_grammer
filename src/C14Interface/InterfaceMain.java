package C14Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        CatImplements myCat = new CatImplements();
        myCat.makeSound();
        DogImplements myDog = new DogImplements();
        myDog.makeSound();

//        다형성이란 하나의 객체가 여러개의 참조변수 타입를 가질 수 있음을 의미

        AnimalInterface1 myMultiCat = new CatMultiImplements();
        myMultiCat.makeSound();
//        타입을 interface1으로 선언하면 interface2에 정의된 매서드는 사용불가
//        System.out.println(myMultiCat.play("코리안숏헤어","브리티시폴드"));
        AnimalInterface2 myMultiDog = new DogMultiImplements();
//        타입을 interface2으로 선언하면 interface1에 정의된 매서드는 사용불가
//        myMultiDog.makeSound();
        System.out.println(myMultiDog.play("시바견","진돗개"));

//        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나, 익명부클래스 방식으로 사용가능
        AnimalInterface1 ai = new AnimalInterface1() {
            @Override
            public void makeSound() {

            }
        };

    }
}
