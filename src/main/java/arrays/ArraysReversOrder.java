package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysReversOrder {

    public static void main(String[] args) {
        int a = 6;// primitive
        Integer b = 6; // non primitive,objekts

        Integer[] intArray = {5, 6, 3, 0, 1, 2};
        //0,1,2,3,5,6 ==> ascending order
        //6,5,3,2,1,0 ==> descending order
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(intArray));


        Character[] charArray = {'5', '7', '4', '3'};
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));
        Arrays.sort(charArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(charArray));
         int[]arr1 = { 3,7,9,3,6,8,0};
          sortInt(arr1);

          sortInt(new int[]{ 3,7,9,3,6,8,0});





    }

     public static int [] sortInt( int [] arr){
        Arrays.sort(arr);
        return (arr);




     }


  public static Integer [] reversOrder( Integer [] arr){
    Arrays.sort(arr,Collections.reverseOrder());
      System.out.println(Arrays.toString(arr));
       return arr;


    }

   public static String [] sortString ( String[] arr) {
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       return arr;


   }
    public static String[]reverseStringArr( String [] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;


    }

    public static boolean containsX ( int [] array,int x) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return true;
            } else {

            }
        }
        return false;


    }
    }
