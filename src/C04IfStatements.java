import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {

//        도어락 if문 예제
//        String answer = "1234";
//        System.out.println("비밀번호를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        if(answer.equals(input)){
//            System.out.println("문이 열렸습니다");
//        }else{
//            System.out.println("비밀번호가 틀렸습니다.");
//        }
//
//        묵시적 타입변환, 각 문자가 숫자를 가지고 있다.
//        사용자한테 알파벳을 아무거나 입력받고, 그 알파벳이 대문자인지 소문자인지 판별
//        System.out.println("아무알파벳을 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        char input = sc.nextLine().charAt(0);
//        if(input >='a' && input <= 'z'){
//            System.out.println("소문자입니다.");
//        }else if(input >='A' && input <= 'Z'){
//            System.out.println("대문자입니다.");
//        }else{
//            System.out.println("알파벳이 아닙니다.");
//        }

//        버스카드 예제
//        내 돈이 얼마있는지를 입력
//        버스 요금이 1500이다.
//        돈이 적으면 탑승 불가, 돈이 더 많으면 정산 처리 출력
//        도난 여부를 boolean 설정(입력 x)

//        case1 &&를 사용
//        System.out.println("버스 잔액을 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        int myMoney = sc.nextInt();
//        boolean isStolen = false;
//        if(myMoney >= 1500 && isStolen==false){
//            System.out.println("정상처리 되었습니다.");
//        }else{
//            System.out.println("잔액이 부족합니다.");
//        }

//        case2 ||을 사용
//        boolean isStolen = false;
//        System.out.println("도난카드입니까? 예/아니오로 대답하시오");
//        Scanner sc1 = new Scanner(System.in);
//        if(sc1.nextLine().equals("예")){
//            isStolen = true;
//        }
//        System.out.println("버스 잔액을 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        int myMoney = sc.nextInt();
//        if(myMoney < 1500 || isStolen==true){
//            System.out.println("잔액이 부족합니다.");
//        }else{
//            System.out.println("정상처리 되었습니다.");
//        }

////        도어락키 삼항연산자
//        String answer = "1234";
//        System.out.println("비밀번호를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String result = input.equals(answer) ? "문이 열렸습니다" : "비밀번호가 틀렸습니다.";
//        System.out.println(result);
//
//        myMoney = 10000
//        택시요금 : 10000
//        버스요금 : 3000
//        킥보드 : 2000
//        걸어가기 : 0
//        if else와 if의 차이는 if는 독립적 (범위 설정 유의) if else는 연결됨
//        int myMoney = 150;
//        int taxiFee = 10000;
//        int busFee = 3000;
//        int kickBoardFee = 2000;
//        if(myMoney >= taxiFee) {
//            System.out.println("택시를 타시오");
//        }else if(myMoney >= busFee && myMoney < taxiFee){
//            System.out.println("버스를 타시오");
//        }else if(myMoney < busFee && myMoney >= kickBoardFee){
//            System.out.println("킥보드를 타시오");
//        }else{
//            System.out.println("걸어가시오");
//        }

//        switch 고객센터 출력 예제
//        원하시는 번호를 입력해주세요
//        1.대출 2.예금 3.적금 0.상담사연결 그외.잘못누르셨습니다.

//        System.out.println("원하시는 번호를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        switch(input){
//            case 1 :
//                System.out.println("대출 서비스입니다.");
//                break;
//            case 2 :
//                System.out.println("예금 서비스입니다.");
//                break;
//            case 3 :
//                System.out.println("적금 서비스입니다.");
//                break;
//            case 0 :
//                System.out.println("상담사연결입니다.");
//                break;
//            default :
//                System.out.println("잘못누르셨습니다.");
//                break;
//        }


    }
}
