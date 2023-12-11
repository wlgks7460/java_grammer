import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.OptionalInt;

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


////        선택정렬 구현하기
////        내림차순
//        int[] arr = {30,22,20,25,12};
//        for(int i = 0; i < arr.length ; i++){
//            for(int j = i+1 ; j < arr.length-1 ; j++){
//                if(arr[i]<arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
////        오름차순
//        for(int i = 0; i < arr.length-1; i++){
//            for(int j = i+1 ; j < arr.length; j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
////
////        숫자 조합의 합 : 각기 다른 숫자의 배열이 있을 때 만들어질 수 있는 2개의 조합의 합을 출력하라.
//
//        int[] int_arr = {10,20,30,40,50,60};
//
//        for(int i = 0 ; i < int_arr.length ; i++){
//                for(int j = i+1 ; j < int_arr.length-1; j++){
//                    System.out.println(int_arr[i] + " + " + int_arr[j] + " = " + (int_arr[i]+int_arr[j]));
//                }
//            }

//////        중복 제거하기
////        int[] temp = {10,10,40,5,7};
//////        배열복사
////        int[] new_temp = Arrays.copyOfRange(temp,0, 3);
////        System.out.println(Arrays.toString(new_temp));
//
//        int[] temp = {10,10,40,5,7};
//        Arrays.sort(temp);
//        int[] new_temp = new int[temp.length];
//        int index = 0;
//        for(int i =0; i <temp.length; i++){
//            if(i==temp.length-1){
//                new_temp[index] = temp[i];
//                index++;
//                break;
//            }
//            if(temp[i] != temp[i+1]){
//                new_temp[index] = temp[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(new_temp));
//        System.out.println(index);
//
//        int[] answer = Arrays.copyOfRange(new_temp,0,index);
//        System.out.println(Arrays.toString(answer));

//        프로그래머스 : 두개 뽑아서 더하기

////        버블 정렬
//
//        int[] arr = {7,10,5,1,2};
//        boolean isChanged = false;
//
//        for(int i  = arr.length ; i >0 ; i-- ){
//            for(int j = 0 ; j<i-1 ;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    isChanged = true;
//                }
//            }
//            if(isChanged == false){
//                break;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));

////        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int answer = 0;
//        for(int i =0; i<arr.length; i++){
//            if(arr[i]==8){
//                answer=i;
//                break;
//            }
//        }
//        System.out.println(answer);

//        이진검색(Binary Search)
//        사전에 오름차순 정렬이 되어 있어야 이진 검색 가능

//        int[] arr = {1,3,6,8,9,11};
//        int answer = Arrays.binarySearch(arr,8);
//        System.out.println(answer);

////        배열간 비교 = equals : 순서까지 같아야 true
////        int[] arr1 = {10,20,30};
////        int[] arr2 = {10,20,30};
////        System.out.println(Arrays.equals(arr1,arr2));
////
//////        배열복사 : copyOf(대상 배열, endindex)
//////        copyOfRange(대상 배열, startindex, endindex)
////
////        int[] arr = {10,20,30,40,50};
////        int[] new_arr1 = Arrays.copyOf(arr,10); //[10, 20, 30, 40, 50, 0, 0, 0, 0, 0]
////        int[] new_arr2 = Arrays.copyOfRange(arr,1,4); //[20, 30, 40]
////        System.out.println(Arrays.toString(new_arr1));
////        System.out.println(Arrays.toString(new_arr2));

//        2차원 배열 : 배열 안에 또다른 배열이 있는 경우

////        2차원 배열 할당
//        int[][] arr = new int[2][3];
////        {{1,2,3},{4,5,6]}
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//        System.out.println(Arrays.deepToString(arr));
//
////        2차원 가변 배열 선언 및 할당
//        int[][] arr2 = new int[3][]; //가변 배열 앞의 size  할당 해야함
//        arr2[0] = new int[1];
//        arr2[1] = new int[2];
//        arr2[2] = new int[3];
////        arr2[0][0] =10;
////        arr2[1][0] =20;
////        arr2[2][0] =30;
//        System.out.println(Arrays.deepToString(arr2));
//
//
////        가변 배열 리터럴 방식
//        int[][] arr3 = {{10},{10,20},{10,20,30}};
//        System.out.println(Arrays.deepToString(arr3));

////        [3][4] 사이즈의 배열을 선언한뒤
////        1,2,3~ 까지의 숫자값을 각 배열에 할당
//        int[][] arr4 = new int[3][4];
//        int count = 1;
//        for(int i =0; i<arr4.length;i++){
////            int count = 1; //{1,2,3,4},{1,2,3,4},{1,2,3,4}
//            for(int j = 0 ; j <arr4[i].length; j++){
//                arr4[i][j]= count;
//                count ++;
//            }
////          count++; //{1,1,1,1},{2,2,2,2},{3,3,3,3}
//        }
//        System.out.println(Arrays.deepToString(arr4));
//
////        가변배열 만들기 : 전체사이즈5
////        각 배열 마다 사이즈 1,2,3,4,5로 증가 하도록
////        각 사이즈 별로 1은 10, 2는 20, 3은 30이 들어가도록
//
//        int[][] arr5 = new int[5][];
//        for(int i = 0; i<arr5.length; i++){
//            arr5[i] = new int[i+1];
//            for(int j = 0 ; j <arr5[i].length ; j++){
//                arr5[i][j] = (i+1)*10;
//            }
//        } //[[10], [20, 20], [30, 30, 30], [40, 40, 40, 40], [50, 50, 50, 50, 50]]
//        System.out.println(Arrays.deepToString(arr5));







    }
}
