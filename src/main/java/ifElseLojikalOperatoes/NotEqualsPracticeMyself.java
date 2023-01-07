package ifElseLojikalOperatoes;

import com.sun.security.jgss.GSSUtil;

public class NotEqualsPracticeMyself {
    public static void main(String[] args) {

        int num = 10;
        int num1 = 5;

        System.out.println(num != num1);//true
        System.out.println(num == num1);// false

        String name1 = "Johny";
        String name2 = "Johny";
        String name3 = new String("Johny");
        System.out.println(name1 == name2);//true
        System.out.println(name1 == name3); // false
        System.out.println(name1 != name3); // true
        System.out.println(name1 != name2);//false

        /*
        .equals() to compare String values, can only be used by String
         */

        System.out.println( name1.equals(name2));// true
        System.out.println(name1.equals(name3));// false
        System.out.println(!name1.equals(name2));//false

        System.out.println(num !=num1);

       Calkulator calculator1 = new Calkulator();
       Calkulator calculator2 = new Calkulator();
       Calkulator calkulator3 = calculator1;

        System.out.println(calculator1.equals(calculator2));//false
        System.out.println(calculator1.equals(calkulator3));// true
        System.out.println(calculator1 == calkulator3);// true
        System.out.println(calculator1 == calculator2); // false












    }
}
