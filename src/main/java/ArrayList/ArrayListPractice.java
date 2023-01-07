package ArrayList;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {


        ArrayList<Integer> evenNumbers = new ArrayList<>();
          for (int i = 0; i<=20; i ++){
              if ( i % 2 ==0){
               evenNumbers.add(i);

              }

          }
        System.out.println(evenNumbers);
        ArrayList<Integer> divisible = new ArrayList<>();
      for( int i = 0; i<+100; i ++){
          if( i % 3 == 0){
            divisible.add(i);

          }
      }
        System.out.println(divisible);


        ArrayList<String> apples = new ArrayList<>();
        for( int i = 2; i<=100; i++){
            apples.add(i+"apples");
          if(i % 10 !=0){
              apples.add(i+ "apples");
          }




        }

        System.out.println(apples);
     boolean b = apples.contains("2 apples");
        System.out.println(" 2 apple ");

        b = apples.contains("10 apples");



    }















}
