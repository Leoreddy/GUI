import javax.swing.JFrame;
import javax.swing.JButton;

public class FirstWindow extends JFrame {

    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public FirstWindow() {
        super(); // Can create title by passing it to this constructor
        setTitle("First Window Class");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JButton endButton = new JButton("Click to end program.");
        endButton.addActionListener(new EndingListener());
        add(endButton);
    }
}

//Neater way