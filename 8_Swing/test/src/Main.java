import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        this.setTitle("Swing frame with label");

        this.setLayout(new GridLayout(8, 4));

        this.add(new JLabel("Halloooo"));
        this.add(new JTextField());
        this.add(new JPasswordField());
        this.add(new JButton("Knopf"));
        this.add(new JToggleButton("toggle"));
        this.add(new JCheckBox("Robin Fischer"));
        this.add(new JComboBox<>(new String[]{"Wühlmaus", "Knopfauge", "lange Nase"}));
        this.add(new JRadioButton());

        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}