package methodOverLoading;

public class OverLoading1 {

    public static void main(String[] args) {
        method1();
        method1("");
        method2(4);
        method1("x");


    }

    public static void method1() {
        System.out.println();
    }

    public static void method2(int a) {
        System.out.println(a);

    }

    public static void method1(String b) {
        System.out.println(b);
    }

    public static void method1(double c) {
        System.out.println(c);
    }

    public static void method1(int x, char c) {
        System.out.println("");

    }


}





