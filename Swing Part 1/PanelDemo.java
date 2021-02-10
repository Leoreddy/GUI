import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDemo extends JFrame implements ActionListener {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    
    private JPanel bluePanel;
    private JPanel whitePanel;
    private JPanel grayPanel;

    public static void main(String[] args) {
        PanelDemo gui = new PanelDemo();
        gui.setVisible(true);
    }

    public PanelDemo() {
        super("Panel Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set layout of the JFrame
        setLayout(new BorderLayout());

        //Container panel to hold 3 smaller panels
        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(1, 3));
             
        bluePanel = new JPanel();
        bluePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(bluePanel);

        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(whitePanel);

        grayPanel = new JPanel();
        grayPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(grayPanel);
        
        //Now add the panel to the JFrame
        add(biggerPanel, BorderLayout.CENTER);
        
        //Create a new panel to hold our buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());
        
        JButton blueButton = new JButton("Blue");
        blueButton.setBackground(Color.BLUE);
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);
        
        JButton whiteButton = new JButton("White");
        whiteButton.setBackground(Color.WHITE);
        whiteButton.addActionListener(this);
        buttonPanel.add(whiteButton);

        JButton grayButton = new JButton("Gray");
        grayButton.setActionCommand("b3");
        grayButton.setBackground(Color.GRAY);
        grayButton.addActionListener(this);
        buttonPanel.add(grayButton);
        
        add(buttonPanel, BorderLayout.SOUTH);

    }

    //We defined the action listener in the same class, hence we can pass "this" as the action listener
    public void actionPerformed(ActionEvent e) {

        String buttonString = e.getActionCommand();

        if (buttonString.equals("Blue"))
            bluePanel.setBackground(Color.BLUE);
        else if (buttonString.equals("White"))
            whitePanel.setBackground(Color.WHITE);
        else if (buttonString.equals("b3"))
            grayPanel.setBackground(Color.GRAY);
        else
            System.out.println("Unexpected error.");
    }
}