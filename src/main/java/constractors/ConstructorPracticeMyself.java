package constractors;

public class ConstructorPracticeMyself {
    public ConstructorPracticeMyself() {
        System.out.println("Hello! I am a constructor");}

    public ConstructorPracticeMyself(String name){
        System.out.println( " Hello " + name + "! This is another constructor with one argument");
    }
    public ConstructorPracticeMyself ( String name,int age){
        System.out.println("Hello" + name + "! am" + age);}


    public static void main(String[] args) {
    ConstructorPracticeMyself object = new ConstructorPracticeMyself();
    ConstructorPracticeMyself object1 = new ConstructorPracticeMyself();
    ConstructorPracticeMyself object2 = new ConstructorPracticeMyself( "Codewise");
    ConstructorPracticeMyself object3 = new ConstructorPracticeMyself("Codewise " + 16);


    }








}
