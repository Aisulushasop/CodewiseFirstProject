package ifElseLojikalOperatoesJym;

public class Gym {


    public static void main(String[] args) {


        Person programmer = new Person();

        Person doctor = new Person();
        programmer.name = " Mark Zuckerberg";
        programmer.age = 40;
        programmer.weight = 75;
        programmer.hasStrongWill = true;

        doctor.name = "Komarovsky";
        doctor.age = 65;
        doctor.weight = 90;
        doctor.hasStrongWill = true;


        ////day 1

        programmer.hasFreeTime = false;
        programmer.isInMood = true;
        programmer.goesToGym(programmer.hasFreeTime);
        programmer.worksOut(programmer.isInMood);


        doctor.hasFreeTime = true;
        doctor.isInMood = false;
        doctor.worksOut(doctor.isInMood);


        System.out.println("Day 2 " + programmer.name + " s score:" + programmer.rating);
        System.out.println();
// ===========day2


        programmer.hasStrongWill= false;
        programmer.hasFreeTime=true;
        programmer.isInMood=false;



doctor.hasStrongWill=false;
doctor.hasFreeTime=false;
doctor.isInMood=false;




if (programmer.hasFreeTime&& programmer.isInMood);
programmer.goesToGym(programmer.hasFreeTime);
    programmer.worksOut(programmer.isInMood);









    }


















}














