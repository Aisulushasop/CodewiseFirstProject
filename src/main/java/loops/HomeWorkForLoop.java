package loops;

public class HomeWorkForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 31; i++) {
            System.out.println(i + " December 2022 ");
        }

        for (int h = 2; h <= 200; h++) {
            if (h % 2 == 0) {
                System.out.println(" even: " + h);
            }

        }
        for (int i = 100; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i + " -odd");

            }

        }


         division(7);

    }


    public static void division(int number){
       for ( int i = 100; i>=1; i--){
   if (  i % 7==0){
       System.out.println( i );


   }


       }





    }




}
