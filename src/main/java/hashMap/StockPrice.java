package hashMap;

import java.util.HashMap;

public class StockPrice {
    public static void main(String[] args) {

        HashMap<String, Double> stocks = new HashMap<>();
        stocks.put("apple", 400.90);
        stocks.put("tesla", 1200.32);
        stocks.put("meta", 300.43);
        stocks.put("bofa", 5.5);
        stocks.put("slack", 123.54);
        stocks.put("makcdonalds", 98.12);

        findTheHiHigestPrice(stocks);
        findAveragePrice(stocks);
    }

    public static double findTheHiHigestPrice(HashMap<String, Double> stocks) {
        double highest = 0;
        for (String key : stocks.keySet()) {
            if (stocks.get(key) > highest) {

                highest = stocks.get(key);
            }
        }
        System.out.println(highest);
        return highest;


    }

    public static double findAveragePrice(HashMap<String, Double> stocks) {
        double average = 0;
        double sum = 0;
        for (String key : stocks.keySet()) {
            sum += stocks.get(key);

        }
        average = sum / stocks.size();
        System.out.println(average);
        return average;
    }

    public static HashMap<String, Double> removeStocks(HashMap<String, Double> stocks, double minPrice) {




return stocks;
    }
}