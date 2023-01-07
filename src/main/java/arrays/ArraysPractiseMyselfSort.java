package arrays;

import java.util.Arrays;

public class ArraysPractiseMyselfSort {
    public static void main(String[] args) {
                                //0         1         2       3
        String[] strArray = {"banana", " orange", " apple", "kiwi"};
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));// po alvavitu sortirovan
        // example apple,banana,kiwi,orange

        double[] doubleArr = new double[]{3, 7.5, 7.1, 9, 0, 3.12};
        System.out.println("original:" + Arrays.toString(doubleArr));
        Arrays.sort(doubleArr);
        System.out.println( "sorted" + Arrays.toString(doubleArr));

        char [] charArr = { '?', '*', 'd','0',')'};
        System.out.println( "original:" + Arrays.toString(charArr));
        Arrays.sort(charArr);
        System.out.println( "sorted:" + Arrays.toString(charArr));

    }
}
