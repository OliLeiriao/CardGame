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

    /**
     *
     * @return boolean of whether this card is a "Special" card in Oxford
     */
    public boolean isSpecial(){
        return this.rank == 2 || this.rank == 3 || this.rank == 9 || this.rank == 10;
    }
}
