package hashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMapEntrySet {


    public static void main(String[] args) {
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(10, "ten");
        numbers.put(20, "twenty");
        numbers.put(30, "thirty");
        numbers.put(40, "forty");
        ////// print only keys
        for (Integer key : numbers.keySet()) {
            System.out.println(key);
        }
        ////// print only values
        for (Integer key : numbers.keySet()) {
            System.out.println(numbers.get(key));

        }


        for (Integer key : numbers.keySet()) {
            System.out.println(key + "-" + numbers.get(key));
        }

      for ( Map.Entry<Integer,String> entry: numbers.entrySet()){
          System.out.println(entry);

      }














    }
}
