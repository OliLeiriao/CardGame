import java.util.ArrayList;
import java.util.List;

public class Player {

    private final String name;
    private final List<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    /**
     *
     * @param c card to add to player's hand.
     */
    public void drawCard(Card c){
        hand.add(c);
    }

    /**
     *
     * @return the card in position 0 of player's hand.
     */
    public Card playTopCard(){
        if(hand.size() == 0){
            throw new IndexOutOfBoundsException ("Player hand is empty.");
        }
        Card c = hand.get(0);
        hand.remove(c);
        return c;
    }

    /**
     * @param index of card from hand to be played.
     * @return Card to be played
     */
    public Card playCard(int index){

        if(hand.size() == 0){
            throw new IllegalStateException(name + "'s hand is empty");
        }

        Card play = hand.get(index);
        hand.remove(play);
        return play;
    }

    /**
     * @return name of player
     */
    public String getName(){
        return this.name;
    }


}
