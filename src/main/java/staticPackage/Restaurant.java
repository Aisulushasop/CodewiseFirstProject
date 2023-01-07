package staticPackage;

public class Restaurant {

    public static void main(String[] args) {

    Cook cook1 = new Cook("Ramsey Gordon");
    Cook cook2 = new Cook("Salt Bae");



   cook1.washHand();
   cook2.preparesalad();

   cook1.takeOrder("rib eye steak");
        System.out.println(cook2.order);


    Cook.takeOrder("pasta");
    cook2.takeOrder("fettucini");
        System.out.println(cook1.order);




    }



}
