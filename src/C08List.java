import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {

//        List 선언 방법
//        ArrayList<String> myList = new ArrayList<String>();
//        ArrayList<String> myList = new ArrayList<>();

////        가장 일반적인 방식
////        왼쪽엔 인터페이스, 오른쪽엔 구현체
//        List<String> myList = new ArrayList<>();
//
////        초기값 생성방법1 : 하나씩 add
//        myList.add("java");
//        myList.add("python");
//        myList.add("c++");
//        System.out.println(myList);
//
//
////        초기값 설정방법2. 한꺼번에 add(배열을 이용한 변환)
//        String[] myArr1 = {"java", "python", "c++"};
//        List<String> myList2 = new ArrayList<>(Arrays.asList(myArr1));
//
////        배열이 int인 걍우 -> 형변환 이슈 발생
//        int[] myIntArr1 = {1,2,3};
//        List<Iterator> myIntList1 = new ArrayList<>(Arrays.asList(myIntArr1));

//        for(int a : myIntArr1)myIntList1.add(a);

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
////        add(int index, int element) : 중간에 값 삽입은 기본적으로 성능 저하
//        myList.add(1,15);
//        System.out.println(myList);
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(30);
//        myList2.add(40);
//        myList2.add(50);
//
////        addALL(Collection 객체) : 특정 리스트의 요소를 모두 add
//        myList.addAll(myList2);
//        System.out.println(myList);
//
////        get(int index) : 특정 위치의 요소를 변환
//        System.out.println(myList.get(0));
////        for문을 돌려서 전체 출력
////        size() : 리스트의 개수 변환
//        for(int i =0; i < myList.size() ; i++){
//            System.out.println(myList.get(i));
//        }
//
////        remove : 요소삭제
////        remove는 value삭제, index를 통한 삭제
//
////        remove를 통한 index삭제 : 0 번째
//        myList.remove(0);
//        System.out.println(myList);
////        remove를 통한 value 삭제 : 15 값 삭제
////        객체를 통한 삭제 : Integer.valueOf
//        myList.remove(Integer.valueOf(15));
//        System.out.println(myList);
//
////        set(int index, E element) : index자리에 값 변경
////        마지막 자리값 : 100으로 출력
//        myList.set(myList.size()-1, 100);
//        System.out.println(myList);
//
////        contains(E element) : 특정 값이 있는지 없는지 boolean return;
//        System.out.println(myList.contains(100));

//        List<Integer> myList = new ArrayList<>();
//
//        myList.add(10);
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
////        indexOf : 몇번째 index에 위치한지 return , 요소가 없으면 -1 return
////        같은 숫자가 있으면 첫번째 index값을 return
//        System.out.println(myList.indexOf(20));
//
////        전체삭제 : clear()
////        isEmpty : 값이 비었늕, 안비었는지
//        System.out.println(myList.isEmpty());
//        myList.clear();
//        System.out.println(myList.isEmpty());
//        System.out.println(myList);

//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{1,2,3});
//        myList.add(new int[2]);
//        myList.add(new int[3]);
//        myList.get(1)[0]=10;
//        myList.get(1)[1]=20;
//
//        for(int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }

////        위 list에 값 1,2,3  10,20,30 100,200,300
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//
//        int value = 1;
//        for(int i = 0 ; i < myList.size(); i++){
//            for(int j=0; j<myList.get(i).length ; j++){
//                myList.get(i)[j] = (j+1)*value;
//            }
//            value *= 10;
//        }
//        for(int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }
//
////        컬랙션 클래스를 이용한 정렬
//
//        List<Integer> myList = new ArrayList<>(Arrays.asList(5,3,2,1,5));
//////        리스트정렬1 : Collection.sort()
//        Collections.sort(myList);//오름차순
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());//내림 차순
//        System.out.println(myList);
//
////        리스트정렬2 : 객체, sort()
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);

////        String 배열을 List로 변환
//        String[] stArr = {"c", "java", "python", "c++"};
////        1-1. Arrays.asList
//        List<String> stList1 = new ArrayList<>(Arrays.asList(stArr));
////        1-2.for문 담기
//        List<String> stList2 = new ArrayList<>();
//        for(String a : stArr){
//            stList2.add(a);
        }
////        1-3.streamApi
//        List<String> stList3 = Arrays.stream(stArr).collect(Collectors.toList());

//        2. int배열을 list로 변환
//        1.1 Arrays.asList 사용불가
//        1.2 for문 사용 가능
//        1.3 streamApi 사용 가능

////        3.String리스트를 String배열로 변환
//        List<String> stlist = new ArrayList<>(Arrays.asList("hello","java","world"));
//        String[] stArr = new String[stlist.size()];
//        for(int i=0; i < stArr.length; i++){
//            stArr[i] = stlist.get(i);
//        }
//
////        3-2)streamApi : 참고
//        String[] stArr2 = stlist.stream().toArray(a->new String[a]);

//        4.int리스트를 int배열로 변환
//        4-1)for문으로 변환
//        4-2)streamAPI로 변환

////        두개뽑아서 더하기
//
//
//            List<Integer> numbers_list = new ArrayList<>();
//
//            for(int i = 0 ; i < numbers.length-1 ; i++){
//                for(int j = i+1 ; j < numbers.length; j++){
//                    if(!numbers_list.contains(numbers[i] + numbers[j])){
//                        numbers_list.add(numbers[i] + numbers[j]);
//                    }
//                }
//            }
//            Collections.sort(numbers_list);
//
//            int[] answer = new int[numbers_list.size()];
//            for(int i =0; i<numbers_list.size(); i++){
//                answer[i] = numbers_list.get(i);
//            }

//    n의 배수 고르기





//    }
}
