package methodOverLoading;

import java.util.Arrays;


    public class PracticeOverLoadedArrays {
        public static void main(String[] args) {

            int[] array1 = {1, 2, 3};
            int[] array2 = {4, 5, 6};
            System.out.println(Arrays.toString(rotate(array1, "left"))); // 2,3,1
            System.out.println(Arrays.toString(rotate(array2, "left"))); // 5,6,4
            System.out.println(Arrays.toString(rotate(array1, "right"))); // 3,2,1

        }


        public static int[] rotate(int[] array, String rotate) {
            if (rotate.equals("left")) {
                int[] newRotated = {array[1], array[2], array[0]};
                return newRotated;
            } else if (rotate.equals("right")) {
                int[] newRotated = {array[2], array[1], array[0]};
                return newRotated;
            }
            return array;
        }

        public static String reverse(String str, boolean b) {
            if (b) {
                String result = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    result = result + str.charAt(i);
//""+u+u+l+u+s+i+A
                    //uulusiA
                }
                    System.out.println(result);
                    return result;
                }
                return str;
            }
            //0123456
            //Aisuluu => 7
        //
        //uulusiA

        }



