import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo extends JFrame implements ActionListener {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    private JPanel bluePanel;
    private JPanel whitePanel;
    private JPanel grayPanel;

    public static void main(String[] args) {
        MenuDemo gui = new MenuDemo();
        gui.setVisible(true);
    }

    public MenuDemo() {
        //Call the super constructor and set title of the JFrame
        super("Menu Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set the layout manager to be a GridLayout
        setLayout(new GridLayout(1, 3));

        //Add panels to change colour for this Demo
        bluePanel = new JPanel();
        bluePanel.setBackground(Color.LIGHT_GRAY);
        add(bluePanel); //Add panel to the JFrame

        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        add(whitePanel);

        grayPanel = new JPanel();
        grayPanel.setBackground(Color.LIGHT_GRAY);
        add(grayPanel);

        //Create a menu
        JMenu colorMenu = new JMenu("Add Colors");
        JMenu secondMenu = new JMenu("Second");
        
        //MeuItems
        JMenuItem blueChoice = new JMenuItem("Blue");
        blueChoice.addActionListener(this);
        colorMenu.add(blueChoice);
        
        JMenuItem whiteChoice = new JMenuItem("White");
        whiteChoice.addActionListener(this);
        colorMenu.add(whiteChoice);
        
        JMenuItem grayChoice = new JMenuItem("Gray");
        grayChoice.addActionListener(this);
        colorMenu.add(grayChoice);
        

        //This shows an example of a sub menu within a menu
        JMenu sub = new JMenu("SubMenu");
        JMenuItem sub1 = new JMenuItem("Item 1");
        //Now add the sub1 (Menu Item) to the subMenu
        sub.add(sub1);
        //Now add the subMenu to the parent menu
        secondMenu.add(sub);
        



        //JMenBar holds all the top level menus
        JMenuBar bar = new JMenuBar();
        bar.add(colorMenu);
        bar.add(secondMenu);
        
        //Add all menu Items to the menuBar


        //Set the menuBar in the JFrame
        setJMenuBar(bar);
        
    }



    public void actionPerformed(ActionEvent e) {

        String buttonString = e.getActionCommand();

        if (buttonString.equals("Blue"))
            bluePanel.setBackground(Color.BLUE);
        else if (buttonString.equals("White"))
            whitePanel.setBackground(Color.WHITE);
        else if (buttonString.equals("Gray"))
            grayPanel.setBackground(Color.GRAY);
        else
            System.out.println("Unexpected error.");
    }
}