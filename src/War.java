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
     * Plays a simple round of War, printing players' hands and winner's name to console.
     */
    public void turn(){

        // each player draws a card from the deck, and adds it to their hand;
        for(Player p : players){
            Card drawn = deck.drawCard();
            p.drawCard(drawn);
        }

        Card p1Card = players.get(0).playCard(0);
        System.out.println(players.get(0).getName() + "'s card: " + p1Card.toString());
        Card p2Card = players.get(1).playCard(0);
        System.out.println(players.get(1).getName() + "'s card: " + p2Card.toString());

        if(p1Card.getRank() > p2Card.getRank()){
            System.out.println(players.get(0).getName() + " wins!");
        }else if(p1Card.getRank() < p2Card.getRank()){
            System.out.println(players.get(1).getName() + " wins!");
        }else{
            System.out.println("It's a tie!");
        }

    }



}
