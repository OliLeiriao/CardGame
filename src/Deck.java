import java.util.*;

import static java.util.Collections.shuffle;

public class Deck {

    private final List<Card> deck;

    /**
     * Constructor
     */
    public Deck(){

        this.deck = new ArrayList<>();

        for(Suit s : Suit.values()){

            for(Rank r : Rank.values()){

                deck.add(new Card(s, r));

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

    public boolean isEmpty(){
        return deck.size() == 0;
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
     * @throws IllegalStateException if deck has no more cards.
     */
    public Card drawCard(){
        if(deck.size() == 0){
            throw new IllegalStateException ("Deck is empty");
        }
        Card drawn = deck.get(0);
        deck.remove(0);
        return drawn;
    }
}
