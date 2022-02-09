public class Deck {

    private Card[] deck;

    /**
     * Constructor
     */
    public Deck(){

        this.deck = new Card[52];

        int count = 0;
        for(Suit suit : Suit.values()){

            for(Strength strength : Strength.values()){
                deck[count] = new Card(suit, strength);
                count++;
            }

        }

    }

    /**
     * Put all the used cards back into the deck,
     * and shuffle it into a random order.
     */
    public void shuffle(){
        for (int i = deck.length-1; i > 0; i--) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
    }


    /**
     *
     * @return number of cards left in the deck.
     */
    public int cardsLeft(){
        return 0;
    }

    /**
     *
     * @return one card drawn from remaining in deck
     * @throws IllegalStateException if deck has no more cards.
     */
    public Card dealCard(){
        return null;
    }

    public Card[] getDeck() {
        return deck;
    }

    public void printDeck(){
        for(Card c : deck){
            System.out.println(c.toString());
        }
    }
}
