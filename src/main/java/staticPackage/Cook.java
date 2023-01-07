package staticPackage;

public class Cook {
    public Cook ( String name){
        this.name = name;
    }


    String name;
    static String order;

   public void washHand( ){
       System.out.println(name + " is washing hands");


   }
   public void preparesalad() {
       System.out.println(name + "is preparing a salad");
   }

   public static void takeOrder( String orderName){
       System.out.println(orderName + " order received");
       order = orderName;

   }



}
