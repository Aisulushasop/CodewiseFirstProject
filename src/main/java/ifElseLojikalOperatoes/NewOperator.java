package ifElseLojikalOperatoes;

import org.w3c.dom.ls.LSOutput;

public class NewOperator {


    public static void main(String[] args) {


        int money = 25;
        String cake1 = "honeycace";
        int costOfTheCake1 = 20;

        boolean isGlutenFree1 = true;

        String cake2 = "cheesecake";
        int costOfTheCake2 = 25;
        boolean isGlutenFree2 = false;
        ////i want to buy gluten free cake if its less than 25 dollars and
        // i can buy none gluten free cake on if its 15 dollars

        if (isGlutenFree2 && costOfTheCake1 < money) {
            System.out.println(" I wil only buy  the:" + cake1);
        } else if (!isGlutenFree2 && costOfTheCake2 < 15) ;
        System.out.println("I will buy the non gluten free" + " " + cake2);
    }

    //////&& and it will only check for all conditions
    ////true&&true&&true


    ////=========
































}