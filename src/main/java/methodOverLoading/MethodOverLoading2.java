package methodOverLoading;

public class MethodOverLoading2 {
    public static void main(String[] args) {

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(double a, double b) {
        return (int) (a + b);
    }

    public static int sum(float a, float b) {
        return (int) (a + b);

    }

    public static int sum(int h, int b, int l) {
        return h + b + l;


    }


   public static String stringMethod( String[] arr, int a, int b,boolean c){
        return "";
   }

    public static String stringMethod( int k, double n, String name, String lastName, int [] arr){
        return name;
    }

    public static String stringMethod( String bread,String meat,String juice,String coke,String v,String d,String l, String f){
     return bread;
}






}

