package loops;

public class NestedLoop {

    public static void main(String[] args) {

        for (int u = 1; u < 7; u++) {
            for (int e = 1; e <= 7 - u; e++) {
                System.out.print(" ");
            }
            for (int v = 1; v <= u * 2 - 1; v++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("!!!Happy new year!!! ");


        for ( int i = 1; i<3;i++){
            System.out.println( " week" + i);

          for ( int j = 1; j<7; j++){
              System.out.println( " day " + j);
          }


        for( int p = 1; p<12; p++){
            System.out.println(" Month" + p);

       for ( int j =1; j<30; j++){
           System.out.println(" Day " + j);
       }


        }





        }










    }
}
































///// int k =1;
/// while k >=10{
// sout
//k++}




 ///int
/// do{
   // sout
//v--;
// }while( v>=56);




