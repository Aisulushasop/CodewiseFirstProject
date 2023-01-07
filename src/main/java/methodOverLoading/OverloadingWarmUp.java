package methodOverLoading;                                  //Psuedo code

import java.util.Random;

                                                              // 1.Method declaration
                                                              // 2. Remove "-" and ""
public class OverloadingWarmUp {                             // 3. Check the length
    public static void main(String[] args) {
      login("1-773-347-2342");
    }                                                        // 4. If length is 0 or 11 then generate random number up to 1000
                                                            // 5.Print the message
                                                            // 6.If invalid phone number given print "Invalid phone number"
    public static void login(String phoneNumber) {

        // 1 773 773 7373
        // 1-773-347-2342
        // 773-234-2341
        // stored back // re-assignment
        phoneNumber = phoneNumber.replace("-", "");
        phoneNumber = phoneNumber.replace(" ", "");
        System.out.println(phoneNumber);

        if (phoneNumber.length() == 10 || phoneNumber.length() == 11) {
            // valid phone number
            // Generate here random pass up to 100
            // Then print " % passcode is sent to % phonenumber
            Random random = new Random();
            int passCode = random.nextInt(1000);
            System.out.println(" Passcode: " + passCode + " is sent to phone number: " + phoneNumber);
        } else {


            System.out.println(" Invalid phone number");
        }
    }

public static void login( String username, String password){

        if( username.isEmpty() || password.isEmpty()){
            System.out.println( " Invalid credentialis.Try again");


        }
        else {
            System.out.println( " Login successful!");
        }

























    }
}
