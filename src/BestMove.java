import java.util.ArrayList;
import java.util.List;

public class BestMove {

    private final Player player;
    private final Pile pile;

    public BestMove(Player player, Pile pile){
        this.player = player;
        this.pile = pile;
    }

    public List<Card> getBestMove(){
        Card topCard = pile.peekPile();
        Card bestMove = null;
        List<Card> move = new ArrayList<>();

        // For every card in the player's hand:
        for(int i = 0; i < player.getHandSize(); i++){

            // Compare against the top of pile to determine if it is a legal move.
            LegalMove possibleMove = new LegalMove(player.getCardAt(i), topCard);
            if(possibleMove.isLegal()){

                // If it is legal, compare to what is currently considered the top
                CompareCards potentialMove = new CompareCards(player.getCardAt(i), bestMove);
                if(!potentialMove.getHigherCard().equals(player.getCardAt(i))){
                    // If it is lower, it is a better move for the purposes of
                    bestMove = player.getCardAt(i);
                }
            }

        }

        // Create list with all versions of a card (in case there is more than one).
        for(int i = 0; i < player.getHandSize(); i++){
            if(bestMove == null){
                break;
            }
            if(player.getCardAt(i).getRank() == bestMove.getRank()){
                move.add(player.getCardAt(i));
            }
        }

        return move;

    }



}
