import java.util.ArrayList;
import java.util.List;

public class Oxford {

    public List<Player> players;
    public Deck deck;

    public Oxford(List<Player> players, Deck deck){

        // CASE: MAX 4 players:
        if(players.size() > 4)
            throw new IllegalArgumentException("Max players permitted: 4");

        this.players = players;
        this.deck = deck;
    }

    public void start() {

        // Deal board to each player (6 cards), 0-2 are visible, 3-5 are hidden.
        for (Player p : players) {

            List<Card> board = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                board.add(deck.drawCard());
            }
            p.dealBoardHand(board);
        }


        // Distributes the base setup for each player on the board.
        for (Player p : players) {

            // Draw Hand of 3 cards
            for (int i = 0; i < 3; i++) {
                p.drawCard(deck.drawCard());
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder("\nCurrent Game: ");
        output.append("\nDeck: ").append(deck.cardsLeft());
        for(Player p : players){
            output.append("\n").append(p.getName()).append("'s hand: ").append(p.getHandSize());
            output.append("\n").append(p.getBoardHand());
        }

        return output.toString();

    }

}
