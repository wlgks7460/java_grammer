package C16EtcClass;

import java.util.Arrays;

public class C1603GenericMain {
    public static void main(String[] args) {

        String[] stArr = {"java", " python" , "C++"};
//        0번째와 1번째 자리 change
//        String temp = stArr[0];
//        stArr[0] = stArr[1];
//        stArr[1] =temp;
//        stSwap(stArr,0,2);
        swap(stArr,0,1);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {1,2,3,4,5};
//        1번째와 2번째 자리 change
//        Integer temp2 = intArr[2];
//        intArr[2] = intArr[1];
//        intArr[1] =temp2;
//        intSwap(intArr,3,4);
        swap(intArr,2,3);
        System.out.println(Arrays.toString(intArr));

        GenericStudent<String> stStudent = new GenericStudent<>();
        stStudent.setAge("15");
        stStudent.setName("김지한");
        System.out.println(stStudent.getName());
        System.out.println(stStudent.getAge().getClass());

        GenericStudent<Integer> stStudent2 = new GenericStudent<>();
        stStudent2.setAge(18);
        stStudent2.setName("김지한2");
        System.out.println(stStudent2.getName());
        System.out.println(stStudent2.getAge().getClass());



    }

//    static void stSwap(String[] stArr, int a,int b){
//        String temp2 = stArr[b];
//        stArr[b] = stArr[a];
//        stArr[a] =temp2;
//    }
//
//    static void intSwap(Integer[] intArr, int a, int b){
//        Integer temp = intArr[b];
//        intArr[b] = intArr[a];
//        intArr[a] =temp;
//    }


//    제네릭 매서드 생성 : 반환타입 왼쪽에 <T> 선언
//    제네릭은 객체 타입이 들어와햐함에 유의
     static <T> void swap(T[] arr, int a, int b){
        T temp = arr[b];
         arr[b] = arr[a];
         arr[a] =temp;
    }

    static class GenericStudent<T>{
        private String name;
        private T age;

        public String getName() {
            return name;
        }

        public T getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(T age) {
            this.age = age;
        }
    }
}
