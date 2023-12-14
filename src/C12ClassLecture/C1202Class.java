package C12ClassLecture;

public class C1202Class {
    public static void main(String[] args) {

//        System.out.println(MyCalculator.sum(30,10));

////        A부서의 매출
//        MyCalculator.sumAcc(10);
//        MyCalculator.sumAcc(20);
//        MyCalculator.sumAcc(30);
//        System.out.println(MyCalculator.total);
//
////        B부서의 매출
//        MyCalculator.sumAcc(10);
//        MyCalculator.sumAcc(20);
//        MyCalculator.sumAcc(30);
//        System.out.println(MyCalculator.total);

//        클래스 변수를 공용으로 사용하다보니, 변수와 매서드에 고유성이 보장되지 않음
//        A부서의 매출
        MyCalInstance myCalA = new MyCalInstance();
        myCalA.sumAcc(10);
        myCalA.sumAcc(20);
        myCalA.sumAcc(30);
        System.out.println(myCalA.total);
//        B부서의 매출
        MyCalInstance myCalB = new MyCalInstance();
        myCalB.sumAcc(10);
        myCalB.sumAcc(20);
        myCalB.sumAcc(30);
        System.out.println(myCalB.total);


    }
}

//내부클래스

class MyCalculator{
    static int total = 0;
    //    매개변수 2개 받아서 더한값 return : sum
    static int sum(int a, int b){
        return a+b;
    }
    static void sumAcc(int a){
        total += a;
    }

}

class MyCalInstance{
//    static이 붙어있는 변수는 클래스 변수, static이 붙어 있지 않으면 객체 변수
    int total = 0;
    //    매개변수 2개 받아서 더한값 return : sum
    int sum(int a, int b){
        return a+b;
    }
    void sumAcc(int a){
//        this 객체 그 자신을 의미
        this.total += total;
    }

}
