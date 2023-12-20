package C13Inheritance;

//import java.util.* : util 하위의 모든 클래스/인터페이스 파일 import 가능
//import java.* : 불가능 특정 패키지의 하위패키지의 모든 파일까지 import하는 것은 불가능
//import java.util.ArrayList;
//import java.util.Comparator;
//import  java.util.List;

////final 클래스는 상속 불가
//public class C1305Others extends FinalClass {
//}

public class C1305Others{
     public static void main(String[] args) {
          C1305Dog myDog = new C1305Dog();
          myDog.makeSound1();
          myDog.makeSound2();

          C1305Animal myAniamal = new C1305Animal() {
               @Override
               void makeSound1() {

               }
          };
          System.out.println(myDog.getClass());
          System.out.println(myAniamal.getClass());
     }
}
final class FinalClass{
}
abstract class C1305Animal{
//    final void makeSound(){
//        System.out.println("동물은 소리를 냅니다.");
//    }
     abstract void makeSound1();

     void  makeSound2(){
          System.out.println("makesound2");
     }
}

class C1305Dog extends C1305Animal{
     @Override
     void makeSound1() {
          System.out.println("makesound1");
     }
//    final매서드는 오버라이딩 불가
//    @Override
//    void makeSound(){
//        System.out.println("멍멍");
//    }

}
