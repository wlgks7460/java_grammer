package C12ClassLecture;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Pattern;

public class C1203Class2 {
    public static void main(String[] args) {
        Person myPerson1 = new Person();
//        변수값에 직접 접근하여 값을 할당하는 방식
        myPerson1.setName("홍길동");
        myPerson1.setEmail("hong@naver.com");
        myPerson1.setAge(20);
        System.out.println("이름은 " + myPerson1.getName() + "나이는 " + myPerson1.getAge() + " 입니다.");

        Person myPerson2 = new Person();
//        변수값에 직접 접근하여 값을 할당하는 방식
        myPerson2.setName("홍길동2");
        myPerson2.setEmail("hong2@naver.com");
        myPerson2.setAge(22);
        System.out.println("이름은 " + myPerson2.getName() + "나이는 " + myPerson2.getAge() + " 입니다.");

    }
}

class Person{
    private String name;
    private String email;
    private int age;

//    getter. setter 세팅
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( name.length() > 10){
            System.out.println("이름이 너무 깁니다.");
        }else {
            this.name = name;
            System.out.println("정상");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("@")){
            System.out.println("이메일 형식을 맞춰 주세요.");
        }else{
            System.out.println("정상");
            this.email = email;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age < 20){
            System.out.println("나이가 너무 깁니다.");
        }else {
            this.age = age;
            System.out.println("정상");
        }
    }

}
//Person클래스를 만들고,
//객체변수는 name, email, password, age
//객체매서드 whoIs() : name, email, password, age,입니다 -> 출력
//객체 생서후 whoIs메서드 호출
