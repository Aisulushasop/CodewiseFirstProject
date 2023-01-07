package homeWork;

public class ReverseHomeWork {
    public static void main(String[] args) {
       /*
       Create below method, that will take String str, and returns reversed string.
public static String reverseString(String str){
}
//codewise  ==> esiwedoc
//mama  ==> amam
//hello ==> olleh
        */
        System.out.println(reverse("Codewise"));
        System.out.println(reverse("Hello"));
        System.out.println(reverse("Mama"));
    }
    static String reverse( String str ){
       String reverse = "";
       for ( int i = str.length()-1; i>=0; i--){
           reverse+=str.charAt(i);
       }
        return reverse;

    }









}
