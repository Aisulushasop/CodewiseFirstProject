package stringManipulation;

public class IndexOfPracticeMySelf {
    public static void main(String[] args) {

   String str = "abcdefg";
        System.out.println( str.charAt(3));

        System.out.println(str.indexOf('c'));
        System.out.println(str.charAt(2));
        int index = str.indexOf('g');


        String str2 = "abcaccdeelaab";
        System.out.println(str2 + ":" + str2.indexOf(' '));
        int index2 = str2.indexOf(' ',5);
        System.out.println(index2);











    }
}
