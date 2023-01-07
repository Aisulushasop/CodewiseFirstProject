package practiceWhithKsenia;

import java.util.SplittableRandom;

public class BankOfAmerica {

    String fullName;
    String phoneNumber;
    String address;
    double balance;
    boolean isPersonal;
    String email;

    static int totalUsers;
    static double totalBankMoney;

 public BankOfAmerica(String fullName,String phoneNumber,String email){
     this.fullName = fullName;
     this.phoneNumber= phoneNumber;
     this.email = email;
     totalUsers++;
 }


public void addMoney(double money){

     this.balance+=money;
   totalBankMoney +=money;
    System.out.println("Now in your acconumn" + this.balance);


}

public void sendMoney( double money, String phoneNumber) {
    if (this.balance >= money && money <= 1000) {
        System.out.println(this.fullName + money + " was succesfully made to" + phoneNumber);
        this.balance -= money;
    } else if (this.balance > +money && money > 1000) {
        System.out.println("Transfer limit is exceeded");
    }

        System.out.println("Insufficient funds. Transfer failed");
    }

public void displayIfo(){
    System.out.println("Name:" + this.fullName);
    System.out.println("Phone number:" + this.phoneNumber);
    System.out.println("Account balance:" + this.balance);
    System.out.println("Email:"+this.email);

}
public void bankInfo(){
    System.out.println("Users:" + totalUsers);
    System.out.println( "Total amount deposited:" + totalBankMoney);
}


}
