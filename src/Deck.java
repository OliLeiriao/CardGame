import java.util.*;

import static java.util.Collections.shuffle;

public class Deck {

    private final List<Card> deck;

    /**
     * Constructor
     */
    public Deck(){

        this.deck = new ArrayList<>();

        for(Suit suit : Suit.values()){

            for(int i = 1; i<14; i++){

                deck.add(new Card(suit, i));

            }

        }

    }

    /**
     * Put all the used cards back into the deck,
     * and shuffle it into a random order.
     */
    public void shuffleDeck(){
        shuffle(deck);
    }


    /**
     *
     * @return number of cards left in the deck.
     */
    public int cardsLeft(){
        return deck.size();
    }

    /**
     *
     * @return one card drawn from remaining in deck
     * @throws IllegalStateException if deck has no more cards.
     */
    public Card dealCard(){
        return null;
    }

    /**
     *
     * @return deck object
     */
    public List<Card> getDeck() {
        return deck;
    }


    public void printDeck(){
        for(Card c : deck){
            System.out.println(c.toString());
        }
    }

    /**
     *
     * @return draws a card from the deck, and removes it from the deck.
     */
    public Card drawCard(){
        Card drawn = deck.get(0);
        deck.remove(0);
        return drawn;
    }
}
