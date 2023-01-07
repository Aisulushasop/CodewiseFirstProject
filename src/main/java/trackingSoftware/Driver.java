package trackingSoftware;

public class Driver {

    String name;
    int age;
    boolean isNew;

    public void printInfo() {

        System.out.println(" Name:" + name);
        System.out.println(" Age: " + age);
        System.out.println("Is driver new:" + isNew);
    }

        public void reportAccident( String Location) {

            System.out.println(name + " got it accident in " + Location);


        }
//////  this method should print out % name is driving
public void drive (){
    System.out.println( "\n" + name  + "is driving");
}

   /////// This method should send the location back to who is calling
 public String sendLocation(){
        return " LA";
 }








    }






