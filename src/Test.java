import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args){
        Player p = new Player("Oli");
        Player p2 = new Player("Jo");
        List<Player> players = new ArrayList<>();
        players.add(p);
        players.add(p2);
        Deck d = new Deck();

        d.shuffleDeck();

        Oxford o = new Oxford(players, d);

        o.start();



    }

}
