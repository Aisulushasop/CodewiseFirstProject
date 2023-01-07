package ArrayList;

import java.util.AbstractList;
import java.util.ArrayList;

public class HomeWorkArrayList {
    /*
1. Create ArrayList<String> of 10 fruits, print all fruits using for each loop
in the manner: 1 fruit - apple, 2 fruit - banana, 3 fruit - pear, etc

2. Create ArrayList<String> of 10 vegetables, print all vegetables using do while loop, in same manner as fruits

3. Create ArrayList<String> of 10 cities, print all cities using while loop, in same manner as fruits

4. Create ArrayList<String> of 10 foods, print all foods using for loop loop, in same manner as fruits

     */
    //////////////////============FirstTask==========/////////////
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mandarin");
        fruits.add("Pear");
        fruits.add("Watermelon");
        fruits.add("Melon");
        fruits.add("Grape");
        fruits.add("Peach");
        fruits.add("Pineapple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();
        //////////////=============SecondTask=========///////////////////
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Cabbage");
        vegetables.add("Carrot");
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Pepper");
        vegetables.add("Broccoli");
        vegetables.add("Beet");
        vegetables.add("Garlic");
        vegetables.add("Tomato");
        vegetables.add("Cucumber");

        int count = 0;
        do {
            System.out.println(vegetables.get(count));
            count++;
        } while (vegetables.size() > count);
        System.out.println();
        ///////////////===========ThirdTask==========///////////////

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Bishkek");
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("London");
        cities.add("Toronto");
        cities.add("Tokio");
        cities.add("Moscow");
        cities.add("Warsaw");
        cities.add("Belgium");

        int i = 0;
        while (cities.size() > i) {
            System.out.println(cities.get(i));
            i++;
        }
        System.out.println();
        //////////////==========ForthTask===========//////////////

        ArrayList<String> foods = new ArrayList<>();
        foods.add("Pizza");
        foods.add("Pasta");
        foods.add("lalgman");
        foods.add("Plov");
        foods.add("Besh Barmak");
        foods.add("Manty");
        foods.add("Shashlyk");
        foods.add("Kuurdaak");
        foods.add("Dolma");
        foods.add("Mampar");


        for (int g = 0; g < foods.size(); g++) {

            System.out.println(foods.get(g));


        }


    }


}
