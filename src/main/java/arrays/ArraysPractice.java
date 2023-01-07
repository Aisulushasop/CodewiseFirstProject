package arrays;

public class ArraysPractice {

    public static void main(String[] args) {
     int numberOfGroceries = 5;
     String [] groceryList = new String[numberOfGroceries];
     groceryList[0] = "bread";
     groceryList[1] = "meat";
     groceryList[2] = "milk";
     groceryList[3] = "juice";
     groceryList[4] = "avacado";
     for (int i = 0; i< groceryList.length; i++){
         System.out.println( groceryList[i]);
     }



  char [ ] array = new char[] { 'c','d','i','n','g', ' ', 'i','s', ' ', 'g','r','e','a','t' };
     for ( int i = 0; i<array.length;i++) {
         System.out.print(array[i]);

     }

    String[] colors = new String[]{ "blue", "yellow"," orange", "white","black","red"};
     for ( int i = 0; i< colors.length; i++){
         if (colors[i].equals("yellow") || colors[i].equals("green")){
             continue;
         }
         System.out.println(colors[i]);

     }

     int [] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
     for( int i = 1; i<numbers.length; i++) {
         if (numbers[i] == 3 || numbers[i] == 8) {
             continue;
         }
         System.out.println(numbers[i]);

     }

      double [] doubles = new double[]{ 1.99, 2.99, 3.49, 4.69, 5, 6.5, 7.0, 8.1, 9.4,10};
      for ( int i = 0; i< doubles.length; i ++){

          if( i>=5 && i <=8){
              continue;
          }
          System.out.print(doubles[i] +",");
      }



























    }
}
