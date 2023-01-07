package mulidemontionalArrays;

import trackingSoftware.TrackSoft;

public class PracticePrinting {
    public static void main(String[] args) {
        String[][] strArr = new String[][]{{"plov", "blinchiki", "washlyk"}, {"tea", "cola", "water"}};
        System.out.println(strArr.length);

        for (int i = 0; i < strArr.length; i++) {  // outer loop
            for (int k = 0; k < strArr[i].length; k++) {

                System.out.println(strArr[i][k]);

            }
        }

        String[] foods = {"sushi", " ramen", "tom-yam"};
        String[] drinks = {" green tea", "black tea", "soda", "moutain dew", "water"};

        String[][] menu = new String[][]{foods, drinks};
        for (int i = 0; i < menu.length; i++) {
            for (int k = 0; k < menu[i].length; k++) {
                System.out.println(menu[i][k]);
            }
        }


        String[] birds = {"mockingbird", "sparrow", "parrot", "eagle"};
        String[] insects = {" grasshopper", "spider", "ladybug"};
        String[] mammals = {"cow", "bear", "whale", "elephant", "dog", "human"};

        String [][] animals = new String[][] { birds,insects,mammals };
        System.out.println("animals2 length :" + animals.length);

        for( int i = 0; i<animals.length; i++) {

            for (int k = 0; k < animals[i].length; k++) {

                System.out.print(animals[i][k] + "");
            }

            System.out.println();
        }



         String [] books = {"Scarlet","Garry Potter","Feniks","Women","Djon" };
         String [] cars = {"Toyota", "Mersedes", "Cadilac","Honda"};
         String [] planets = {"Jupiter", "Moon","Mars","Venera","Uranus"};
         String[] countries ={ "Switerthland","Namibia","Germany","Japan","Angola"};
        // create 4 diman array of string,using for each loop,print everything

       long [] population = { 25000000, 5000000, 9000000,5000000,300000};
       long [] numbers = { 11111, 22222,4444,666666,555};
       // create 2 dimen array of longs using for each poop print everything
          int [] num1 = { 1,2,4,6,};
          int [] num2 = { 10,20,40,60,};
          int [] num3 = { 100,200,400,600,};
          int [] num4= { 1000,2000,4000,6000,};
          int [] num5 = { 100000,20000,40000,60000};

       // create 5 dimen array of int using











    }
}
