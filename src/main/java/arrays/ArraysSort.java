package arrays;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {


        String [ ] strArray ={ "banana","orange", "apple", "kiwi"};
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        double [] doubleArr = new double[]{ 3,7.5,7.1,9,0,3.12};
        System.out.println(" original:" + Arrays.toString(doubleArr));
        Arrays.sort(doubleArr);
        System.out.println( " sorted: " + Arrays.toString(doubleArr));


        String [] countries = new String[]  { "USA"," Germany", " France "};
        System.out.println( Arrays.toString(strArray));

        char [] charArr = { '/', 'd'};
        System.out.println(Arrays.toString(charArr));
















    }
}
