public class C03Operator {
    public static void main(String[] args) {
////        산술연산자
//        int num1=8,num2=3;
////        * 곱셈, /나눗셈, %나머지
//        System.out.println("num1 + num2 = " + (num1+num2));
//        System.out.println("num1 - num2 = " + (num1-num2));
//        System.out.println("num1 * num2 = " + (num1*num2));
//        System.out.println("num1/num2 = " + (num1/num2));
//        System.out.println("num1%num2 = " + (num1%num2));
//
////        대입연산자
//        int n1 = 7, n2 = 7, n3 =7;
//        n1 = n1-3;
//        n2 -= 3;
//        n3 = -3;
//
////        /=, %=
//        int n4 = 10;
//        int n5 = 10;
//        n4 /= 3;
//        n5 %= 3;
//        System.out.println( "n4 = " + n4 + " n5% = " + n5);
//
//
////        증감연산자
//        int a = 5;
//        int b = a++; // 후위 증감 연산자 : 실행문이 끝나고 증감
//        System.out.println(a); //6
//        System.out.println(b); //5
//
//        a=5;
//        b= ++ a; // 전위 증감 연산자 : 실행문이 끝나기전에 증감
//        System.out.println(a); //6
//        System.out.println(b); //6
//
////        비교연산자 : ==, !=
////        char1은 a할당, char2는 A 할당
////        char1이 char2와 같은지 출력
////        char1이 char2와 같지 않은지 출력
//        char char1 = 'a';
//        char char2 = 'A';
//        System.out.println(char1 == char2);
////        System.out.println(char1 != char2);
//
////        논리연산자 : &&, ||, !
//        int num1 =10;
//        int num2 = 20;
//        boolean result1, result2;
////        result1에 num1이 5보다 큰지 조건과 num1이 20보다 작은지 조건을 and 조건을 통해 boolean 값 담기
////        result2에 num2가 10보다 작은 조건과 num2가 30보다 작은 조건을 or 조건을 통해 boolean 값 담기
////        result1, result2 각각 출력 result2에 ! 달아서 출력
//        result1 = (num1 > 5) && (num1 < 20);
//        result2 = (num2 < 10) || (num2 <30);
//        System.out.println(result1);
//        System.out.println(!result2);

////        비트연산자 : &, |, ^, ~
////        0000101    0000110
//        int n1 = 5; int n2 = 6;
//
////        & : 각자리의 수가 모두 1인 경우만 1
//        System.out.println(n1 & n2); //4
////        | : 각자리의 수가 하나라도 1인 경우 1
//        System.out.println(n1 | n2); //7
////        ^ : 대응되는 비트가 일치하지 않는 경우 1을 반환함 (비트 XOR 연산)
//        System.out.println(n1 ^ n2); //3
////        ~ : NOT 연산 각자리마다 반대의 숫자 반환
//        System.out.println(~n1); //첫째자리가 음/양, 음으로 변환
////        시프트연산자 : <<,>> 곱셈과 나눗셈의 효과가 발생
//        System.out.println(n1<<1);
//
//        int a = 13; //00001101
//        int b = 9; //00001001
//
//        while(b != 0){
//            int same_index = a & b; //and 연산으로 구한 carry 생성
//            a = a ^ b; //XOR연산으로 구한 비트값 A에 할당
//            b = same_index << 1;
//        }
//
////        첫번째 반복
////        same_index : 1001
////        a : 00100
////        b : 10010
//
////        두번째 반복
////        same_index : 00000
////        a : 10110
////        b : 00000
//        System.out.println(a);

    }
}

