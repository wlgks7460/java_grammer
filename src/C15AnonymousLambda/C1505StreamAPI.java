package C15AnonymousLambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C1505StreamAPI {
    public static void main(String[] args) throws NoSuchFieldException {

//        int[] arr = {20,10,4,22};
//        전통적인 방식의 데이터 접근 방식
//        for(int i=0; i<arr.length ; i++){
//            System.out.println(arr[i]);
//        }

////        데이터와 객체 중심이 아닌, 입력에 따르 출력만이 존제한즌 함수형 프로그래밍 방식
////        java에서 함수형프로그래밍을 지원하기 위한 라이브러리 -> StreamApi
////        forEach : 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a-> System.out.println(a));
//        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));
//
//        String[] myArr = {"world", "hello", "java"};
//
//        String[] newMyArr = Arrays.stream(myArr).sorted().toArray(String[]::new);
//        System.out.println(Arrays.toString(newMyArr));
//
//        int[] intArr = {1,2,3,4,5,6};
//        int answer = Arrays.stream(intArr).sum();
//        System.out.println(answer);

////      스트림의 생성
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
////      stream<객체> : 제네릭 타입으로 stream 객체가 생성
//        Stream<String> myStream = Arrays.stream(stArr);
//
//        int[] intArr = {10,20,30,40,50};
//        IntStream intStream = Arrays.stream(intArr);
//        int[] intArr2 = intStream.filter(a-> a>20).toArray();
//
////        참조변수의 스트림 변환의 경우 제네릭의 타입 소거 문제 발생
////        제네릭의 타입소거란 java버전의 호횐성을 위해 제네릭 타입을 런타임 시정에 제거하는 것을 의미
////        String[] stArr2 = myStream.filter(a->a.length()<=4).toArray(a->new String[a]);
////        매소드 참조 방식으로 표현하는 것이 더 일반적
////        매서드 참조 방식 : 클래스::매서드
//        String[] stArr2 = myStream.filter(a->a.length()<=4).toArray(String[]::new);
//        System.out.println(Arrays.toString(stArr2));
//
////        stream 중개 연산 : filter, map, sorted, distinct
//
////        distinct : 중복 제거 후 스트림 변환
//        int[] intArr = {10,10,30,30,50};
//
////        중복 제거후 종합 반환
//        int answer = Arrays.stream(intArr).distinct().sum();
//        System.out.println(answer);
//
//        String[] stArr = {"C++", "C++", "JAVA", "PYTHON"};
////        중복제거후 새로운 배열 생성
//        String[] answer2 = Arrays.stream(stArr).distinct().toArray(String[]::new);
//        System.out.println(Arrays.toString(answer2));
//
////        중복제거하고 길이가 3이하인 것으로 제한하고, 남은 배열의 길이의 종하합
////        mapToInt를 통해 IntSteam으로 변환
//        IntStream my = Arrays.stream(stArr).distinct().filter(a->a.length()<=3).mapToInt(a->a.length());
//        System.out.println(my.sum());

////        sorted : 정렬된 stream 변환
//        int[] arr = {4,1,2,3,5,6};
////        내림차순 정렬된 숫자 신규 배열 반환
//        int[] myArr = Arrays.stream(arr).sorted().toArray();
//
//        List<Integer> myList = new ArrayList<>(Arrays.asList(6,1,2,3,1,6));
////        collect(구체적인 컬렉션 객체명시)
//        List<Integer> myList2 = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(myList2);
//
//        List<String> stList = new ArrayList<>(Arrays.asList("java", "python", "C++", "javascript"));
////        streamAPI를 사용해서 길이가 4 이상인 문자열의 길이를 기준으로 내림 차순정렬 후 신규 List 생성
//        List<String> stList2 = stList.stream().filter(a->a.length()>=4).sorted((o1, o2) -> o2.length()-o1.length()).collect(Collectors.toList());
//        System.out.println(stList2);
//
//        int[] arr_plus10 = Arrays.stream(arr).map(a->a+10).toArray();
//        System.out.println(Arrays.toString(arr_plus10));
//
////        arr에서 짝수만 골라서 해당 수의 제곱의 총합을 구하라
//        int answer = Arrays.stream(arr).filter(a->a%2==0).map(a->a*a).sum();
//        System.out.println(answer);
//
////        스트림 소모 : forEach, reduce
//        int[] arr = {10,20,30,40};
//        Arrays.stream(arr).forEach(System.out::println);
//
////        reduce
////        초기값을 지정하지 않으면 Optional 객체 return
////        Optional 객체 : 값이 있을수도 있고, 없을 수도 있다는 것을 명시한 타입(java8 이후 추가
//        int result = Arrays.stream(arr).reduce(1,(a,b)->a*b);
//        System.out.println(result);
//
////        누적합
//        int result2 = Arrays.stream(arr).reduce((a,b)->a+b).getAsInt();
//        System.out.println(result2);
//

////        String answer = "hello, java, world"; 로 출력하기
//        String[] stArr = {"hello","java","world"};
//
//        Optional<String> answer = Arrays.stream(stArr).reduce((a,b)->a + ", " + b);
//        if(myOptional.isPresent()){
//            System.out.println(answer.get());
//        }
//        System.out.println(answer);
//
////        최소/최대/평균/총합/개수 : min/max/avergae/sum/count
//
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println(myList.stream().mapToInt(a->a).min().getAsInt());
//        System.out.println(myList.stream().mapToInt(a->a).max().getAsInt());
//        System.out.println(myList.stream().mapToInt(a->a).average().getAsDouble());
//        System.out.println(myList.stream().mapToInt(a->a).sum());
//        System.out.println(myList.stream().count());

////        findFirst
//        List<Student> myStudents = new ArrayList<>();
//        myStudents.add(new Student("kim",25));
//        myStudents.add(new Student("lee",33));
//        myStudents.add(new Student("park",35));
//        myStudents.add(new Student("choi",22));
//        myStudents.add(new Student("song",27));
////        Student s1 = myStudents.stream().filter(a->a.getAge()>=30).findFirst().get();
////        System.out.println(s1);
//
////        Student 객체 실습
////        1)가장 나이 어린 사람 찾기
//        System.out.println(myStudents.stream().sorted((a,b)->a.getAge()-b.getAge()).findFirst().get());
//        System.out.println(myStudents.stream().max((a,b)->b.getAge()-a.getAge()).get());
//        System.out.println(myStudents.stream().min((a,b)->a.getAge()-b.getAge()).get());
//
////        2)30대가 몇명인지 출력
//        System.out.println(myStudents.stream().filter(a->a.getAge()>=30).count());
//
////        3)모든 객체의 평균 나이 출력
//        System.out.println(myStudents.stream().mapToInt(a->a.getAge()).average().getAsDouble());
//
////        4)30세 이하 선착순 누구인지 출력
//        System.out.println(myStudents.stream().filter(a->a.getAge()<=30).findFirst().get());
//
////        기존 자바의 null
//        String st = null;
//        if(st != null){
//            System.out.println(st.compareTo("abc"));
//        }
//
////        java8이후에 나온 Optional 객체를 통해 특정 객체에 값이 없을 지도 모른다는 것을 명시적으로 표현
////        Optional 객체에 빈값을 명시적으로 넣는 방법 : Optional.empty();
        Optional<String> opt1 = Optional.empty();
//        빈값인지 아닌지 check하는 메서드 : isPresent()
        if(opt1.isPresent()) {
            System.out.println(opt1.get().compareTo("abc"));
        }else{
            System.out.println("값이 없습니다.");
        }

//        optional 객체 생성
        Optional<String> opt2 = Optional.ofNullable("hello"); //null있을 수도 있음을 의미

//        orElse관련 매서드 사용하여 null(빈값 검색)
//        orElse(), orElseGet(), orElseThrow()
//        orElse() : 값이 있으면 해당값 return, 없으면 default 지정값 return
        System.out.println(opt1.orElse("").compareTo("abc"));
//        orElseGet() : 값이 있으면 해당값 return, 없으면 람다함수 또는 메서드 참조 실행
        System.out.println(opt1.orElseGet(()->new String()).compareTo("abc"));
//        orElseThrow() : 값이 있으면 해당 값 return, 없으면 지정된 예외 강제 발생
        opt1.get();
        int result = opt1.orElseThrow(NoSuchFieldException::new).compareTo("abc");

//        Optional, OptionalDouble
        OptionalInt oi = new ArrayList<>(Arrays.asList(1,2,3,4)).stream().mapToInt(a->a).max();
//        isPresent로 check
        if(oi.isPresent()){
        }else{
        }

//        orelse 등의 방법 활용
        System.out.println(oi.orElseThrow(()-> new NoSuchFieldException("no value")));

    }
}
