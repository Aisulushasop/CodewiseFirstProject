package ifElseLojikalOperatoes;

public class AndOperator {

    public static void main(String[] args) {


        int money = 25;
        int costOfTheCake1 = 20;

        String cake1 = " honeycake";
        boolean isGlutenFree1 = true;


        String cake2 = " cheesecake";
        int costOfTheCake2 = 25;
        boolean isGlutenFree2 = false;

       if ( isGlutenFree1 && costOfTheCake2<=money ){
           System.out.println( " I will buy the:" + cake1);

       }else if ( ! isGlutenFree2 && costOfTheCake2 < 15 ){

           System.out.println( " I will buy the non gluten free " + cake2 );

       }

    }






}
