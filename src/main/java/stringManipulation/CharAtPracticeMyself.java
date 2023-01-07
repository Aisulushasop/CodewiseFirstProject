package stringManipulation;

import javax.swing.*;

public class CharAtPracticeMyself {
    public static void main(String[] args) {

        String name = "Angelina";
        char a = name.charAt(3);
        System.out.println(a);


        String text = " Hello everyone! Hope you are doing well." +
                "I wish you all good luck and at least 120k salary.";

        System.out.println("the numbers of letter:" + text.length() + " letters");

        String country = "USA";
        System.out.println(country + " has " + country.length() + " letters");

        country = "Mexico";
        System.out.println(country + " has " + country.length() + " letters");

        country = " Mexico ";
        System.out.println(country + " has " + country.length() + " letters");

        country = "Kyrgyzstan";
        System.out.println(country + " has " + country.length() + " letters");

        System.out.println(country.charAt(9));


        String school = "Harvard";
        String anotherSchool = "Stanford"; // 8 letters

        System.out.println(school.charAt(0));
        System.out.println(anotherSchool + "'s Last letter is: " + anotherSchool.charAt(anotherSchool.length() - 1));

        String cheers = ("Congratistgadgnelkdfngselfkb sldnvs;nvksdnvsbbhb " +
                "bnslbvslkdnvlsnv " +
                "sdgnlkbnglerngrwlgm  afv adf sdeg");

        System.out.println(cheers + "'s last letter is " + cheers.charAt(cheers.length() - 1));
        System.out.println(cheers.length());


        String original = "Hello everyone, Let's do Java String exercises";
        int index = 10;
        System.out.println("The character at position " + index + " is " + original.charAt(index));

    }


/*

Given a string, return a version without the first and last char, so "Hello" yields "ell".
The string length will be at least 2.
 */











}