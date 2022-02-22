import java.util.ArrayList;
import java.util.List;

public class Player {

    private final String name;
    private final List<Card> hand;
    private List<Card> boardHand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    /**
     *
     * @param c card to add to player's hand.
     */
    public void drawCard(Card c){
        hand.add(c);
    }

    /**
     *
     * @return Card object in position 0 of player's hand.
     */
    public Card playTopCard(){
        if(hand.size() == 0){
            throw new IndexOutOfBoundsException ("Player hand is empty.");
        }
        Card c = hand.get(0);
        hand.remove(c);
        return c;
    }

    /**
     *
     * @param position of card to get from hand
     * @return the card at requested position
     */
    public Card getCardAt(int position){
        return hand.get(position);
    }

    /**
     * @param index of card from hand to be played.
     * @return Card to be played
     */
    public Card playCard(int index){

        if(hand.size() == 0){
            throw new IllegalStateException(name + "'s hand is empty");
        }

        Card play = hand.get(index);
        hand.remove(play);
        return play;
    }

    public void dealBoardHand(List<Card> cards){
        this.boardHand = new ArrayList<>();
        this.boardHand.addAll(cards);

    }


    /////////////////////////////////////////////
    // GET METHODS FOR STRINGS OF PLAYER STUFF //
    /////////////////////////////////////////////
    /**
     *
     * @return String of board hand left, including info about top cards visible.
     */
    public String getBoardHand(){

        String result = "Remaining in Board: " + this.boardHand.size();

        switch (this.boardHand.size()) {
            case 6 -> {
                result += "\nTop Cards: ";
                result += this.boardHand.get(0).toString() + ", ";
                result += this.boardHand.get(1).toString() + ", ";
                result += this.boardHand.get(2).toString() + " ";
            }
            case 5 -> {
                result += "\nTop Cards: ";
                result += this.boardHand.get(0).toString() + ", ";
                result += this.boardHand.get(1).toString() + " ";
            }
            case 4 -> {
                result += "\nTop Cards: ";
                result += this.boardHand.get(0).toString() + " ";
            }
        }

        return result;

    }

    /**
     * @return String of name of player
     */
    public String getName(){
        return this.name;
    }

    /**
     * @return String of cards currently in player's hand.
     */
    public String getHand(){
        return this.hand.toString();
    }

    public int getHandSize(){
        return this.hand.size();
    }


}
