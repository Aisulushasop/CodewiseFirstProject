package arrays;

public class Green {
    public static void main(String[] args) {

        int age = 35;
        char letter = 'S';

        // Wrapper class
        // convert age and letter to object type.Wrapper class
        // Autoboxing: converting from primitive to object
        Integer i = age;  // autoboxing
        System.out.println(i);
        System.out.println(age);

        Character c = letter;
        // unbox both i and c  into primitive data types. Create new ones
        char s = c;
        int w = i;

        Boolean b = true; // boolean b = true;
        boolean v = b;

        /// Arrays.toString(arr);=> print all values is that array
        // Utility method   // something useful helpful
        System.out.println(Integer.sum(6, 4)); // utility method
        System.out.println(Integer.max(45, 25));// utility method
        System.out.println(Byte.MAX_VALUE); // utility method
        System.out.println(Long.MAX_VALUE); // utility method


        char cc = '9';
        System.out.println(Character.isDigit(cc));// true
        System.out.println(" Password validation\n");
        System.out.println(validatePassword("James!2022"));
    }

    public static boolean validatePassword(String password) {
        boolean found = false;
        for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);
            if (Character.isDigit(letter)) {
                found = true;
                break;
            }

        }
        return found;




















    }
}
