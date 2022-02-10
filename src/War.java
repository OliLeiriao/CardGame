import java.util.ArrayList;
import java.util.List;

public class War {

    List<Player> players;
    private final Deck deck;


    public War(Deck deck, List<Player> players){
        this.deck = deck;
        this.players = new ArrayList<>();
        this.players.addAll(players);
    }

    /**
     *
     * @return player who won this hand.
     */
    public Player turn(){

        for(Player p : players){
            Card drawn = deck.drawCard();
            p.drawCard(drawn);
        }
        /////////////////STOPPED HERE
        return players.get(0);

    }



}
