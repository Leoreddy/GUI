import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwingDemo{

        public static final int WIDTH = 350;
        public static final int HEIGHT = 250;

    public static void main (String [] args)
    {
        JFrame firstWindow = new JFrame("First Window");
        firstWindow.setSize(WIDTH,HEIGHT);
        firstWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        firstWindow.setVisible(true);        // Shows JFrame
        
        // Current default is hide on close - will still run in background


        // Create a button, need to import first
        JButton endButton = new JButton("Click to end program.");
        EndingListener buttonEar = new EndingListener();
        endButton.addActionListener(buttonEar); //Attaches action listener to button

        firstWindow.add(endButton);


    }

}