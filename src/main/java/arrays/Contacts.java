package arrays;

public class Contacts {
    public static void main(String[] args) {
       String [] groceries = { "Bread","Cucumber","Apples","Orange","Cookies","Cake","Banana"};
        int counter = 0;

       for ( int i = 0; i < groceries.length; i++) {
           String temp = (groceries[i]);
       if( temp.charAt(0) == 'A'){
           counter++;
       }

       }
        System.out.println("Total words with A:" + counter);
    }
}
