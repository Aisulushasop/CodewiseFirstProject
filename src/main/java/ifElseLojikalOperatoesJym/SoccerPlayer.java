package ifElseLojikalOperatoesJym;

public class SoccerPlayer {
 String name;
 String club;
 Byte age;
 Boolean WillBeHappy;
  public void plays( boolean WillBeHappy) {
   if(WillBeHappy){
      System.out.println(name + " " + age + "  years old " + " " + " club is:  "  + club + "  If he wins the game,he will be happy ");
  }else {
       System.out.println(name + " " + age + " years old " +  " " +   club + " If  does not win the game,he will not be happy");


   }


    }

}
