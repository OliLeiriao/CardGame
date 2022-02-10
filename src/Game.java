public class Game {

    public static void main(String[] args){
        Deck d = new Deck();
        System.out.println("Full deck: " + d.cardsLeft() + "\n");
        d.shuffleDeck();

        Card c1 = d.drawCard();
        System.out.println(c1.toString());
        Card c2 = d.drawCard();
        System.out.println(c2.toString());

        CompareCards c = new CompareCards(c1,c2);

        System.out.println(c.getHigherCard().toString());
        System.out.println(c.sameSuit());

        System.out.println("Deck count: " + d.cardsLeft());

    }

}
