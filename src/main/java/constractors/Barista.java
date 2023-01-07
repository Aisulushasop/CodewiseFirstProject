package constractors;

public class Barista {

    /*
    name
    position
    salary
    gender
    isExperienced

   > talk to client
   >steam milk
   >take order
   >wash hands
   >get tips
     */
    String name;
    String position;
    double salary;
    char gender;
    boolean isExperienced;
    boolean areHandsClean;
    boolean isHappy;
    static double jarOfTips;
    public Barista(String name, String position, double salary ) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        System.out.println( "Hired a new  " + position + "The name is " +
                name + ". The name is " + " The salary will be " + salary + "$ per hour" );
    }
    public Barista ( String name, boolean isExperienced){
        this.name = name;
        this.isExperienced = isExperienced;
        System.out.println( " Hire a new barista" + name +  " Experienced ");


    }

    public void talkToClient(String clientsName) {
        System.out.println(name + " is talking to client " + clientsName);
    }

    public void steamMilk(String typeOfMilk) {

        System.out.println(name + " is steaming " + typeOfMilk + "milk ");
    }

    public void takeOrder(String orderName, String clientsName) {
        System.out.println(position + " " + " is taking order of " +
                orderName + " from client:" + clientsName);
    }

    public void washingHands(boolean cleanHands) {
        if (cleanHands) {

            System.out.println(name + " 's hands are clean.Not washing again.");
            areHandsClean = true;

        } else {
            System.out.println(name + " is washing the hands");
            areHandsClean = true;

        }

    }

    public boolean gettingTips(double tips) {
        if (tips > 0) {
            System.out.println(position + " " + name + " is getting tips in the amount of:" + tips + "$");
            isHappy = true;
            jarOfTips = jarOfTips + tips;
            return true;




        }else {
            System.out.println(" no tips for" + position + " " + name + "This time!");
            isHappy = false;
            return false;
        }
        }

public boolean isBaristaHappy(){
        return isHappy;
}








}





