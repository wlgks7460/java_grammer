import java.util.*;

public class C09Map {

    public static void main(String[] args) {

////        <String, String> -> Map
////        삽입된 데이터에 순서가 없다.
//        Map<String,String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("basketball"));

////        size(), isEmpty() 사용 가능
////        이미 key가 있을 경우 put을 하면 덮어쓰기
//        myMap.put("basketball", "탁구");
////        업으면 put이 putIfAbsent
//        myMap.putIfAbsent("baseball", "배구");
//        System.out.println(myMap);
//
////        getOrDefault : key가 없으면  default 값 return
//        System.out.println(myMap.getOrDefault("tennis", "스포츠"));
//        System.out.println(myMap.containsKey("tennis"));
//
//        myMap.remove("baseball");
//        System.out.println(myMap);
//
//        System.out.println(myMap.keySet());
//        System.out.println(myMap.values());
//
////        enhanced for : key값 하나씩 출력.
//        for(String a : myMap.keySet()){
//            System.out.println(myMap.get(a));
//        }
//
////        iterator를 통해 key값 하나씩 출력
//        Iterator<String> myIter = myMap.keySet().iterator();
////        next()매서드는 데이터를 소모시키면서 return
//        System.out.println(myIter.next());
//        System.out.println(myIter);
//        hasNext : interator 값이 있는지 없는지
//        while(myIter.hasNext()){
//            System.out.println(myIter.next());
//        }

//        아래의 리스트를 가지고 좋아하는 운동 종목과 사람 숫자를 map 형태로 나타내시오.

        List<String> myList = new ArrayList<>();
        myList.add("basketball");
        myList.add("basketball");
        myList.add("basketball");
        myList.add("baseball");
        myList.add("baseball");
        myList.add("tennis");
        myList.add("tennis");
        myList.add("tennis");
        System.out.println(myList);

        Map<String , Integer> myMap = new HashMap<>();

        for(String a : myList){
//            if(myMap.containsKey(a)){
//                myMap.put(a, myMap.get(a) + 1);
//            }else{
//                myMap.put(a,1);
//            }

            myMap.put(a, myMap.getOrDefault(a,0)+1);
        }
        for(String a : myMap.keySet()){
            System.out.println(myMap.keySet(a) + "종목을 선택한 사람 수는 " + myMap.values(a) + "입니다.");
        }




    }
}
