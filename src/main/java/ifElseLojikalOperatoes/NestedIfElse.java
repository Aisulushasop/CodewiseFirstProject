package ifElseLojikalOperatoes;

import javax.imageio.stream.ImageInputStream;

public class NestedIfElse {

    public static void caughtSpeeding(int speed, boolean isByrthday) {

        if (!isByrthday) {
            if (speed > 60 && speed <= 80) {
                System.out.println(" You get small ticket");


            } else if (speed > 80) {
                System.out.println("You get big ticket");
            }
        } else {
            System.out.println("No ticket");
        }
    }

    public int greenTicket( int a, int b, int c) {

        if (a == b) {
            if (a == c) {

                return 20;
            } else {
                return 10;
            }
        } else {
            return 10;

        }








      }



     }



























