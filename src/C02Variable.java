import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
////        byte로 썻을 때 -128~127까지 표현이 가능하고, 그이상을 세팅할 때 오버/언더 플로우 발생
//        byte num1 = 127;
//        byte num2 = -128;
//        num1 += 1;
////        num1 ++;
//        num2 -= 1;
////        num2 --;
//        System.out.println("num1의 값은 : " + num1);
//        System.out.println("num2의 값은 : " + num2);
//
//        float f1 = 1.123456789f;
//        double b1 = 1.123456789;
//        System.out.println("f1 : " + f1);
//        System.out.println("b1 : " + b1);
//
////        부동소수점 오차 테스트
//        double double_num = 0.1;
////        미세오차는 조정되어 정상적으로 출력
//        System.out.println(double_num);
//
////        반복적으로 연산시 오차가 확대되어 오차확인가능
////        for(초기식;조건식;증감식){} 초기 -> 증감 -> 조건 ->증감 ->조건
//        for(int i=0;i<100;i++){
//            System.out.println(i);
//        }
//
//////        0.1을 특정 변수에 1000을 더해서 더한 값 출력
//        double total = 0;
//        for(int i=0;i<1000;i++){
//            total = total+ 0.1;
//        }
//        System.out.println("0.1을 1000번 더한 값은 : " + total);
//
//        double total2 = 0;
//        for(int i=0;i<1000;i++){
//            total2 = total2+ 0.1*10;
//        }
//        total2 = total2/10;
//        System.out.println("0.1에 10을 곱하고 1000번 더해 나누기 10 값은 : " + total2);
//
////        저장할 때는 문자열 -> 연산할 때는 정수로 변환 -> 최종결과는 실수로 변환
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
//
//        BigDecimal myBig1 = new BigDecimal("1.03");
//        BigDecimal myBig2 = new BigDecimal("0.42");
//        System.out.println(myBig1.subtract(myBig2));
//
//        double result = myBig1.subtract(myBig2).doubleValue();
//        System.out.println(myBig1.subtract(myBig2));
//
////        문자 : char
//        char my_char = '가';
//        System.out.println(my_char);
//
////        boolean : ture(1) or false(0)
//        boolean my_bool = true;
//        System.out.println(my_bool);
//        if(my_bool){
//            System.out.println("조건식이 참입니다.");
//        }
//        int bool_num1 = 20;
//        int bool_num2 = 10;
//        if(bool_num1 > bool_num2){
//            System.out.println("조건식이 참입니다.");
//        }
//
////        묵시적 타입 변환
//        char ch1 = 'a';
//        int ch1_num = ch1;
//        System.out.println(ch1_num);
//
//        char형 알파벳 비교를 위한 묵시적 타입변환이 일어난다.
//        System.out.println('A'>'a');
//
//        int my_int1 = 10;
//        double my_double1 = my_int1;
//        System.out.println(my_double1);
////        애러 발생 : my_int1 = my double1;
////        명시적 타입은 가능 : 소수점값 발생가능성이 있다. => my_int1 =(int)my_double1;
//
//        double my_double2 = 7.2f;
//        System.out.println(my_double2);
//
////        명시적 타입 변환
//        char my_char2 = 'b';
//        int char_num = (int)my_char2;
//
////        int a가 1 int b가 4일떄 둘을 나눈 값을 int에 담아 출력, double에 담아 출력
//        int a = 1;
//        int b = 4;
//        int c = a/b;
//        double d = a/b;
//        System.out.println(c);
//        System.out.println(d);
//        double d2 = (double)a/(double)b;
//        System.out.println(d2);
//
////        변수와 상수
////        선언과 동시에 초기화
//        int a1 = 10;
////        변수값 변경
//        a1 = 20;
////        선언만 한 뒤에 나중에 초기화
////        지역 변수는 선언만 되었을때는 값이 0으로 초기화되지 않으나, 객체로 선언될때는 0으로 초기화
//        int a2;
//        a2 = 20;
////        객체로 만들때는 0 으로 초기화
//        int[] arr = new int [5];
//        System.out.println(arr[0]);
////        상수는 값의 재할당이 불가능
//        final int AGES = 20;
////        상수는 값의 변경이 불가능 -> AGES = 30; 에러 발생
////        상수는 선언만 한뒤에 나중에 초기화 하는 방식이 java 이전에는 안됐었지만, 이후 가능해짐
    }
}
