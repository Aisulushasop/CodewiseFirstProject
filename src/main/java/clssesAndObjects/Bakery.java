package clssesAndObjects;

public class Bakery {

    public static void main(String[] args) {

       Cake Bisquick = new Cake();
       Bisquick.name = " Magnoliya";
       Bisquick.type = " with chocolate";
       Bisquick.price = 23.45;
        System.out.println( Bisquick.name);

     Bisquick.bake();
     Bisquick.decorate();
     Bisquick.sell();

      Cake Fruit = new Cake();
      Fruit.name = "Cheesecake ";
      Fruit.type = " with strawberry";
      Fruit.price = 56.76;
        System.out.println( Fruit.name);
      Fruit.bake();
      Fruit.decorate();
      Fruit.sell();



    }

    }

