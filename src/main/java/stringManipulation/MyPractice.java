package stringManipulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyPractice {

    public static void main(String[] args) {

        String str = "Bishkek";
        System.out.println( str.charAt(3));  /// char metod takes intejer and return letter behind that intejer
        String name = " Emir ";
        System.out.println( name.charAt(4));
        String name1 = " Almaz ";
        System.out.println( name1.charAt(1));
        String name3 = " Mika";
        System.out.println( name3.charAt(2));


                //========imdexOF


        System.out.println( str.indexOf( 'k'));   /// indexOf  will find the location of the letter if
                                                        // CharAt return us the number of the letter
        System.out.println( ( name3.indexOf('a')));

       String state = "u - Connecticut";
        System.out.println( state.indexOf('o'));//1
        System.out.println(state.indexOf("ti"));//6
        System.out.println(state.indexOf(state.length()/2));
        System.out.println();

        String str2 = "dkfjgklfffghbbb";
        System.out.println( str2 + ":" + str2.indexOf('f')); // if the letter are same IndexOf
        // will show the first letter from the sentences

       int index2 = str2.indexOf('b',5); /// it will be starts from the 5th letter
        System.out.println(index2);

             ////=====//////  IsEmpty() checks whether the  string is
            // empty or not and return if its empty?and false if not empty

            String baby = "Hello";
            String baby1 =" ";
        System.out.println( baby.isEmpty()); // false empty  because the value not empty
        System.out.println(baby1.isEmpty());// true

         String classes = "Java and soft skills classe";
        System.out.println(classes.substring(0,4));  // substring  () takes2 intejers,and returns us
                                                      // a substring from index 1, up to index 2
                                                      //begining index = inclusive (includs)
                                                      // end index =exclusive ( not including last letter)

        System.out.println( classes.substring(9,20));
        System.out.println(classes.substring(classes.indexOf("soft skills"),classes.length()));

        Scanner scanner = new Scanner(System.in);
        System.out.println(" please enter first number");
        int a = scanner.nextInt();

        System.out.println( " please second number");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println( a + " + " +  b + " = " + sum);















/////////========= Contains JavaClass///////======= check if one string contains another string
        String slogan = "Chicago is  a windy city";
        String city = "Chicago";
        boolean doesItContain=slogan.contains(city); ////
        System.out.println( doesItContain);


////////======CharAt====/// method it return int it belongs to string class it  only use by string it will return us
        // index of letter



      String text =" Hello everyone ! Hope you are doing well." +
              " I wish you all good luck and at least 120k salary";

           ////===== Length==== return u8s number of characters in the string
        /// retuns us intejer    all starts from 1    \\\\\\\\\\\


        System.out.println( " the nummer of letters:" + text.length());
        String country ="USA";
        System.out.println( " The country has:" + country.length() + " letters");


        country="Kyrgyzstan";
        System.out.println( " The country has:" + country.length() + " letters");

       String school = "Harvard";
       String anotherSchool ="Stanford";
        System.out.println( school.charAt(0));
        System.out.println( school.charAt(5));                                    //need to get letter
        System.out.println( anotherSchool + " the last letter is: " + anotherSchool.charAt(anotherSchool.length()-1));
        System.out.println( school + " has last letter is:"  + school.charAt(school.length()-1));


      String cheers = "jhfjfjgukgkgkhkhjthruyuyeueigjfueyiiiqhyuf";
        System.out.println( cheers + "  the last letter is;" + cheers.charAt(cheers.length()-1));




    }








}
