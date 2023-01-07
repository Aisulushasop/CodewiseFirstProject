package practiceWithBena;

import java.util.Scanner;

public class DoWhileLoopCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Second number" );
        int b = sc.nextInt();
        System.out.println( "Enter arithmetic operator");
        String operator = sc.next();
         if( operator.equals("+")) {
             System.out.println(a+b);
         }
         else if ( operator.equals("-")){
            System.out.println(a-b);
         }
         else if ( operator.equals("*")){
             System.out.println(a*b);
         }
         else if ( operator.equals("/")){
             System.out.println(a/b);
         }
         else if ( operator.equals("%")){
             System.out.println(a%b);
         }
         else {
             System.out.println( " Incorrect arithmatic operator");
         }
    }
}
