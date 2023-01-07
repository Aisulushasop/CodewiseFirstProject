package varibles;

public class Cat {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        tom.isVaccinated = true;
        tom.breed = "Hawaiian";
        tom.gender = "Boy";
        tom.info();
        Cat cat1 = new Cat("Katy");
        cat1.age = 5;
        cat1.owner ="Jane Adams";
        cat1.info();

        System.out.println();
    }

    /// Instance veriable
/// The information or data that belongs or that describes the object
// of this class
    String name;
    int age;
    String breed;
    String gender;
    boolean isVaccinated;
    String owner;
    static String hospitalAddress;

    //local ver
    public Cat(String name) {  // constructor
        this.name = name;



    }

    public void info() {
        System.out.println("\n Cat Information");
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Breed:" + this.breed);
        System.out.println("Owner:" + this.owner);
        System.out.println("Vaccinated:" + this.isVaccinated);
        System.out.println("Gender:" + this.gender);
    }

}
