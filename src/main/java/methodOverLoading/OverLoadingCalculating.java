package methodOverLoading;

public class OverLoadingCalculating {

    public static void main(String[] args) {
    addition(5,8,0);

    }


    public static double addition(int y, int l, int g, double s, double i) {
        return (double) s + i;
    }

    public static double addition(int y, int k, double s, double l) {
        return (double) s + l;
    }

    public static double addition(int y, int l, double s) {
    return y+l;
    }








}
