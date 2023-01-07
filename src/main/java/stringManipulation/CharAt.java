package stringManipulation;

import java.sql.SQLOutput;

public class CharAt {
    public static void main(String[] args) {


    String name = "Angelina";
     /*
         A = 0
         n = 1
         g = 2
         e = 3
      */


char a = name.charAt(3); /// return e
        System.out.println( a);

String text = " Hello everyone! Hope you are doing well. I wish you all good luck and at least 120k salary";


////==========Length() returns number of characters in the string
        /////returns int and can be only used by string
  //// length will starts only from 1
        System.out.println( "the number of letters:" + text.length());

String country = "USA";
        System.out.println( country + " has " + country.length() + " letters");
        country = "Mexico";
        System.out.println( country + " has " + country.length() + " Letters");

country =  " Mexico ";
        System.out.println( country + " has " + country.length());

country = "Kyrgyzs t a n";
        System.out.println( country + " has " + country.length());

      String school = "Harvard";
      String anotherSchool = "Stanford";
        System.out.println( school.charAt(0));
        System.out.println( anotherSchool + "'s last letter is: " + anotherSchool.charAt(anotherSchool.length()-1 ));

//// we want to know what is the last letter  is, how we














    }





}
