import java.util.Arrays;
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

//        구구단 반복
//        while(true){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("구구단 단수를 입력해주세요");
//            int input = sc.nextInt();
//            int a = 1;
//            while(a<=9){
//                System.out.println(input + " x " + a + " = " + (input*a));
//                a++;
//            }
//        }
//
////        도어락 while문 예제 : 비밀번호를 맞추면 반복이 종료되고 그렇지 않으면 계속적으로 다시 질문
////        최대 5번 까지만 비밀번호 입력 가능하도록 => 입력횟수를 초과했습니다. 라는 문구 출력
//
//        String answer = "1234";
//        int a=0;
//        while(true){
//            System.out.println("비밀번호를 입력해주세요.");
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if(answer.equals(input)){
//                System.out.println("문이 열렸습니다.");
//                break;
//            }else{
//                System.out.println("비밀번호가 틀렸습니다.");
//                }
//            a++;
//            if(a==5){
//                System.out.println("입력횟수를 초과했습니다.");
//                break;
//            }
//        }

////      2~10까지 출력하는 do while문 예제
//        int a = 2;
//        do {
//            System.out.println(a);
//            a++;
//        }while (a<=10);

////        for문을 통해 2~10까지 출력
//        for(int i =2 ; i<=10; i++){
//            System.out.println(i);
//        }

////        continue를 사용해서 홀수만 되도록 (1~10까지 수 중에)
//        for(int i = 1; i<=10; i++){
//            if(i%2 ==0){
//                continue;
//            }
//            System.out.println(i);
//        }

////        배열과 enhance for문
//        int[] myArr = {1,5,7,9,10};
////        일반적인for문
//        for(int i=0; i<5; i++){
//            System.out.println(myArr[i]);
//        }
//////        enhance for문
////        for(int a : myArr){
////            System.out.println(a);
////        }
//
////        일반 for문을 통해 myArr의 값에 10씩 더한 뒤에 출력
//        for(int i =0; i<myArr.length; i++){
//            myArr[i] += 10;
//        }
//        System.out.println(Arrays.toString(myArr));
//
////        enhance for문을 통해 myArr의 값에 10씩 더한 뒤에 출력
//        for(int a : myArr){
//            a += 10;
//        }
//        System.out.println(Arrays.toString(myArr));
//
////        java 변수의 유효범위 : { }
//        int num = 10;
//        if(num > 1){
//            int abc = 20;
//            num = 20;
//        }
//        System.out.println(num); // 20 if문 밖에서 선언된 변수 값을 if안에서 접근하여 변경하는 것은 가능.
////        System.out.println(abc); if문 안에서 정의된 변수는 밖에서 인지 불가

////        다중반복문을 이용한 구구단
//
//        for(int i = 2; i<=9 ; i++){
//            System.out.println( i + "단입니다.");
//            for(int j = 1; j<=9; j++){
//                System.out.println(i + " x " + j + " = " + (i*j));
//            }
//        }

////        2중 for을 통해 배열 접근
//        int[][] arr = {{1,2,3,4},{5,6,7,8}};
//        for(int i =0; i< arr.length; i++){
//            for(int j =0; j < arr[i].length; j++){
//                System.out.println(arr[i][j]);
//            }
//        }

////        라벨문
//        loop1:
//        for(int i=0; i<5; i++){
//            loop2:
//            for(int j=0; j<5; j++){
//                System.out.println("hello world");
//                if(j==2){
//                    break loop1;
//                }
//
//            }
//        }



    }
}
