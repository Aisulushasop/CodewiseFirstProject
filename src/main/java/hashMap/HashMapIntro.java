package hashMap;

import clssesAndObjects.Animal;

import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {

        HashMap<String, String> antonyms = new HashMap<>();
        antonyms.put("cold", "hot");
        antonyms.put("Long", "short");
        antonyms.put("hard", "soft");
        antonyms.put(null, "no data");
        antonyms.put("table", null);
        antonyms.put("screen", null);
        System.out.println(antonyms);
        System.out.println(antonyms.get("hard"));
        System.out.println(antonyms.get("cold"));
        System.out.println(antonyms.get("cold"));
        System.out.println(antonyms.get("null"));
        System.out.println(antonyms.get(null)); // null,because no null string key

/*
Hashmap is unordered collection. Elements do not have indexes/positions inside the hashmap.

 */
/*
Create HashMap,product Price <String,Double>
add 5 elements
print all elements in one line
print 2 elements
print size
 */


        HashMap<String, Double> productPrice = new HashMap<>();
        productPrice.put("Lacoste", 320.79);
        productPrice.put("Nike", 150.99);
        productPrice.put("Adidas", 300.99);
        productPrice.put("Levis", 600.99);
        productPrice.put("Uniqlo", 257.99);
        System.out.println(productPrice);
        System.out.println(productPrice.get("Lacoste"));
        System.out.println(productPrice.get("Nike"));
        System.out.println(productPrice.size());


        /*
        you can copy another hashmap values by putting it in parentheses while hashmap declaration
         */


        HashMap<String, Byte> numbers = new HashMap<>();
        numbers.get("one");
        numbers.get("two");
        numbers.get("three");
        numbers.get("four");
        numbers.get("five");
        System.out.println(numbers.size());
        System.out.println(numbers);

        HashMap<Integer, Integer> decimals = new HashMap<>();
        decimals.put(1, 100);
        decimals.put(2, 200);
        decimals.put(3, 300);
        decimals.put(4, 400);
        decimals.put(5, 500);
        decimals.put(6, 600);
        decimals.put(7, 700);
        decimals.put(8, 800);
        decimals.put(9, 900);
        decimals.put(10, 1000);

        boolean contains = decimals.containsKey(2);//true
        System.out.println(contains);
        System.out.println(decimals.containsKey(500));//false
        System.out.println("10000-9000:" + decimals.containsValue(10000 - 9000));// true
        System.out.println(decimals.containsKey(null));//false
        System.out.println(decimals.containsKey(decimals.get(1) - 99));// true
        System.out.println(decimals.containsKey(9));//



        System.out.println("decimals:" + decimals);
        System.out.println("decimals size:" + decimals.size());
        System.out.println("printing 2" + decimals.get(2));


        decimals.remove("2");
        decimals.remove(15); // non existent key,nothing will happen
        System.out.println("desimals size:" + decimals.size());


        HashMap<String, Animal> myObj = new HashMap<>();
        Animal elephant = new Animal();
        Animal lion = new Animal();
        elephant.name = " Alex";
        elephant.color =" gray";
        lion.type = "cat";
        lion.name="Alex";

        myObj.put("first object", new Animal());
        myObj.put("second object", new Animal());

        System.out.println(myObj);

        System.out.println("removing all values");
        decimals.clear();

        HashMap<Double, Integer> nums = new HashMap<>();
        nums.put(9.99, 9);
        nums.put(1.99, 1);
        nums.put(2.99, 2);
        nums.put(3.99, 2);
        System.out.println("nums:" + nums);

        HashMap<Integer, Integer> orders = new HashMap<>();
        orders.put(4, 4);
        orders.put(10, 10);
        orders.put(1343, 44);
        orders.put(5744452, 444);
        orders.put(12, 4);
        orders.put(0, 4);


        System.out.println("orders1:" + orders);
        System.out.println("orders2:" + orders);
        System.out.println("orders3:" + orders);

        System.out.println("antonyms1:" + antonyms);
        System.out.println("antonyms2:" + antonyms);
        System.out.println("antonyms3:" + antonyms);


    }


}
