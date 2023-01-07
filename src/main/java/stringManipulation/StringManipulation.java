package stringManipulation;


import java.util.Locale;

public class StringManipulation {

    public static void main(String[] args) {

        String name = "John";
        String name2 ="Johnson";
        boolean isEqual = name == name2; ///it will be false bce it's not same names there are different
        System.out.println( isEqual);


    String city = "Chicago";
    String city2 = " Miami";
      isEqual = city == city2; ///false there are different


    System.out.println(" Chicago  == Miami:" + city==city2 );


        String newCity = new String( "Chicago" );
     isEqual = city == newCity;
        System.out.println( "Chicago == Chicago:" + isEqual);

        String  cake1 = "honeycake";  /// value is false because we comparing the different values
        String cake2 = "cheesecake";
        String cake3 = "HoneyCake";
        String cake4 = "cheesecake";
        String cake5 = new String("cheesecake");

        boolean isSameCake =cake1 == cake2;
        System.out.println( "honeycake is same as cheesecake" + isSameCake);


        isSameCake = cake1 == cake3; /// we comparied/// false bce lower case and upper case
        System.out.println( isSameCake);


        isSameCake = cake4 == cake5;

        System.out.println( " cheesecake is same as cheesecake:"  + isSameCake); ///false



/////////// equals () method from string class
/////////// it only compares values
/////////// it can be used by String only
////////// it is a method return boolean: true or false


       isSameCake = cake4.equals(cake5);
        System.out.println( isSameCake);


        System.out.println( " USA".equals(new String( "USA")));///true because values same even we gave a new strin the values same
        System.out.println( "  hello Codewise".equals( "hello codewise"));/// false because we have spasese in the values

        String animal = "elephant";
        System.out.println(animal.equals("animal") );/// false bse elephant and animal are differents



        String animal2 = "lion";
        System.out.println(animal2.equals( "Lion"));/// false bse uppercase and lowercase used


    String animal3 = new String( "lion");
        System.out.println( animal2.equals("animal3")  );
        System.out.println( animal3.equals("Lion")); ////false bce up percase

/////what is a difference between .equals and ==
        String car = "toyota";
        String car1 = "lexus";
        String car2 = "Toyota";
        String car3 = new String( "lexus");

        System.out.println( car == car1);// false   //== compare the id
        System.out.println( car==car2);//false
        System.out.println( car1==car3);//false
        System.out.println( car1 == (car3));// true     /// equals the values




        ////////toLowerCase() to UpperCase()

/////// These are methods, that convert text to all lower case or all uppercase





         //////==========Homework of the day 10========///////////
       String hello1="Hello World";
       String hello2="Hello world";
       String hello3=("HelloWorld");
boolean isSame;
isSame= hello1.equals(hello2);
        System.out.println( "1. Hello world " + isSame);
isSame=hello1.equals(hello3);
        System.out.println( "2. Hello World is same as Hello World " + isSame);

isSame=hello1==hello2;
        System.out.println( "3. Hello World is same as Hello world " + isSame);

isSame=hello2.equals(hello2.toUpperCase() );
        System.out.println( hello2 + " " + hello1 + "  " + isSame );

        System.out.println( hello1.toLowerCase() + " " + hello2.toLowerCase());

isSame=hello1.equals(hello2);
        System.out.println( "Hello World is same as Hello World " + isSame);


    }










}

