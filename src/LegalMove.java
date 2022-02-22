public class LegalMove {

    private final Card comparor;
    private final Card compared;

    public LegalMove(Card comparor, Card compared){
        this.comparor = comparor;
        this.compared = compared;
    }

    /**
     *
     * @return boolean of whether the inputted comparor is legal given inputted compared card
     */
    public boolean isLegal(){
        // CASE 1: card is 2, 3, 9 or 10 --> Always legal.
        if(comparor.getRank() == 2 || comparor.getRank() == 3 || comparor.getRank() == 9 || comparor.getRank() == 10){
            return true;
        }
        // CASE 2: rank of comparor is greater than compared --> legal.
        else return comparor.getRank() >= compared.getRank();
    }


}
