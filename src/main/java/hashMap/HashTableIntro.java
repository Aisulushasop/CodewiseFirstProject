package hashMap;

import java.util.Hashtable;

public class HashTableIntro {
    public static void main(String[] args) {
        Hashtable<String,Integer> productPrices = new Hashtable<>();
        productPrices.put("apple",3);
        productPrices.put("sugar",5);
        productPrices.put("pepper",1);
        productPrices.put("avocado",2);
        productPrices.put("chicken",6);
        productPrices.put("milk",4);


    }

public static int calculateTheSum (Hashtable<String,Integer> products,int quantity ){
        int sum = 0;
        for ( String key : products.keySet()){
            sum += products.get(key)*quantity;
        }
    System.out.println("The products to buy:" + products);
    System.out.println("The quentity of each product:" + quantity);
    System.out.println("The total price for the list of products provided is:" + sum);

  return sum;
}




}
