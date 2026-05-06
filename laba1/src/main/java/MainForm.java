import javax.swing.JFrame;
import javax.swing.JButton;

public class MainForm extends JFrame {

    public MainForm() {
        setTitle("Моё первое Swing окно");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton button = new JButton("Нажми меня");
        add(button);
    }

    public static void main(String[] args) {
        new MainForm().setVisible(true);
    }
}