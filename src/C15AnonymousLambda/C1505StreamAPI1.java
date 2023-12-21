package C15AnonymousLambda;

import java.util.Arrays;
import java.util.List;

public class C1505StreamAPI1 {
    public static void main(String[] args) {

        int[] arr = {20,10,4,22};
//        전통적인 방식의 데이터 접근 방식
//        for(int i=0; i<arr.length ; i++){
//            System.out.println(arr[i]);
//        }

//        데이터와 객체 중심이 아닌, 입력에 따르 출력만이 존제한즌 함수형 프로그래밍 방식
//        java에서 함수형프로그래밍을 지원하기 위한 라이브러리 -> StreamApi
//        forEach : 스트림의 각 요소를 소모하면서 동작을 수행
        Arrays.stream(arr).forEach(a-> System.out.println(a));
        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));

        String[] myArr = {"world", "hello", "java"};

        String[] newMyArr = Arrays.stream(myArr).sorted().toArray(String[]::new);
        System.out.println(Arrays.toString(newMyArr));

        int[] intArr = {1,2,3,4,5,6};
        int answer = Arrays.stream(intArr).sum();
        System.out.println(answer);



    }
}
