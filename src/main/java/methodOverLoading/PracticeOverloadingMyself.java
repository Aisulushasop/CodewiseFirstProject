package methodOverLoading;

import java.util.Arrays;

public class PracticeOverloadingMyself {

public static int [] rotate ( int [] array,String rotate ){
    if( rotate.equals("left")){
     int [] newRotated = { array[1],array[2],array[0]};
     return newRotated;


    }else if ( rotate.equals("right")){
        int[] newRotated = { array [2],array[1],array[0]};
        return newRotated;

    }
    return array;

}

    public static void main(String[] args) {
    int [] array1 = { 1,2,3};
    int [] array2 = {4,5,6};
        System.out.println(Arrays.toString(rotate(array1,"left")));
    }



}
