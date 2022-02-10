public class Card {

    final private Suit suit;
    final private int strength;

    /** Constructor
     *
     * @param suit of card
     * @param strength value of card
     */
    public Card(Suit suit, int strength){
        this.suit = suit;
        this.strength = strength;
    }

    /**
     *
     * @return suit of card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     *
     * @return strength of card
     */
    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", strength=" + strength +
                '}';
    }
}
