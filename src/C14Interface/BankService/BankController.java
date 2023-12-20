package C14Interface.BankService;

public class BankController {
    public static void main(String[] args) {
        BankAccount sim = new BankAccount("123456", 10000);

        BankService kakao = new BankKakaopayService();
        BankService card = new BankCardService();

        kakao.deposit(sim, 3000);
        kakao.withDraw(sim, 3000);
        card.deposit(sim, 300000);
        card.withDraw(sim, 100000);
    }
}


