package constractors;

public class CoffeeShop {

    public static void main(String[] args) {

    Barista barista1 = new Barista("John","senior barista",25);
    Barista barista2 = new Barista( "Ahmed","junior barista",15);
    Barista barista3 = new Barista( "Julia","intern barista",5);

    barista1.talkToClient("Nursultan");
    barista1.takeOrder("cappucino","Nursultan");
    barista1.washingHands(false);
    barista1.steamMilk("oat");
    barista1.gettingTips(1);


    barista2.washingHands(true);
    barista2.steamMilk("almond");
    barista2.takeOrder("flat white","Bena");
    barista2.gettingTips(2);
        System.out.println(barista2.jarOfTips);
        System.out.println(barista2.jarOfTips);

        Barista barista4 = new Barista( "Anna",true);
        barista4.position = "manager";
        barista4.takeOrder("latte","Feruza");



    }
}
