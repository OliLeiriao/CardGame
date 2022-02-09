import java.util.Arrays;

public class Hand {

    private final Card[] hand;

    public Hand(){
        this.hand = new Card[7];
        for(int i=0; i<7; i++){
            hand[i] = new Card(Suit.heart, Strength.ace);
        }
    }

    public Card playCard(){
        return hand[0];
    }



}
