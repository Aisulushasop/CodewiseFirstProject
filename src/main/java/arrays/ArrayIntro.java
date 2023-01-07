package arrays;

public class ArrayIntro {
    static String giveMeText() {
        return " Hi";
    }


    public static void main(String[] args) {
        String[] animals = {"elephant", "giraffe", "wolf", "lion"};
        String animal1 = animals[0];
        String animal2 = animals[1];
        String animal3 = animals[2];
        String animal4 = animals[3];
        System.out.println(animal1);
        System.out.println(animals[2]);
        System.out.println(animals[10 - 8 + 1]);//Lion
        System.out.println(animals[animals.length - 2]);// wolf

        int[] fibonacciNumbers = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        int num1 = fibonacciNumbers[2];//2
        num1 = fibonacciNumbers[5];//8
        int num2 = fibonacciNumbers[0];//1
        int num3 = fibonacciNumbers[fibonacciNumbers.length - 5];//8
        System.out.println(num3);

//////////==================


        String[] cities = new String[5];
        System.out.println(cities[0]); // no data here
        cities[0] = "Los Angeles";
        cities[1] = "Paris";
        cities[2] = "Rome";
        cities[3] = "Dubai";
        cities[4] = "Tokio";

        System.out.println(cities[0]);
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
        cities[3] = "Kuala-Lumpur"; // we ara reassignment the value

        String[] countries;// we are declared array of string
        countries = new String[]{"USA", "Argentina", "Italy", "Japan", " ", null, "Ukraine"}; // 7 elements
        countries[6] = " Singapore";
        countries[5] = " Kazakhstan";


        double[] prices = {1.99, 2.99, 3.99, 20.99, 99.99};
        long[] longArray = {1343, 36677, 235, 545, 646, 6366, 99};
        Boolean[] booleanArr = {true, true, false, true, false};
        char charArr[] = {'w', 'h', 'y', 'c', 'o',};

        ///////////===============


        String[] berries = new String[5];
        String[] fruits = new String[]{"", "", "", "", ""};


    }


}
