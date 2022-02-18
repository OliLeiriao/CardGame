public class Test {

    public static void main(String[] args){
        Player p = new Player("Oli");
        Deck d = new Deck();

        d.shuffleDeck();

        p.drawCard(d.drawCard());
        p.drawCard(d.drawCard());
        p.drawCard(d.drawCard());
        p.drawCard(d.drawCard());
        System.out.println(p.getHand());


    }

}
