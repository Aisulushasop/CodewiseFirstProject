package ifElseLojikalOperatoesJym;

public class HomeWork {

    public class SoccerGame {
        public static void main(String[] args) {
            SoccerPlayer1 gamer = new SoccerPlayer1();
            gamer.name = " Messi";
            gamer.age = 36;
            gamer.club = "Barselona";
            gamer.WillBeHappy = true;

            gamer.plays(gamer.WillBeHappy);
        }

        }

        }
class SoccerPlayer1 {
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
