package ifElseLojikalOperatoes;

public class IfElseCondition {

    public static void main(String[] args) {


        int a = 100;
        int b = 200;


        if (a > b) {
            System.out.println( a + "is  more than" + b);
        } else {

            System.out.println(a + " is not more than + b");
        }


        if (a == b) {

            System.out.println( "a is equal to b");
        } else {
            System.out.println(" a is  not equal than  b");
        }
        //============ if,else if///

        short sh1 = 32;
        short sh2 = -32;

        if (sh1 > sh2) {
            System.out.println(" sh1 is more than sh2"); // is it true because if condition is true than
            //    ///else if will be skip because we found  answer (is true)
        } else if (sh1 == sh2) {
            System.out.println("sh1 is equal to sh2");
        } else {
            System.out.println("sh1 is less than sh2");
        }

        String welcomeSign = "Welcome to California";
        String stateName = "California";

        boolean bb = welcomeSign.contains(stateName);///true

        if (bb) {
            System.out.println(welcomeSign + " contains " + stateName);

        } else if (!welcomeSign.contains(stateName)) /// ! it means (not) because ! does not work
            System.out.println("welcome sign does not contain statename");


       }






































    }






