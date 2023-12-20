package C14Interface.BankService;
//은행계좌 실습
//클래스명 BankAccount
//0)객체변수 : 졔좌번호(account_number),balance(잔고)
// 0-1)계좌번호 setter
//1)메서드 : 예금(deposit), 인출(withdraw)
// 1-1) deposit에 잔액이 충분해야 인출 가능
// 1-2) 잔액이 얼마 남았는지 확인하는 메서드
public class Temp {
//    public static void main(String[] args) {
//        BankAccount BankA1 = new BankAccount("0111-4444");
//        BankA1.deposit(10000);
//        BankA1.withdraw(4000);
//        BankA1.checkBalance();
//        System.out.println(BankA1.getAccount_number());
//
//    }
//
//}
//class
// {
//    private String account_number;
//    private int balance;
//
////    생성자란 클래스 객체화 될때 자동으로 실행되는 매서드
////    클래스명(){} : 생성자의 형태
////    별도의 생성자를 만들지 않으면 매개변수없는 기본 생성자가 숨겨져있다.
//
//    BankAccount(String account_number){
//        this.account_number = account_number;
//    }
//
//    public String getAccount_number() {
//        return account_number;
//    }
//
//    public void account_number_setter(String account_number) {
//        if (!account_number.contains("-")) {
//            System.out.println("계좌 번호 형식에 맞춰 주세요.");
//        } else {
//            System.out.println("정상처리 되었습니다.");
//            this.account_number = account_number;
//
//        }
//    }
//
//    public void deposit(int money) {
//        this.balance += money;
//        System.out.println(money + "원 입금되었습니다.");
//    }
//
//    public void withdraw(int money) {
//        if(balance>= money){
//            System.out.println(money + "원 출금 되었습니다.");
//            balance -= money;
//        }else{
//            System.out.println("잔액이 부족합니다.");
//        }
//    }
//
//    public int checkBalance() {
//        System.out.println(balance);
//        return this.balance;
//    }
//    }
}
