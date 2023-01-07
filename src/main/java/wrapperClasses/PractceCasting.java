package wrapperClasses;

public class PractceCasting {

    public static void main(String[] args) {

     String StringNumber = "19932";
     Integer intNumber2 = Integer.valueOf(StringNumber);

     int r = intNumber2;

     //
     double dd = Double.valueOf(StringNumber);
    double dd2 = dd;


    String intWrap = "123";
    Integer intWrap2 = Integer.valueOf(intWrap);
    Double doubleWrap = Double.valueOf(intWrap);
    Short shortWrap = Short.valueOf(intWrap);




    Integer intObj = Integer.valueOf("1234");
    String str= String.valueOf(intObj);
    String str1 = String.valueOf(doubleWrap);


    Integer intObjg = Integer.valueOf("200");
    int int1 = intObjg;
    int int2 = Integer.valueOf(intObjg);
    int int3 = Integer.parseInt("200");
    Double myDouble = Double.valueOf(123.47);
    double double1 = myDouble;
    Double myDouble2 = Double.parseDouble("2458.566");
    double double3 = myDouble2;

    Boolean boo  = Boolean.valueOf(str);
    boolean boolean1 = boo;
    Boolean boo2 = Boolean.valueOf("False");
    boolean boolean2 = boo2;






    }
}
