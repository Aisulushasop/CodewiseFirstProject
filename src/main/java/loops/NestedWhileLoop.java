package loops;

public class NestedWhileLoop {

    public static void main(String[] args) {


        int x = 2021;
        while (x <= 2023) {
            System.out.println("Year:  " + x);
            x++;


            int p = 1;
            while (p <= 12) {
                System.out.println("           Month: " + p);
                p++;
            }

        }
            int b = 2000;
            while (b <= 5000) {
                System.out.println(b);

                int c = b + 1;
                while (c <= b + 49) {
                    System.out.println("   " + c);
                    c++;
                }
                b += 1000;

            }
            System.out.println(" Wohoo,   I am done");

            int num1 = 1;
            do {
                int num2 = 1;
                if (num1 % 2 == 0) {
                    do {
                        System.out.print(num1);
                        num2++;
                    } while (num2 <= num1);
                    System.out.println();
                } else {
                    System.out.println(num1 + " is odd");
                }
                num1++;
            } while (num1 <= 10);



            int j = 1;
            while ( j <=6){
                int k = 1;
                while ( k <= j){
                    System.out.print(j);
                    k++;
                }

                System.out.println();
             j++;


            }











    }
}