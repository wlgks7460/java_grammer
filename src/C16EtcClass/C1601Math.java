package C16EtcClass;

public class C1601Math {
    public static void main(String[] args) {

////        0.0 - 1.0미만의 임의 double헝을 반환
//       double randomValue = Math.random();
//        System.out.println((int)(randomValue*100));

//        abs() 매소드 : 절대값 반환
        System.out.println(Math.abs(-5));

//        floor() : 소수점 내림, ceil() : 소숫점올림, round : 소숫점반올림
        System.out.println(Math.floor(5.7));
        System.out.println(Math.floor(5.7));
        System.out.println(Math.floor(5.7));

//        max, min
        System.out.println(Math.max(5,8));
        System.out.println(Math.min(5,8));

//        pow(a,b) : 제곱 연산 수행 -> a의 b제곱
        System.out.println(Math.pow(5,2));

//        sqrt() : 제곱근 연산 수행
        System.out.println(Math.sqrt(25));

//        소수구하기
        int n = 100;
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.println("소수가 아닙니다.");
                break;
            }
        }
    }
}
