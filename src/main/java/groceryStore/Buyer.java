package groceryStore;

public class Buyer {

String fullName;
int age;
boolean isResident;
String address;


public void display (){
    System.out.println("Buyer's display");
    System.out.println( " Full name:" +  fullName);
    System.out.println("Age" + age);
    System.out.println( " Resident " + isResident );
    System.out.println( " Address " + address );
}
}
/////////// create a method that updates the residancy of the user////
