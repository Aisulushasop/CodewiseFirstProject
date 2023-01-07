package loops;

public class WhileLoop {


    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            System.out.println(" Good morning everyone!" + x++);

        }

        int i = 1;
        while ( i <= 30) {
            if (i % 3 == 0) {
                System.out.println(i + " even + 3 = " + (i + 3));
            } else {
                System.out.println(i + " odd + 2 = " + (i + 2));
            }
            i++;


            for (int m = 100; m >= 0; m--) {
                if (m % 4 == 0) {
                    System.out.println( m + " quarter");
                }
                if (m % 2 == 0) {
                    System.out.println(m + " double");
                } else {
                    System.out.println(m);
                }


            }
        }















    }

}
