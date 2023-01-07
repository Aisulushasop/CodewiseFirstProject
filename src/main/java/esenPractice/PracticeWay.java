package esenPractice;

public class PracticeWay {

    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 25;
        add(number1 , number2);



        double afterTax = calculate(100);
        System.out.println(afterTax);


        double resul2 = discount(0.20);
        System.out.println(discount(resul2));


    }




    public static void add (int number1 , int number2) {
        int sum = number1 + number2;
        System.out.println(sum);


    }

    public static double calculate (double price) {
        double result;
        double saleTax = price * 0.06;
        result = price + saleTax;
        return result;

    }

    public static double discount (double totalPrice) {   //// Method signature return type is double and method parameters
        double result2;  /// declare result
        double discount = totalPrice * 0.20; /// create verible
        result2 = totalPrice - discount;/// subtract
        return result2; // pseudo code


    }





























}
