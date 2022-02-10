import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {


    private int count = 0;
    private final JLabel label;

    public GUI(){
        JFrame frame = new JFrame();

        JButton button = new JButton("CLICK ME");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);


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
        count++;
        label.setText("Number of clicks: " + count);
    }
}
