package homeWork;

import java.util.Arrays;

public class ArraysHomework {
    public static void main(String[] args) {

        ///////////========FirstTask=====//////////
        // 1. given below array of ints, write a program to sum values of array and print this sum.
        //expected output: The sum of given ints is: 55

        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int i = 0; i < my_array.length; i++) {
            sum = sum + my_array[i];
        }
        System.out.println(sum);


        ////////============= SecondTask==========/////////
        //2. given below array of ints, write a program to calculate the average value of array elements
        //
        //int [] averValues = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
        //
        //Expected output: The average value of given ints is: 18
        int[] averValues = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
        int sum1 = 0;
        for (int i = 0; i < averValues.length; i++) {
            sum1 = sum1 + averValues[i];

        }
        System.out.println(sum1 / averValues.length);


        /////////========= ThirdTask========////

        // 3. create 5 arrays for each data type, with different sizes, names and values. try to use different declaration methods,
        // and using for-loop print all values of one of the arrays of each type.
        //
        //create 5 arrays of int with different sizes, names and values. Print all elements of one array.
        //create 5 arrays of short with different sizes, names  and values. Print all elements of one array.
        //create 5 arrays of double with different sizes, names  and values. Print all elements of one array.
        //create 5 arrays of boolean with different sizes, names  and values. Print all elements of one array.
        //create 5 arrays of String with different sizes, names  and values. Print all elements of one array.


        int[] numbers = new int[9];
        numbers[0] = 15;
        numbers[1] = 30;
        numbers[numbers.length - 1] = 50;
        int[] numbers1 = {6, 9, 10, 2, 8, 7};
        int[] numbers2 = {8, 11, 67, 78, 45, 77};
        int[] numbers3 = {8, 11, 67, 78, 45, 67, 43, 56};
        int[] numbers4 = {8, 56, 12, 34, 222, 68, 45, 58, 90};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("--------");
        short[] shortNumbers = {569, 677, 900, 5555, 3434};
        short[] shortNumbers1 = {5690, 7878, 4986, 786, 7986, 233};
        short[] shortNumbers2 = {6784, 124, 7866, 456, 8989, 7878, 555};
        short[] shortNumbers3 = {5643, 11111, 2222, 567, 1111, -76, 5554, 5677};
        short[] shortNumbers4 = {7895, 4566, 23142, 6777, 7534, -11, 4444, 5679, 87};
        for (int i = 0; i < shortNumbers4.length; i++) {
            System.out.println(shortNumbers4[i]);
        }
        System.out.println("--------");
        double[] doubles = {67.7, 89.9, 777.9, 788.4, 333.7};
        double[] doubles1 = {10.8, 666.5, 4544.8, 111.5, 67.4, 88.9};
        double[] doubles2 = {444.6, 1212.5, 6766.45, 7876.8, 676.46, 880.9, 777.9};
        double[] doubles3 = {67778.6, 3216.5, 12121.45, 895321.88, 187543.96, 98765.94, 28846.99};
        double[] doubles4 = {1244.69, 3423456.5, 886234.7, 86553.88, 6.96, 12.94, 78.9};

        int counter = 0;
        while (counter < doubles3.length) {

            System.out.println(doubles3[counter]);

            counter++;
        }
        System.out.println("--------");
        boolean[] booleans = {false, true, true, false, true};
        boolean[] booleans1 = {false, true, true, false, true, true};
        boolean[] booleans2 = {false, true, true, false, true, true, false, false};
        boolean[] booleans3 = {false, false, false, true, true, false, true, true, false, false};
        boolean[] booleans4 = {false, false, false, true, true, false, false, true, true, false, false};

        for (int i = 0; i < booleans4.length; i++) {
            System.out.println(booleans4[i]);
        }
        System.out.println("--------");
        String[] texts = {"h", "y", "k", "p", "u"};
        String[] texts1 = {"hu", "yo", "krr", "pii", "uuuuo"};
        String[] texts2 = {"trtr", "yoyo", "krree", "piip", "uuuuohu"};
        String[] texts3 = {"nhhh", "hdee", "jhh", "piipu", "rdrss"};
        String[] texts4 = {"bhgyu", "sewt", "ityd", "bvft", "oiii"};

        for (int counter1 = texts.length - 1; counter1 >= 0; counter1--) {
            System.out.println(texts[counter1]);
        }


    }
}