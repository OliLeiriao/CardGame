import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class GUI implements ActionListener {

    private final JLabel label1;
    public War war;
    public Deck deck;
    public List<Player> players;

    public GUI(){

        /**
         * Game stuff:
        
        deck = new Deck();
        players.add(new Player("Gab"));
        players.add(new Player("Jo"));
        war = new War(deck, players);
        */


        JFrame frame = new JFrame();

        /**
         * Button
         */
        JButton button = new JButton("War!");
        button.addActionListener(this);

        /**
         * Label for text
         */
        label1 = new JLabel("Number of clicks: 0");

        /**
         * Panel parameters
         */
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label1);

        /**
         * Frame parameters
         */
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Simple");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        label1.setText("hi");

    }
}
