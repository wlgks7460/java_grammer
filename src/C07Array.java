import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//
////        표현식1
//        int[] int_arr1 = {1,2,3,4,};
//
////        표현식2
//        int[] int_arr2 = new int[4];
//        int_arr2[1] = 1;
//        int_arr2[2] = 2;
//        int_arr2[3] = 3;
//        int_arr2[4] = 4;
//
////        표현식3
//        int[] int_arr3 = new int[]{1,2,3,4,};

//        표현식4 는 불가 : java의 배열은 반드시 길이가 지정되어얗ㅎ함.
//        int[] int_arr4 = new int[];

////        String 표현식
//        String[] arr_st = new String[5];
//        for(int i = 0 ; i < arr_st.length ; i++){
//            if(arr_st[i].isEmpty()){
//                System.out.println("비어있습니다.");
//            }
//        }
//
//        int[] arr_int = new int[5];
//        for(int i = 0 ; i < arr_st.length ; i++){
//            arr_int[i] += 10;
//        }
//
////        85, 65, 90인 int 배열을 선언한뒤, 총합, 평균값
//        int[] int_arr5 = {65, 85, 90};
//        int total_sum = 0;
//        double avg = 0;
//        for(int i = 0; i<int_arr5.length ; i++){
//            total_sum = total_sum + int_arr5[i];
//        }
//        avg = (double)total_sum/int_arr5.length;
//        System.out.println(total_sum);
//        System.out.println(avg);

////        최댓값, 최솟값 구하기
//        int[] arr = {10, 20, 30, 12, 8, 17};
//        int max = arr[0] ; // 0으로 선언하면 모두 음수인 경우 배열에 없는
//        int min = arr[0]; //0이 최대가 되므로 배열에 있는 수 하나를 선정해서 진행
//        for(int i = 0 ; i<arr.length ; i++){
//            if(max<arr[i]) {
//                max = arr[i];
//            }
//
//            if(min>arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

////        배열 순서 바꾸기
//        int[] arr = {10, 20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

//        int[] arr2 ={10,20,30,40,50,60,70};
//        for(int i = 0; i<arr2.length-1; i++){
//            int temp2 = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp2;
//        }
//        System.out.println(Arrays.toString(arr2));

////        배열 뒤집기
//        int[] arr = {1,2,3,4,5};
////        신규 배열 선언
//        int[] arr2 = new int[arr.length];
//        for(int i =0 ; i<arr.length ; i++){
//            arr2[arr.length-1-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));

////        배열 뒤집기 2
//        int[] arr = {1,2,3,4,5};
//            for(int i = 0 ; i<arr.length/2 ; i++){
//                int temp = arr[i];
//                arr[i] = arr[arr.length-1-i];
//                arr[arr.length-1-i] = temp;
//            }
//        System.out.println(Arrays.toString(arr));

////        정렬 : sort() 함수 사용
//        int[] arr = {2,3,4,1,5,6,2,1};
//
////        오름차순 정렬
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

////        내림차순 정렬
////        방법1.Compartor 클래스 객체 사용
////        객체 타입인 경우에만 Compartor 클래스 사용가능
//        String[] st_arr = {"hello", "hi", "bye", "goodmoring"};
//        Arrays.sort(st_arr);
//        System.out.println(Arrays.toString(st_arr));
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(st_arr));
//        Integer[] arr_integer = {2,3,4,1,5,6,2,1};
//        Arrays.sort(arr_integer, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(arr_integer));
////        Comparator 클래스는 기본형 타입은 처리불가
//        Arrays.sort(arr, Comparator.reverseOrder());


//        방법2.sort() 후 배열 뒤집기

//        int[] arr = {2,3,4,1,5,6,2,1};
//        Arrays.sort(arr);
//        for(int i = 0 ; i<arr.length/2 ; i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//
////        StreamApi, lamda를 활용한 내림차순 정렬
//        int[] arr2 = {2,3,4,1,5,6,2,1};
//                         //내림차순장령
//        int[] new_arr2 = Arrays.stream(arr2)//arr2를 대상으로 stream 객체 생성
//                            .boxed() //Integer 형변환한 스트림 생서
//                            .sorted(Comparator.reverseOrder())//내림차순 정렬
//                            .mapToInt(a->a)//Integer를 int로 변환
//                            .toArray();//배열로 변환


    }
}
