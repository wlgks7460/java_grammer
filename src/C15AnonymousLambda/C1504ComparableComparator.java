package C15AnonymousLambda;

import java.util.*;

public class C1504ComparableComparator {
    public static void main(String[] args) {
////        자바에서는 비교를 위한 인터페이스가 대표적으로 2개 제공 : Comparable, Comparator
////        Comparable 인터페이스에는 compareTo 매서드가 선언, 그리고 java의 많은 클래스에서 구현하고 있음 => 일반적으로 클래스내에서 직접 구현하여 사용하는 방ㅇ식
////        Comparator 인터페이스에는 compare매서드가 선언 => 일반적으로 익명 객체를 만들어서 활용
//
////        두 문자열의 각 문자를 앞에서부터 순차적으로 비교
////        문자열의 자릿수의 차이가 발생할때, 그 문자의 윤니코드 값의 차이를 변환
//        String a = "hello";
//        String b = "horld";
//        System.out.println(a.compareTo(b));
//
//        Integer intA =1;
//        Integer intB =1;
//        System.out.println(intA.compareTo(intB));
//
//        List<String> myList = new ArrayList<>();
//        myList.add(a);
//        myList.add(b);
//        Collections.sort(myList); //Comparable의 compareTo매서드를 통해 정렬오름차순
//        Collections.sort(myList, Comparator.naturalOrder());
//        Collections.sort(myList, Comparator.reverseOrder());
//
//        List<Student> studentList = new ArrayList<>();
//
//        studentList.add(new Student("kim",11));
//        studentList.add(new Student("lee",18));
//        studentList.add(new Student("ko",17));
//        studentList.add(new Student("park",13));
//        studentList.add(new Student("jung",12));
//
//
////        방법1 : Comparator를 익명 객체 방식으로 활용하여 정렬, 매개변수 2개
////        나이로 정렬
//        studentList.sort((o1,o2) -> o1.getAge() - o2.getAge());
//        System.out.println(studentList);
//
////        studentList.sort(new Comparator<Student>() {
////            @Override
////            public int compare(Student o1, Student o2) {
//////                기본은 오름차순 정렬하려고 시도
//////                o1.getAge()가 더 작은 숫자다 라고 가정
////                return o1.getAge() - o2.getAge() ;
////            }
////        });
////        System.out.println(studentList);
//
////        이름으로 정렬
//        studentList.sort((n1,n2)-> n1.getName().compareTo(n2.getName()));
//        System.out.println(studentList);
//
////        글자 길이 수로 오름차순 정렬
//        String[] stArr = {"hello", "world", "C++", "world2"};
//        Arrays.sort(stArr,((o1, o2) -> o1.length() - o2.length()));
//        System.out.println(Arrays.toString(stArr));
////        Priority Queue 내림차순
//        Queue<String> myQue = new PriorityQueue<>((o1, o2) -> o2.length() - o1.length());
//
////        3,30,34,5,9 : 문자
//
//
//
//
////        방법2 : Comparable 인터페이스 implements 후 compareTo 매서드 구현, 매개변수 1개
//        Collections.sort(studentList);
//        System.out.println(studentList);

//        쓰레드 구현방식 : 쓰레드 상송, Runnable 방식

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로만든 쓰레드입니다.");
            }
        });
        t1.start();
//        간단하게
        new Thread(() -> System.out.println("새로만든 쓰레드입니다.")).start();
        System.out.println("main의 쓰레드입니다.");





    }
}

    class Student implements Comparable<Student>{
        private String name;
        private int age;
        Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }


//        조상 클래스인 Object 클래스의 toString을 overriding하여 객체 호출시 자동으로 toString매서드 호출
        @Override
        public String toString(){
            return "이름는 " + this.name + " 나이는 " + this.age;
        }

        @Override
        public int compareTo(Student o) {
            return this.name.compareTo(o.name);
        }
    }



