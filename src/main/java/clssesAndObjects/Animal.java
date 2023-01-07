package clssesAndObjects;

import java.util.SplittableRandom;

public class Animal {


     public String type;
    public String color;
    public String size;
    public String name;
    public byte age;


    boolean isMammal;

    public void eats() {
        System.out.println(color + " " + type + " " + type + " is eating");

    }

    public void sleeps() {

        System.out.println(color + " " + type + " " + type + " is eating");

    }

    public void plays() {
        System.out.println(color + " " + type + " " + type + " is eating");

    }

    public boolean isMammal() {
       return true;
    }

    public String getName(){
        String name ="Bambi";
        return name;
    }

}















