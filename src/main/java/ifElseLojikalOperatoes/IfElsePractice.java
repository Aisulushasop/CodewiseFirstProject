package ifElseLojikalOperatoes;

public class IfElsePractice {

    public static void caughtSpeeding(int speed, boolean isBirthday) {

        int result = 0;

        if (speed <= 60) {
            result = 0;
            System.out.println("no ticket");
        } else if (speed > 60 && speed <= 80 && !isBirthday) {
            result = 1;
            System.out.println("you got small ticket");
        } else if (speed > 60 && speed <= 80 && isBirthday) {
            System.out.println("since it's birthday, no ticket");
        } else if (speed > 80 && !isBirthday) {
            result = 2;
            System.out.println("you got big ticket");
        } else if (speed > 80 && isBirthday) {
            result = 2;
            System.out.println("you are lucky, no big ticket since it is your birthday");
        }

    }

    public  static void main (String [] args) {
        caughtSpeeding(59, true);
        caughtSpeeding(70, false);
        caughtSpeeding(90, true);
        caughtSpeeding(81, false);


    }


public static boolean cigarParty( int cigars,boolean isWeekend){
    if (isWeekend) {
        if (cigars >= 40) {
            System.out.println(" The party was successful on weekend");
            return true;
        } else {
            System.out.println(" The party failed on weekend");
            return false;
        }
        }else {
         if ( cigars >= 40 && cigars <=60) {
             System.out.println( "Party was successful on weekday ");
          return true;
         }else {
             System.out.println(" party failed on weekday");
             return false;



         }


    }










}











}

