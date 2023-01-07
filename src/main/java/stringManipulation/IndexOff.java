package stringManipulation;

public class IndexOff {
        public static void main(String[] args) {

                String str = "abcaccdeelaab";

                System.out.println(str.charAt(3));


                System.out.println(str.indexOf('c'));
                int letter = str.indexOf('g');

                String str2 = " abcaccdeelaab";
                System.out.println(str2 + ":" + str2.indexOf('b'));
                int index2 = str2.indexOf('b', 5);
                System.out.println(index2);
                str2.indexOf('c'   );
                int i = str2.indexOf("dee");

                String state = " Connectikut";

                 System.out.println(state.indexOf('0')); //the position letter 0 iz 1
                 System.out.println(state.indexOf("ti") );//6 index of the first letter
                System.out.println( state.indexOf("nnectikut"));//2
                System.out.println( state.indexOf('u',state.length()/2));
                System.out.println();











    }

}
