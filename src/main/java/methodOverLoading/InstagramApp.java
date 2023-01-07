package methodOverLoading;

import constractors.InstagramUser;

public class InstagramApp {
    public static void main(String[] args) {

        InstagramUser user1 = new InstagramUser("James Bond", "jb2022", "JB2022!");
        user1.display();

        InstagramUser user2 = new InstagramUser("John Wick", "jw20", "Wich22", "I i am an actor");
        user2.display();

        InstagramUser user3 = new InstagramUser("Cristiano Ronaldo", " ronaldo", "CR7", "Football is Life", "cr.com");
        user3.display();


        String name = "James";
        String title = "7 habits";
        title = name;
        System.out.println(name);
        System.out.println(title);
        // I want to print "7 habits"


    }
}
