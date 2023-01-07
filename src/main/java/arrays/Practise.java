package arrays;





public class Practise {
    public static void main(String[] args) {
        getDijit("H23eL510o 202wed!");


    }





    public static void getDijit(String word) {
        String numbers = "";
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (Character.isDigit(letter)) {
                numbers += letter;
            }

        }

        int result = Integer.parseInt(numbers);
        System.out.println("Numbers:" + result);

    }
}