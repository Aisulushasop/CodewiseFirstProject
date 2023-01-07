package loops;

public class ForLoop {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        for (int i = 2; i <= 50; i++) {    //for( int k = 1; k<=50 i++
            System.out.println(i);

        }


        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);


        }


        for (int i = 1; i <= 20; i++) {

            System.out.println(i + " aplles");
        }
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "apples#");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + " * " + i + " = " + 2 * i);

        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(100 + " * " + i + " = " + 100 * i);

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(" Java is fun");
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(" My name is Aisuluu");

        }

        for (int i = 10; i > 0; i--) {
            System.out.println(" The value of x is:" + i);

        }


        for (int i = 100; i > 0; i--) {
            if (i % 2 == 0) {

                System.out.println(i + " - even");


            } else {
                System.out.println(i + " -odd");
            }
        }
        multiplication(5);
        addition(9);
        division(20);
        method1(10);
        method2(10);
    }


    public static void multiplication(int number) {


        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number + i);


        }

    }


    public static void addition(int number) {
        for (int i = 1; i <= 50; i++) {

            System.out.println(number + " + " + i + " = " + number + i);

        }


    }


    public static void division(int number) {
        for (double i = 1; i <= 5; i++) {
            System.out.println(number + " /" + i + " = " + number / i);


        }
        for (int i = 10; i >= 0; i = i - 2) {

            System.out.println(i);


        }

        for (int i = 0; i <= 15; i = i + 2)
            System.out.println(" The value  of number " + i);

    }

    public static void method1(int number1) {
        int sum = 0;

        for (int i = 1; i <= number1; i++) {

            System.out.println(" The number is: " + i);
            sum = sum + i;

        }
        System.out.println(" The total sum is : " + sum);
    }


    public static void method2( int number2){
        int sum =0;
        for ( int i =1; i<=number2; i++ ){
            System.out.println( " The number is: " + i);
          sum = sum * i;
        }
        System.out.println( "The total sum is:" +  sum);

    }

























}