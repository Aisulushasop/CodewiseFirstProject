package esenPractice;

public class Practise {

    public static void main(String[] args) {


        String clothes = "jacket";
        boolean starts = clothes.startsWith("ja");
        System.out.println(starts);
        System.out.println(clothes.charAt(4));
        System.out.println(clothes.substring(4, 6));


        int q = clothes.indexOf("jack");
        System.out.println( q );

    }
}