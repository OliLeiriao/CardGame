import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Pile {

    public Stack<Card> pile;
    public int count;

    public Pile(){
        this.pile = new Stack<>();
        this.count = 0;
    }

    /**
     *
     * @param cardsPlayed to be added to top of pile.
     */
    public void playToPile(List<Card> cardsPlayed){
        for(Card c: cardsPlayed){
            pile.push(c);
        }
    }

    /**
     *
     * @return string of pile stack
     */
    public String printPile(){
        return pile.toString();
    }

    /**
     *
     * @return top card of pile
     */
    public Card peekPile(){
        return pile.peek();
    }

    /**
     *
     * @return cards in pile, as a list of cards to be added back to hand.
     */
    public List<Card> pickupPile(){
        List<Card> pickup = new ArrayList<>();
        while(!pile.isEmpty()){
            pickup.add(pile.pop());
        }
        return pickup;
    }

}
