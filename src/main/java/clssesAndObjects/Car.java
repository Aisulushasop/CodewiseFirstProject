package clssesAndObjects;

public class Car {

  String tires;
  String wheel;
  String window;
  String lights;
  String color;
  int year;
  double price;
  String carMake;

  public void drive (){

    System.out.println( carMake + " " + tires +  " is driving " );
  }

public void stop (){
  System.out.println(   wheel + " " + carMake   + " is stoping " );
}
public void heat () {
  System.out.println(window + " " + carMake + " is heat");
}
  public void cool (){
  System.out.println(   carMake + " is cool");
}
public  void playMusic () {
  System.out.println( carMake + " is play music" );
}

    public void isExpensive() {

      System.out.println( year + " year " + carMake + " " + " " + "is Expensive");

  }

}

class Garage1 {
  public static void main(String[] args) {
    Car mercedes = new Car();
    Car rangeRover = new Car();
    Car lexus = new Car();
    Car toyota = new Car();

    mercedes.carMake = "mercedes";
    mercedes.tires = "premium";
    mercedes.wheel = "optimal";
    mercedes.window = "rust";
    mercedes.lights = " led";
    mercedes.color = "White";
    mercedes.year = 2022;
    mercedes.price = 1200;

    rangeRover.carMake = "Range Rover";
    rangeRover.tires = " regular";
    rangeRover.wheel ="escape";
    rangeRover.window = "uncut";
    rangeRover.lights = "jushop";
    rangeRover.color = "red";
    rangeRover.year = 2021;
    rangeRover.price = 3455;

    lexus.carMake = "lexus";
    lexus.tires =" general";
    lexus.wheel ="reliant";
    lexus.window ="tint";
    lexus.lights ="elwire";
    lexus.color = "yellow";
    lexus.year = 2020;
    lexus.price = 4567;


    toyota.carMake = "toyota";
    toyota.tires = "sport";
    toyota.wheel = "infinti";
    toyota.window = "dyi";
    toyota.lights = "singaro";
    toyota.color = "blue";
    toyota.year = 2019;
    toyota.price = 2345;


    mercedes.drive();
    mercedes.stop();
    mercedes.heat();
    mercedes.cool();
    mercedes.playMusic();
    mercedes.isExpensive();

    rangeRover.drive();
    rangeRover.stop();
    rangeRover.heat();
    rangeRover.cool();
    rangeRover.playMusic();
    rangeRover.isExpensive();

    lexus.drive();
    lexus.stop();
    lexus.heat();
    lexus.cool();
    lexus.playMusic();
    lexus.isExpensive();

    toyota.drive();
    toyota.stop();
    toyota.heat();
    toyota.cool();
    toyota.playMusic();
    toyota.isExpensive();










  }



}


