import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {

    private final JLabel scoreboard;

    public static void main(String[] args){
        new GUI();
    }

    public GUI(){

        JFrame frame = new JFrame();

        // Frame
        frame.setVisible(true); // Makes frame visible

        frame.setSize(900,600); // Sets size of frame

        frame.setTitle("War"); // Sets Title of frame;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits applications (Default is just HIDE_ON_CLOSE);

        frame.setResizable(false); // Prevents resizing of frame

        ImageIcon icon = new ImageIcon("assets/card-game-icon-25.png"); // Find icon file
        frame.setIconImage(icon.getImage()); // Sets Icon for frame window

        frame.getContentPane().setBackground(new Color(0xdedede)); // Changes frame background colour.

        // Label (Display component, can have text, image or both
        scoreboard = new JLabel();
        scoreboard.setText("Score: \n"); // set text for label

        // Panel (Container for other components, can also section off frames
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0xaaaaaa));
        panel.setBounds(25,150,175,200);

        panel.add(scoreboard);


        // Add our components to frame
        frame.add(panel);



    }

    @Override
    public void actionPerformed(ActionEvent event) {
        scoreboard.setText("hi");
    }
}
