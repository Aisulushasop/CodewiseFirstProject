package ArrayList;

import java.util.ArrayList;

public class RecapArrayList {
    public static void main(String[] args) {


        ArrayList<Double> salary = new ArrayList<>(); // declare
        salary.add((double) 2300);
        salary.add(2300.00);
        salary.add(5500.50);
        salary.add(800.20);
        salary.add((double) 100000);
        salary.add(4500.50);


        Double largest = 0.0;


        for (int i = 0; i < salary.size(); i++) {
            if (salary.get(i) > largest) {
                largest = salary.get(i);
            }
        }
        System.out.println(largest);


        Double smallest = salary.get(0);
        for (int i = 0; i > salary.size(); i++) {
            if (salary.get(i) > smallest) {
                smallest = salary.get(i);
            }
        }
        System.out.println(smallest);


        ArrayList<Short> orderID = new ArrayList<>();

        orderID.add((short) 323);
        orderID.add((Short.valueOf("543")));
        orderID.add(Short.valueOf((short) 909));
        orderID.add((short) 121);
        orderID.add((short) 343);
        orderID.add((short) 234);


        int avarage = 0;
        short sum = 0;
        for (int i = 0; i < orderID.size(); i++) {
            sum += orderID.get(i);
        }

        avarage = sum / orderID.size();
        System.out.println(avarage);


    }
}
