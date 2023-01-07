package clssesAndObjects;

public class Zoo {

    public static void main(String[] args) {
        Animal elephant = new Animal();   /////// elephant is a reference
        Animal lion = new Animal();
        Animal mouse = new Animal();
        Animal chicken =  new Animal();

    elephant.type = "elephant";
    elephant.color = "gray";
    elephant.size = "large";
    elephant.name = "Dumbo";
    lion.type = "cat";
    lion.color ="yellow";
    lion.size = "medium";
    lion.name = "Alex";
     elephant.eats();
     elephant.sleeps();
     elephant.plays();
     System.out.println();

    mouse.type = "mouse";
    mouse.color = "blacke";
    mouse.size = "small";
    mouse.name = "Nick";

    mouse.sleeps();
    chicken.type = "chicken";
    chicken.type ="chicken";
    chicken.size ="medium";
    chicken.name = "peter";

    chicken.plays();









    }








}






















