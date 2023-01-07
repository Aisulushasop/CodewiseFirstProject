package ifElseLojikalOperatoes;

import java.util.Scanner;

public class Calkulator {


    public static void main(String[] args) {

        Scanner user  = new Scanner(System.in);
    ////Scanner user= new Scanner( System.in);
        System.out.println( " Please enter first number:");
        double firstnamber = user.nextDouble();

        System.out.println( "Please enter arithmetic operator");
        String operator = user.next();

        System.out.println( " Please enter second number");
        double secondnumber = user.nextDouble();


        double result;

      if (operator.equals("+" )) {
         result = firstnamber + secondnumber;
      } else if (operator.equals("-")) {
         result = firstnamber - secondnumber;

      }else if (operator.equals("/")) {
          result = firstnamber / secondnumber;

      }else if (operator.equals("*")){
          result = firstnamber * secondnumber;


        }
      }



}




