package wrapperClasses;

public class Casting {
    public static void main(String[] args) {


        byte a = 20;
        /*


         */
        int b = a;
        short c = a;
        long d = a;
        float e = a;
        double f = a;


        /*
        explicit casting is used to convert one data type to another
         manually by putting parenthesis in front of the given data type

         */

        int intNum = 30;
        byte byteNum = (byte) intNum;

        short shortNum = (byte) intNum;
        short shortNum2 = (short) intNum;
        /*
        explicit casting: put l, L in end of long


         */


        long longNum = 1234l;
        intNum = (int) longNum; // explicit
        byteNum = (byte) longNum;

        double doubleNum = longNum;
        doubleNum = intNum;
        doubleNum = 1433.537f; // implicit casting

        float floatNum = (float) doubleNum;

        shortNum = (short) 32769;
        System.out.println(shortNum);

        floatNum = (float)134134.4333;// explicit
        floatNum = 134345.4334f;//explicit
        floatNum = 23.2F;







    }
}
