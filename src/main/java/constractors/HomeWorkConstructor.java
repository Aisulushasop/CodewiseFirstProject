package constractors;

public class HomeWorkConstructor {

    public HomeWorkConstructor( String name,int amount ){
        System.out.println(name + amount);


    }
    public HomeWorkConstructor ( int amount, String name){
        System.out.println(amount + name);

    }
    public HomeWorkConstructor ( String name){
        System.out.println(name);
    }
    public HomeWorkConstructor ( boolean b ){
        System.out.println(b);
    }



    public static void main(String[] args) {
     HomeWorkConstructor work = new HomeWorkConstructor("Constructor",10);
     HomeWorkConstructor work1 = new HomeWorkConstructor(5,"Verible");
     HomeWorkConstructor work2 = new HomeWorkConstructor("Codewise");
     HomeWorkConstructor work3 = new HomeWorkConstructor(true);

    }
    }