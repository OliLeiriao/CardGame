import java.util.ArrayList;
import java.util.List;

public class Game {

    public static void main(String[] args){
        Deck d = new Deck();
        d.shuffleDeck();

        Player p1 = new Player("Greg");
        Player p2 = new Player("Gab");

        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);

        War war = new War(d, players);
        war.turn();


    }

}
