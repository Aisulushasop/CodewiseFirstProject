package scannerClass;

import java.util.Scanner;

public class ScannerString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        String firstName = sc.nextLine();
        System.out.println("Please enter your age:");
        String LastName = sc.next();
        System.out.println("Please enter your number");
        byte age = sc.nextByte();
        System.out.println("Hello " + firstName + " " + age + "!");








         String realPassword = "Bishkek";
         Scanner scanner = new Scanner(System.in);
        boolean check = true;
         while (check){
             System.out.println( " please enter your password");
             String enteredPassword = scanner.nextLine();
         if( enteredPassword.equals(realPassword)){
             System.out.println( " Successfully logged in ");
         check = false;
         }else {
             System.out.println( " Wrong password! Try again" );
         }


         }



















    }
    }