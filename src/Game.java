import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    public static void main(String[] args){

        /**
         * Initialize Deck
         */
        Deck d = new Deck();
        d.shuffleDeck();

        /**
         * Initialize computer player
         */
        Player comp = new Player("Greg");

        /**
         * Initialize human player, to play through command line.
         */
        System.out.println("\n\n\n\n\n\n\nWhat is your name?");
        
        Scanner sc = new Scanner(System.in);
        String pName = sc.nextLine();
        Player human = new Player(pName);

        /**
         * Game Intro Screen
         */
        System.out.println("\n\nHello, "+ pName + "\nWelcome to \n!!!!!!!!!!!!!!!!!!!\n\tWAR\n!!!!!!!!!!!!!!!!!!!");
        System.out.println("Your opponent is: " + comp.getName());

        List<Player> players = new ArrayList<>();
        players.add(comp);
        players.add(human);

        System.out.println("\n\n\nReady to play? Press ENTER to continue");
        sc.nextLine();

        /** 
         * First Round
         */
        
        War war = new War(d, players);
        String result = war.turn();
        System.out.println(comp.getName() + "'s card: " + comp.getNextCard().toString());
        System.out.println("Your card: " + human.getNextCard().toString());
        System.out.println(result);


    }

}
