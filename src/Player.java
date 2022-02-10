import java.util.ArrayList;
import java.util.List;

public class Player {

    private final List<Card> hand;

    public Player(){
        this.hand = new ArrayList<>();
    }

    public void drawCard(Card c){
        hand.add(c);
    }

    public Card playTopCard(){
        if(hand.size() == 0){
            throw new IndexOutOfBoundsException ("Player hand is empty.");
        }
        Card c = hand.get(0);
        hand.remove(c);
        return c;
    }


}
