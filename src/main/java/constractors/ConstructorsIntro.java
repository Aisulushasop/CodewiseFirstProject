package constractors;

public class ConstructorsIntro {

   public ConstructorsIntro(){
       System.out.println( "Hello! I am a Constructor");

   }
  public ConstructorsIntro( String name,int age){
      System.out.println( "Hello" + name + "I am " + age);
  }





    public static void main(String[] args) {

        ConstructorsIntro object = new ConstructorsIntro();
        ConstructorsIntro object2 = new ConstructorsIntro();
        ConstructorsIntro object3 = new ConstructorsIntro();



    }









}
