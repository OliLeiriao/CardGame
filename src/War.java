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
    public String turn(){

        // each player draws a card from the deck, and adds it to their hand;
        for(Player p : players){
            Card drawn = deck.drawCard();
            p.drawCard(drawn);
        }

        /**
         * Cards are compared, returns string of winner:
         */
        if(players.get(0).getNextCard().getRank() > players.get(1).getNextCard().getRank()){

            return players.get(0).getName() + " wins!";

        }else if(players.get(0).getNextCard().getRank() < players.get(1).getNextCard().getRank()){

           return players.get(1).getName() + " wins!";

        }else{

            return "It's a tie!";
            
        }

    }

    /**
     * 
     * @return list of strings of players and the card they played.
     */
    public List<String> getPlayedCards(){
        List<String> plays = new ArrayList<>();

        for(Player p : players){
            plays.add(p.getName() + "'s card: " + p.playCard(0).toString());
        }

        return plays;
    }



}
