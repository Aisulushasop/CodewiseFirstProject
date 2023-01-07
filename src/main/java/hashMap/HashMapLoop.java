package hashMap;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapLoop {
    public static void main(String[] args) {

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Rahul", 30);
        ages.put("Patel", 48);
        ages.put("Chitra", 32);
        ages.put("Deepak", 12);
        ages.put("Suresh", 50);
        ages.put("Chadramoul", 50);
        ages.put("Padmabhan", 50);

        /*
        keySet(),returns the set of key
         */

        for (String name : ages.keySet()) {
            System.out.println(ages.get(name));
        }

        for (String name : ages.keySet()) {
            System.out.println(name);
        }

        String userName1 = null;
        int age1 = 0;
        for (String name : ages.keySet()) {
            if (name.equals("Rahul")) {
                userName1 = name;
                age1 = ages.get(name);
            }
        }
        System.out.println("Name:" + userName1 + "   Age:" + age1);

        String userName2 = null;
        int age2 = 0;
        for (String name : ages.keySet()) {
            if (name.equals("Suresh")) {
                userName1 = name;
                age1 = ages.get(name);
            }
        }
        System.out.println("Name:" + userName1 + "   Age:" + age1);


        String[] names = new String[ages.keySet().size()];
        int i = 0;

        for (String name : ages.keySet()) {
            names[i] = name;
            i++;

        }
        System.out.println(Arrays.toString(names));


        int[] arrayOfAges = new int[ages.size()];

        int k = 0;
        for (String name : ages.keySet()) {
            arrayOfAges[k] = ages.get(name);

            k++;

        }
        System.out.println(Arrays.toString(arrayOfAges));

        System.out.println("Just printing the hashmap itself:" + ages);
        System.out.println("Printing the entryest of the map" + ages.entrySet());


        HashMap<String, String> fruitsAndVegetables = new HashMap<>();
        fruitsAndVegetables.put("apple", " fruit");
        fruitsAndVegetables.put("carrot", " vagetable");
        fruitsAndVegetables.put("pear", " fruit");
        fruitsAndVegetables.put("caabage", " vagatable");

        for (String key : fruitsAndVegetables.keySet()) {
            if (fruitsAndVegetables.get(key).equals("fruit")) {
                System.out.println(key);
            }
        }

        HashMap<String, String> words = new HashMap<>();
        words.put("window", "house");
        words.put("brick", "house");
        words.put("rain", "nature");
        words.put("water", "swimming");
        words.put("association", "organization");
        words.put("software", "system");


        for (String key : words.keySet()) {

            if (words.get(key).length() <= 5) {
                System.out.println("Length <= 5:" + words.get(key));
            } else if (words.get(key).length() >= 7) {
                System.out.println("Lwength >= 7:" + words.get(key));
            }
        }


        for (String key : words.keySet()) {
            if (key.startsWith("a") || key.startsWith("b") || key.startsWith("c")) {
                System.out.println("key starts with a,b, or c:" + key);
            }
        }


        for (String key : words.keySet()) {
            if (key.endsWith("e") || key.startsWith("o")) {
                System.out.println("ends with e or o" + key);
            }
        }


    }
}
