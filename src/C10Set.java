import java.util.*;

public class C10Set {
    public static void main(String[] args) {

////        Set : 중복 없고, 순서 없다
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);

////        반 학생들이 좋아하는 운동 종목 : list로 만들고,
////        좋아하는 종목명의 갯수 추리도록 set으로 변환
//
//        List<String> myList = new ArrayList<>();
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");
//        System.out.println(myList);
//
////        list를 인자값으로 받아 초기값 세팅 가능
//        Set<String> mySet = new HashSet<>(myList);
//
////        for(String a : myList){
////            mySet.add(a);
////        }
//        System.out.println(mySet.size());

////        배열을 인자값으로 받아 초기값 세팅
//        String[] myArr = {"java","java", "python", "python", "C++"};
//        Set<String> mySet = new HashSet<>(Arrays.asList(myArr));
//        mySet.remove("java");
//        System.out.println(mySet);
//
//        Integer[] myArrInt = {1,2,3,4,4,3,2,};
//        Set<Integer> mySetInt = new HashSet<>();
//        for(int a : myArrInt){
//            mySetInt.add(a);
//        }
//        System.out.println(mySetInt);
//
//        Set<String> mySet1 = new HashSet<>(Arrays.asList("java","python","javascript"));
//        Set<String> mySet2 = new HashSet<>(Arrays.asList("java","html","css"));
//
////        교집합 : retainAll
//        Set<String> temp1 = new HashSet<>(mySet1);
//        temp1.retainAll(mySet2);
//        System.out.println(temp1);
//
////        합집합 : addAll
//        Set<String> temp2 = new HashSet<>(mySet1);
//        temp2.addAll(mySet2);
//        System.out.println(temp2);
//
////        차집합 : removeAll
//        Set<String> temp3 = new HashSet<>(mySet1);
//        temp3.removeAll(mySet2);
//        System.out.println(temp3);

//        순서가 없으므로 enhanced for문, iterator사용

////        LinkedHashSet, TreeSet
//        Set<String> mySet = new TreeSet<>();
//        mySet.add("hello5");
//        mySet.add("hello4");
//        mySet.add("hello3");
//        mySet.add("hello2");
//        mySet.add("hello1");
//        System.out.println(mySet);
////        두개뽑아서 더하기







    }
}
