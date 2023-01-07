package constractors;

public class Iphone {

    public Iphone() {
        System.out.println("Inside constructor");
        this.color = "space gray";
        this.memory = 128;
        this.price = 999.99;
        this.IsUnlocked = false;

    }


    public Iphone(int memory) {
        System.out.println("this iphone has: " + memory + "Gb memory");
        this.memory = memory;
    }

    public Iphone(String color) {
        System.out.println("This iphone is " + color);
    }

    String color;
    int memory;
    double price;
    boolean IsUnlocked;


    public static void main(String[] args) {
        Iphone iphone14ProMax = new Iphone();
        Iphone iphone13ProMax = iphone14ProMax;
        Iphone iphone14Pro = new Iphone();

        Iphone iphoneSE = new Iphone(256);
        iphoneSE.color = "gold";
        iphoneSE.price = 549.99;
        iphoneSE.IsUnlocked = true;

        System.out.println( iphone14ProMax.memory);
        System.out.println(iphoneSE.memory);

        System.out.println(iphoneSE.price);
        System.out.println(iphone14ProMax.IsUnlocked);
        System.out.println(iphone14ProMax.color);

        iphone14ProMax = new Iphone();
        System.out.println(iphone14ProMax.color);
        System.out.println(iphone14ProMax.memory);
        System.out.println(iphone14ProMax.memory);

       Iphone mobile = new Iphone();
        System.out.println(mobile.price);
        mobile.IsUnlocked = true ;// we reassigned it
        System.out.println( mobile.IsUnlocked); // its true  because we are reassigning it
        System.out.println( new Iphone(88383));
           mobile.playMusic();
           iphoneSE.playMusic();
           iphone14ProMax.playMusic();


    }


  public void playMusic(){
      System.out.println( "Iphone is playing music");
  }





}
