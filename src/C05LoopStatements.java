import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {

////       2~10까지 출력하는 while문 예제
//        int a = 2;
//        while (a<=10){
//            System.out.println(a);
//            a++;
//        }

////        while문을 이용하는 구구단
//        Scanner sc = new Scanner(System.in);
//        System.out.println("구구단 단수를 입력해주세요");
//        int input = sc.nextInt();
//        int a = 1;
//        while(a<=9){
//            System.out.println(input + " x " + a + " = " + (input*a));
//            a++;
//        }

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("구구단 단수를 입력해주세요");
            int input = sc.nextInt();
            int a = 1;
            while(a<=9){
                System.out.println(input + " x " + a + " = " + (input*a));
                a++;
            }
        }


    }
}
