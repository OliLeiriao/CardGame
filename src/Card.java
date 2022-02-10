public class Card {

    final private String suit;
    final private String rankName;
    final private int rank;


    public Card(Suit suit, Rank rank){
        this.suit = suit.getSuit();
        this.rankName = rank.getName();
        this.rank = rank.getVal();
    }

    /**
     *
     * @return suit of card
     */
    public String getSuit() {
        return suit;
    }

    /**
     *
     * @return strength of card
     */
    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rankName + " of " + suit;
    }
}
