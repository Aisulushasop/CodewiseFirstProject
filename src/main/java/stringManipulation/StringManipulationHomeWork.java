package stringManipulation;

import java.util.Locale;

public class StringManipulationHomeWork {

    public static void main(String[] args) {

        String message = "Hello everyone,Let's go Java String exercises";
        int index=10;
        System.out.println( message.charAt( index  ) ); //1

        System.out.println( "the numbers of letters:" + message.length());//2

        System.out.println( message.toUpperCase(Locale.ROOT) );//3

        System.out.println( message.toLowerCase());//4

        System.out.println( message.charAt(5));//5

        System.out.println( message + " last letter is: " + message.length());//6

        System.out.println(message +  " first letter is: " + message.toLowerCase());//7

        System.out.println( message + " last letter is:" + message.toUpperCase()); //8










    }



}
