package wrapperClasses;

public class RecapWrapperClass {
    public static void main(String[] args) {
        Integer a = 5;
        Boolean b = true;

        Integer c = new Integer(5);
        Boolean d = new Boolean(true);


        Integer number = new Integer(4);
        Integer number1 = new Integer("4");


        Float number3 = new Float(11.6);
        Float number4 = new Float(66.0F);
        Float number5 = new Float(33.9F);

        Short number6 = new Short((short) 33);
        Short number7 = new Short((short) 88);

        Byte number8 = new Byte((byte) 23);
        Boolean b1 = Boolean.valueOf("true");
        Boolean b2 = Boolean.valueOf("True");
        Boolean b3 = Boolean.valueOf("false");
        Boolean b4 = Boolean.valueOf("SomeString");
        Boolean b5 = true;
        System.out.println(b4);

        Long s = Long.valueOf(88);
        Long s1 = 4l;
        Long s2 = Long.valueOf("45");

       Double d1 = Double.valueOf(34);
       Double d2 = Double.valueOf("67.89");
       Double d3 = Double.valueOf(7889.547);
       Double d4 = 4566.800;




    }
}
