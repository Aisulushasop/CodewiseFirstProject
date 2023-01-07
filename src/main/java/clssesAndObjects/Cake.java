package clssesAndObjects;

public class Cake {


    String type;
    String name;

    double price;

    public void bake() {

        System.out.println(name + " is baking" + " price  is  " + price);

    }

    public void sell() {
        System.out.println(name + type + " is selling" + " price is " + price);
    }

    public void decorate() {
        System.out.println(name + type + " is decorating" + " price is " + price);
    }

}

