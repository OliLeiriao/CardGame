public class CompareCards {

    final private Card card1;
    final private Card card2;


    /** Constructor
     *
     * @param c1 first card to be compared
     * @param c2 second card to be compared against
     */
    public CompareCards(Card c1, Card c2){

        this.card1 = c1;
        this.card2 = c2;

    }

    /**
     *
     * @return the higher card from the pair, null, if they are equal.
     */
    public Card getHigherCard(){
        if(card1.getRank() < card2.getRank()){
            return card2;
        }else if(card1.getRank() > card2.getRank()){
            return card1;
        }else{
            return null;
        }
    }

    /**
     *
     * @return boolean of whether cards share the same suit.
     */
    public boolean sameSuit(){
        return card1.getSuit().equals(card2.getSuit());
    }


}
