public enum Suit {

    HEARTS("Hearts"), DIAMONDS("Diamonds"), SPADES("Spades"), CLUBS("Clubs");

    private final String val;

    Suit(String val){
        this.val = val;
    }

    public String getSuit(){
        return this.val;
    }


}
