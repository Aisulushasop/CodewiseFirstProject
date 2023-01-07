package stringManipulation;

public class Replace {

    public static void main(String[] args) {


// replace method takes 2 chars and replases first one and second one and returns new string




String city = " Alabama";
        System.out.println(city.replace('a','e' )); //Alebeme


        System.out.println( city.toLowerCase().replace('a','e'));



String numberAndChars ="Hello 2023!8**** Happy N3w Y3ar****";
    System.out.println( numberAndChars.replace( '*',  '!'));

////======= we can also replace strings

     String cake ="honeycake";
        System.out.println( cake.replace( " honey", "chocolate"));
        System.out.println(cake);
        System.out.println( cake = cake.replace( "chokolate", " honey") );









    }

}
