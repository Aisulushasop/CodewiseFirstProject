package clssesAndObjects;

public class Student {

////// we dont have to create main method here because we will not run it we will just create atribute///
String firstName;
String lastName;

byte age;

String email;
String major;

Short yearOfStudy;



/// method is action/// its functionality


public void reads() {

    System.out.println(firstName + "" + lastName + "is reading");
}


    public void writes() {
        System.out.println(firstName + "" + lastName + "is writing");
    }

    public boolean isHomework() {
            System.out.println(firstName + "" + lastName + "completed homework");
            return true;

        }






}

