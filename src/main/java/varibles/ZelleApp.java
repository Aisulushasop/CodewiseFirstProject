package varibles;

public class ZelleApp {

    public static void main(String[] args) {


        ZelleAccount user1 = new ZelleAccount("James Bond","773-773-8888", "Chase");
        user1.depositMoney(2000);
        user1.info();
        user1.transferMoney("773-90-9090", 200);
        user1.info();


        ZelleAccount user2 = new ZelleAccount("Kate", "630-773-8856", "Bank of America");
        user2.depositMoney(5000);
        user2.info();
        System.out.println();
         user1.depositMoney(4500);
        System.out.println("Total users: " + ZelleAccount.totalUsers);
        System.out.println("Zelle account total money: " + ZelleAccount.totalMoney);



    }
}
