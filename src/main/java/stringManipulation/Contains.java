package stringManipulation;

public class Contains {

    public static void main(String[] args) {


    /////contains () method comes from String class and can only be used by String it cheks
        ///if one string contains
        //returns boolean:true or false



    String slogan = " Chicago is a windy city";
    String  city = "Chicago";
    boolean doesItContain = slogan.contains(city);
        System.out.println( doesItContain);
        doesItContain = slogan.contains( "windy");
        System.out.println( doesItContain);
        doesItContain = slogan.contains("win");
        System.out.println( doesItContain);
          doesItContain = slogan.contains("y");
        System.out.println( doesItContain);





        String company = " GOOGle";
        String website = " google";
        boolean b =company.contains( website);/// false

        System.out.println( " boolean b" + b);

b = company.contains(website.toUpperCase());
        System.out.println( b);///GOOGLe==GOOGLE






















    }








}

