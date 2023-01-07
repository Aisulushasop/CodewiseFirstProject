package loops;

public class Break {
    public static void main(String[] args) {
        int n = 20;
        while (n < 30) {
            System.out.println(n);
            if (n == 25) {
                System.out.println("Reached 25, breaking while loop ");
                break;
            }
            n++;
        }


        int j = 5000;

        do {
            System.out.println(j);
            if (j == 5020){
                break;
            }
        j++;
        }while ( j <10000);






    }
}