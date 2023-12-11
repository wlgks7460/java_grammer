import java.util.*;

public class C08List {
    public static void main(String[] args) {

//        List 선언 방법
//        ArrayList<String> myList = new ArrayList<String>();
//        ArrayList<String> myList = new ArrayList<>();

//        가장 일반적인 방식
//        왼쪽엔 인터페이스, 오른쪽엔 구현체
        List<String> myList = new ArrayList<>();

//        초기값 생성방법1 : 하나씩 add
        myList.add("java");
        myList.add("python");
        myList.add("c++");
        System.out.println(myList);


//        초기값 설정방법2. 한꺼번에 add(배열을 이용한 변환)
        String[] myArr1 = {"java", "python", "c++"};
        List<String> myList2 = new ArrayList<>(Arrays.asList(myArr1));

//        배열이 int인 걍우 -> 형변환 이슈 발생
        int[] myIntArr1 = {1,2,3};
        List<Iterator> myIntList1 = new ArrayList<>(Arrays.asList(myIntArr1));

        for(int a : myIntArr1){
            myIntList1.add(a);
        }


    }
}
