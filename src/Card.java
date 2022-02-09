public class Card {

    Suit suit;
    Strength strength;

    public Card(Suit suit, Strength strength){
        this.suit = suit;
        this.strength = strength;
    }

    public Suit getSuit() {
        return suit;
    }

    public Strength getStrength() {
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
