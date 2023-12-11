import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {

////        참조자료형 : 기본 자료형을 제외한 모든 자료형
////        Wrapper class : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스
//        int와 Integer간의 형변환
//
//        int a = 10;
//        Integer b = new Integer(20);
////        오토언박싱 : Integer에서 int로 형변환
//        int c = b;
////        언박싱 : Integer에서 int로 형변환
//        int d = b.intValue();
////        오토박싱
//        Integer e = a;
////        박싱
//        Integer f = Integer.valueOf(b);

////        String과 int의 형변화
//        int a = 10;
//        String st_a = Integer.toString(a); //"10"
//        String st_a2 = String.valueOf(a);
//        int c = Integer.parseInt(st_a); // "10" -> 10
//
////        참조자료형에 원시자료형을 담을 때는 wrapper 클래스를 써야한다. ex)컬렉션 프레임워크(List, set)
//        List<Integer> list_a = new ArrayList<>();
//        list_a.add(10);
//        list_a.add(20);
//        list_a.add(30);
//        System.out.println(list_a);

////        String popl, String 객체
//        String mySt1 = new String("hello");
//        String mySt2 = new String("hello");
//        String mySt3 = "hello";
//        String mySt4 = "hello";
//        String mySt5 = mySt1;
//        System.out.println(mySt1==mySt2); //false
//        System.out.println(mySt2==mySt3); //false
//        System.out.println(mySt3==mySt4); //true
//        System.out.println(mySt1==mySt5); //true
//
//        System.out.println(mySt1.equals(mySt2)); //ture
//        System.out.println(mySt2.equals(mySt3)); //ture
//        System.out.println(mySt3.equals(mySt4)); //true
//        System.out.println(mySt1.equals(mySt5)); //true

////        문자열길이 : length();
//        String mySt = " hello ";
//        System.out.println(mySt.length());
//
////        indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치 변환
//        String mySt2 = "hello java java";
//        int mySt_index = mySt2.indexOf("java"); // 시작점의 자바 리턴
//        System.out.println(mySt_index);

////        contains : 특정 문자열이 있는지 없는지 여부를 boolean으로 리턴
//        String mySt = " hello ";
//        System.out.println(mySt.contains("hello"));
//
////        charAt : 특정 index의 문자 값을 리턴
//        String a = "hello";
//        char myChar = a.charAt(1);
//        System.out.println(myChar);

////        charAt과 length를 활용한 문자 a의 개수
//        String st = "abcdefabaaf";
//        int count = 0;
//        for(int i =0; i<st.length(); i++){
//            if(st.charAt(i) == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

////        substring(a,b) : a이상 b 미만의 index를 자른다.
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st1.length()));

////        trim, strip : 왼쪽에 있는 공백, 오른쪽에 있는 공백 제거
//        String trimSt = "    hello world   ";
//        String new_trimSt = trimSt.trim();
//        String stripSt = trimSt.strip();
//        System.out.println(new_trimSt);
//        System.out.println(stripSt);

////        toUpperCase, toLowerCase
//        String a = "Hello";
//        String a1 = a.toUpperCase();
//        String a2 = a.toLowerCase();
//        System.out.println(a1);
//        System.out.println(a2);

////        문자열 더하기 : +=
//        String a = "hello";
//        a += " world";
//        a += " world";
//        a += " world";
//        a += " world";
//        a += " world";
//        System.out.println(a);

////        char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//
//
//        String str = "01abc123한글123";
//        String str2 = " ";
////        알파벳만 빼고 문자를 str2에 새롭게 담기
//        for(int i=0; i<str.length(); i++){
//            char temp = str.charAt(i);
//            if( temp<'a' ||  temp> 'z'){
//                str2 += Character.toString(temp);
//            }
//        }
//        System.out.println(str2);

//        replace(a,b) : a문자를 b문자로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world","java");
//        System.out.println(st2);
////        replaceAll(a,b)
//        String st3 = st1.replaceAll("world","python");
//        System.out.println(st3);
//
//        String str = "01abc123한글123ABC";
////        [a-z] : 소문자 알파벳
//        String str2 = str.replaceAll("[a-z]","");
//        System.out.println(str2);
////        [가-힣] : 한글
//        String str3 = str.replaceAll("[가-히]","");
//        System.out.println(str3);
////        [0-9] : 숫자
//        String str4 = str.replaceAll("[0-9]","");
//        System.out.println(str4);
////        [A-Za-z] : 알파벳 전체
//        String str5 = str.replaceAll("[A-Za-z]","");
//        System.out.println(str5);
////        [A-Za-z0-9] : 알파벳 전체와 숫자
//        String str6 = str.replaceAll("[A-Za-z0-9]","");
//        System.out.println(str6);

////        Pattern 클래스
//        boolean matcher = Pattern.matches("[a-z]", "helloworld"); //true
//        System.out.println(matcher);

////        전화번호 검증
////        \\d : 숫자, {}: 연속으로
//        boolean matcher2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", "010-1234-1234");
//        System.out.println(matcher2);

////       이메일 검증
//        boolean matcher3= Pattern.matches("^[a-z0-9]+@[a-z]+.com$", "hello@naver.com");
//        System.out.println(matcher3);

////        split : 문자열 나누기 , String 배열로 반환
//        String a = "a:b:c:d";
//        String[] stArr = a.split(":");
//        System.out.println(Arrays.toString(stArr));
//        String b = "a  b c d";
//        String[] stArr2 = b.split(" ");
//        System.out.println(Arrays.toString(stArr2));
//        String[] stArr3 = b.split("\\s+"); //여러개의 공백
//        System.out.println(Arrays.toString(stArr3));

////        isEmpty와 null 구분
//        String st1 = null;
//        String st2 = "";
//        System.out.println(st1==null);
//        System.out.println(st2==null);
//        System.out.println(st2.isEmpty());
////        NullPointerException 예외 발생
//        System.out.println(st1.isEmpty());

////        join : String[] -> String
////        String.join(지정구분, 문자배열);
//        String[] arr = {"HTML","CSS","PTYHON"};
//        String a = String.join(" ", arr);
//        System.out.println(a);

////        StringBuffer : 문자열을 추가하거나 변경할 때 주로 사용하는 객체
//        String st1 = "hello";
//        StringBforuffer sb1 = new StringBuffer(st1);
//        System.out.println(sb1); //hello
//        sb1.append(" world");
//        System.out.println(sb1); //hello world
//        sb1.insert(5," java");
//        System.out.println(sb1); //hello java world
//        System.out.println(sb1.substring(6,10));//java
//        sb1.delete(5,10);
//        System.out.println(sb1); //hello world
//
////        성능 : String < Stringbuffer < StringBuilder (스레드 safe x)
//        StringBuilder sb2 = new StringBuilder("hello");
//        sb2.append(" world");
//        System.out.println(sb2);

//        프로그래머스 : 문자열 밀기






    }
}
