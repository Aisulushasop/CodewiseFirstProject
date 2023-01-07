package wrapperClasses;

public class RecapUnboxing {
    public static void main(String[] args) {
       Integer a = 10;
       int b = a;

       Integer c = Integer.valueOf("1232");
       b = c;

       Byte b1 = Byte.valueOf((byte)12);
       byte s1 = b1;

       Short s2 = Short.valueOf((short) 123);
       short s3 = s1;

       Long l1 = Long.valueOf(12333333);
       long l2 = l1;

       Double d1 = Double.valueOf(123.45);
       double d2 = d1;

       Character ch1 = Character.valueOf('*');
       char ch2 = ch1;

       Float fl1 = Float.valueOf(88.88f);




    }
}
