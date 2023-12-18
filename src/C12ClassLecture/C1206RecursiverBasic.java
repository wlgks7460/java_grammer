package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1206RecursiverBasic {
//    public static void main(String[] args) {
//        int total =0;
//        for(int i=10; i>=1 ; i--){
//            total +=i;
//        }
//        System.out.println(total);
//        System.out.println(add_acc(10));
//        System.out.println(fac(0));
//
////        누적곱하기 : 팩토리얼
////        피보나치 수열
//        int first =1;
//        int second =1;
//        int third= 0;
//        for(int i = 2; i<10 ; i++){
//            third = first + second;
//            first = second;
//            second =third;
//        }
//        System.out.println(third);
//
//        //    피보나치 : 배열
//        int n = 10;
//        int[] arr = new int[n];
////        fiponacci for문으로만(배열활용)
////        메모이제이션(기억알고리즘 -DP)
//        arr[0] = 1;
//        arr[1] = 1;
//        for(int i= 2; i<arr.length ; i++){
//            arr[i] = arr[i-1]+arr[i-2];
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(fiponacci(9));
//    }
//
//
//
//
////    매서드가 자기자신을 호출하는 매서드를 재귀함수라고하고, 이러한 호출방식을 재귀호출이라고 한다.
//    static int add_acc(int n){
//        if(n==1){
//            return 1;
//        }
//        return n+add_acc(n-1);
//    }
//    static int fac(int n){
//        if(n<=1){
//            return 1;
//        }
//        return n*fac(n-1);
//    }
//    static int fiponacci(int n){
//        if(n <= 1){
//            return 1;
//        }
//        return fiponacci(n-1) +fiponacci(n-2);
//
//    }
}
