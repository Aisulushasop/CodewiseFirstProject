package clssesAndObjects;

public class School {

public static void main (String [] args) {
    Student object1 = new Student ();
    Student object2 = new Student ();




    object1.firstName="Aisuluu";    /////its a value
    object1.lastName="Sopubekova";
    object1.major = "testing";
    object1.yearOfStudy= 2022;


    System.out.println(object1.firstName);
    System.out.println(object1.lastName);

    object2.firstName ="Bena";
    object2.lastName ="Bai";
    object2.major ="Programming";
    object2.yearOfStudy = 2017;
    System.out.println(object1.firstName);
    System.out.println(object1.lastName);


     object1.reads();
     object1.writes();

     object2.reads();
     object2.writes();

object1.isHomework();
object2.isHomework();



}








}



