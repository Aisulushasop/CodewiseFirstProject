package practiceWhithKsenia;

public class BofaApp {

    public static void main(String[] args) {
        BankOfAmerica user1 = new BankOfAmerica("Anna D","+1 5677 567","codewise");

        user1.addMoney(500);
        user1.displayIfo();
        user1.sendMoney(200,"4748940-8");
        user1.displayIfo();
        user1.sendMoney(1200,"435-467");
        user1.sendMoney(5000, "5768687090");
    }

}
