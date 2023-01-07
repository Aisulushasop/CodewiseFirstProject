package stringManipulation;

public class LowerUpperCase {

    public static void main(String[] args) {

    String shop1 = "Amazon";
    String shop2 = "amazon";

    boolean isSame;
     isSame = shop1.equals(shop2);
        System.out.println( " Amazon is same as amazon:" + isSame);

        shop1=shop1.toLowerCase();/////Amazone----->amazone we made to lowercase
        isSame =  shop1.equals( shop2);////// true bse amazon=amazon lowercase it's a function
        System.out.println( " amazon is same as amazon:" + isSame);// it's true because amazon was with lowercase

      String car1 ="MERCEDES";
      String car2 = "Rolls Roys";
      String car3 = "MercedeS";
      String car4 = "rolls royse";
          isSame = car1.equals( car3.toUpperCase() );// MERCEDES.equals( MERCEDES) in
       // parantases   we put the car3 and action to uppercase,give them some action

        System.out.println( " car1:" + car1);
        System.out.println( " car2:" + car1);
        System.out.println( " car3:" + car3);
        System.out.println( "car4:" + car4);
        car3 = car3.toUpperCase(); ///catching the values it can stored
        System.out.println(car3);
        car1 = car1.toLowerCase();// made it whith lowercase like mercedes
        car3 = car3.toLowerCase();///made it whith lowercase like mercedes
        System.out.println( car3 + " " + car1);


        System.out.println( " Rolls RoycE".equals(car4));//false
        System.out.println( " RoLLs RoyCE".toLowerCase().equals(car4));
        // let's get to do
        // true the lower case we took string and converted to lowercase and we comparated with another string


        System.out.println( "ChiCaGo".equals( ( "chIcAgO")));
        System.out.println( "ChiCaGo".toUpperCase().equals("chIcAgo".toUpperCase()));
        //how to 2 Chicago make to  uppercase at first we took Chicago made uppercase and then
        //we comparing with second Chicago which made alredy uppercase
        //


///////                         ====== ///////equalsIgnorCase()==========

         System.out.println("ChiCago".equals("ChIcAgo"));
          System.out.println("ChiCago".equalsIgnoreCase("ChiCago"));
          //true because it doesn't meter which case because case already ignored


      String person1 = "Brad Pitt";
      String person2 = " Brad pitt";

boolean isPitt = person2.equals(person1);
        System.out.println( "isPitt" + isPitt ); /// false


isPitt= person2.equalsIgnoreCase(person1);
        System.out.println(" isPitt" + isPitt);
        isPitt = person2.equalsIgnoreCase(person1);
        System.out.println("isPitt:" + isPitt);

        /////////










    }

}
