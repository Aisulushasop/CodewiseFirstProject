package hashMap;

import java.util.HashMap;

public class HashMapIfAbsent {
    public static void main(String[] args) {

        HashMap<String,String> catOwners = new HashMap<>();
        catOwners.put("Tom","Mira");
        catOwners.put("Garfield","Aisuluu");
        catOwners.put("Akzholtoi","Saikal");
        catOwners.put("MyiMyi","Myrthahan");
        System.out.println("The size:" + catOwners.size());
        System.out.println("Cat Owners" + catOwners);

        catOwners.putIfAbsent("Arti","Alina");
        System.out.println("The size:" + catOwners.size());
        System.out.println("Cat Owners" + catOwners);

        catOwners.putIfAbsent("Myimyi","Meerim");
        System.out.println("The size:" + catOwners.size());
        System.out.println("Cat Owners" + catOwners);

        catOwners.putIfAbsent("Ginger","Alina");
        System.out.println("The size:" + catOwners.size());
        System.out.println("Cat Owners" + catOwners);


      int i = 1;
      for(String cat : catOwners.keySet()){
          System.out.println("cat #" + i + " " + cat);
         i++;
      }



      int a = 1;
      for(String cat : catOwners.keySet()){
          System.out.println("Cat #" + a + " " + cat + ", Owner #" + a + " " +  catOwners.get(cat));
       a++;
      }

     catOwners.replace("Arti","Ilgiz");

        System.out.println(catOwners);// replace a value










    }
}
