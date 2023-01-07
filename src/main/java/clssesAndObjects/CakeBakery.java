package clssesAndObjects;

public class CakeBakery {
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

    public class Bakery {

        public static void main(String[] args) {

            clssesAndObjects.Cake Bisquick = new clssesAndObjects.Cake();
            Bisquick.name = " Magnoliya";
            Bisquick.type = " with chocolate";
            Bisquick.price = 23.45;
            System.out.println( Bisquick.name);

            Bisquick.bake();
            Bisquick.decorate();
            Bisquick.sell();

            clssesAndObjects.Cake Fruit = new clssesAndObjects.Cake();
            Fruit.name = "Cheesecake ";
            Fruit.type = " with strawberry";
            Fruit.price = 56.76;
            System.out.println( Fruit.name);
            Fruit.bake();
            Fruit.decorate();
            Fruit.sell();



        }

    }











}
