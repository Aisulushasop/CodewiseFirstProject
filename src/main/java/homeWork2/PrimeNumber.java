package homeWork2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


        /*
        Write a program that checks whether a number entered by the user is a prime number or not. Using loop, if-else condition, Scanner class.

Prime number is a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).

Use Scanner class that will ask for int from user and checks if the number is prime or not.


         */
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Give me number: ");
        int number = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if ( counter == 2){
            System.out.println( number + "is prime");

        }else{
            System.out.println( number + "is not prime");
        }

    }
}
