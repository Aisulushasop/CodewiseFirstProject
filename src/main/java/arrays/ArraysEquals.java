package arrays;

import java.util.Arrays;

public class ArraysEquals {

    public static void main(String[] args) {
        int [] intArr1={ 1,2,3,4,5,};
        int [] intArr2={ 1,2,3,4,5,};
        boolean b = Arrays.equals(intArr1,intArr2);
        System.out.println(b);
        System.out.println( Arrays.equals(intArr1,intArr2));


       String [] strArr1 = { " hello"};
       String [] strArr2 = { " bye"};
        System.out.println( Arrays.equals(strArr1,strArr2));









    }
}
