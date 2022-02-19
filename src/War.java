import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class War {

    List<Player> players;
    private final Deck deck;

    public War(Deck deck, List<Player> players){
        this.deck = deck;
        this.players = new ArrayList<>();
        this.players.addAll(players);
    }

    public static void main(String[] args){

        //
        // Initialize Deck

        Deck d = new Deck();
        d.shuffleDeck();

        //
        // Initialize computer player

        Player comp = new Player("Greg");

        //
        // Initialize human player, to play through command line.

        System.out.println("\n\n\n\n\n\n\nWhat is your name?");

        Scanner sc = new Scanner(System.in);
        String pName = sc.nextLine();
        Player human = new Player(pName);

        //
        // Game Intro Screen

        System.out.println("\n\n\n\n\n\n\nHello, "+ pName + "\nWelcome to \n!!!!!!!!!!!!!!!!!!!\n\t\tWAR\n!!!!!!!!!!!!!!!!!!!");
        System.out.println("Your opponent is: " + comp.getName());

        List<Player> players = new ArrayList<>();
        players.add(comp);
        players.add(human);

        // Start of Game
        War war = new War(d, players);
        System.out.println("\n\nReady to play? Press ENTER to continue");
        sc.nextLine();

        // Round tracker:
        int round = 0;

        // Score tracker:
        int p1Score = 0;
        int p2Score = 0;

        // used to record response to a round, whether to continue or quit.
        String response = "y";

        // ROUNDS
        // Loops until user inputs "n" after a round, or deck runs out of cards.
        while(!response.toLowerCase(Locale.ROOT).equals("n")){
            if(response.toLowerCase(Locale.ROOT).equals("y")){

                // increment round
                round++;
                // Print round number
                System.out.println("\n\nROUND " + round + ": \n");

                int result = war.turn();

                // Returns code for winner.
                // 0 --> p1 wins
                // 1 --> p2 wins
                // 2 --> tie
                switch (result) {
                    case 0 -> {
                        System.out.println(players.get(0).getName() + " wins!");
                        p1Score++;
                    }
                    case 1 -> {
                        System.out.println(players.get(1).getName() + " wins!");
                        p2Score++;
                    }
                    case 2 -> System.out.println("It's a tie!");
                }

                // Print Scoreboard:
                System.out.println("\nCurrent Score:");
                System.out.println(players.get(0).getName() + ": " + p1Score);
                System.out.println(players.get(1).getName() + ": " + p2Score);

                if(war.deck.isEmpty()){
                    System.out.println("\n\n\n\n\nDeck is empty.");
                    break;
                }

                // Play again prompt?
                System.out.println("\n\nPlay again? (y/n)");

            }else{

                System.out.println("Invalid input; Please try again:");
                System.out.println("\nPlay again? (y/n)");

            }
            response = sc.nextLine();
        }

        System.out.println("\n\n\nGoodbye.");

    }

    /**
     *
     * @return int code for winner (0 for player1, 1 for player2, 2 for tie)
     */
    public int turn(){

        // each player draws a card from the deck, and adds it to their hand;

        for(Player p : players){
            Card drawn = deck.drawCard();
            p.drawCard(drawn);
        }

        // Prints out each player's card
        System.out.println(players.get(0).getName() + "'s card: " + players.get(0).getNextCard().toString());
        System.out.println("Your card: " + players.get(1).getNextCard().toString());


        // Cards are played and compared, returns code of winner:

        Card p1c = players.get(0).playTopCard();
        Card p2c = players.get(1).playTopCard();

        if(p1c.getRank() > p2c.getRank()){

            return 0;

        }else if(p1c.getRank() < p2c.getRank()){

           return 1;

        }else{

            return 2;
            
        }

    }

}
