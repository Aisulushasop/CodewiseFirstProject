package constractors;

public class InstagramUser {

    String name;
    String userName;
    String password;
    String bio;
    String link;
    Boolean isPrivate;

    public InstagramUser(String name, String userName, String password) {   //default constructor no paramatres
        this.name = name;                 //we use this. keyword.//
        this.userName = userName;
        this.password = password;
        this.isPrivate = false;
        this.link = "www.instagram.com";
    }

    public void display() {
        System.out.println(" User details");
        System.out.println(" Name" + this.name);
        System.out.println(" Username:" + this.userName);
        System.out.println("Password:" + this.password);
        System.out.println("Bio:" + this.bio);
        System.out.println(("Link:" + this.link));
        System.out.println("Is private:" + this.isPrivate + "\n");

    }

    public InstagramUser(String name, String userName, String password, String bio) {
        this.name = name;                 //we use this. keyword.//
        this.userName = userName;
        this.password = password;
        this.isPrivate = false;
        this.link = "www.instagram.com";

    }

    public InstagramUser(String name, String userName, String password, String bio, String link) {
        this.name = name;                 //we use this. keyword.//
        this.userName = userName;
        this.password = password;
        this.isPrivate = false;
        this.link = link;


    }

public void postStory( String message){
    System.out.println( this.name + " just posted a story:"+ message + "\n");


}
public void visitProfile( InstagramUser user){
       if ( user.isPrivate == true){
           System.out.println( "The user is.private.Can't display profile details");
       }


}







}
