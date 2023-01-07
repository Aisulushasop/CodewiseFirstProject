package staticPackage;

public class School {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        teacher1.name = " Nicola Tesla";
        teacher1.hasDegree = true;
        teacher1.age = 45;
        teacher1.salary = 4900;
        teacher1.workplace = "Codewise";


        teacher2.name = " Albert Einstein";
        teacher2.hasDegree = false;
        teacher2.age = 56;
        teacher2.salary = 4500;

        System.out.println(teacher1.name);
        System.out.println(teacher1.age);
        System.out.println(teacher2.age);
        System.out.println(teacher2.workplace);// codewise because we have static in class

        teacher2.workplace = "Harvard";
        System.out.println(teacher2.workplace);

        Teacher.workplace = "Columbian";
        System.out.println(teacher2.workplace);// Columbian

        Teacher teacher3 = new Teacher();
        Teacher teacher4 = new Teacher();
        System.out.println(teacher3.name);// it will be null because we are not reassigning
        System.out.println(teacher3.age); // null
        System.out.println(teacher3.workplace);// Columbian because we have last Columbian
        System.out.println(teacher4.year);// cause we dont have values


        Teacher.city = " New York";
        Teacher.year = 2022;










    }


}
