import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PasswordGenerator implements ActionListener, ChangeListener {
    private static Random rand = new Random();
    private static int passwordLength = 10;

    // GUI variables
    private static JFrame frame;
    private static JPanel panel;
    private static JTextField password;
    private static JButton generate;
    private static JLabel length;
    private static JSlider lengthSlider;

    public static void main(String[] args) {

        // mandatory setup
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        password = new JTextField();
        password.setBounds(50, 25, 300, 40);
        panel.add(password);

        generate = new JButton("Generate");
        generate.setBounds(150, 150, 100, 50);
        generate.addActionListener(new PasswordGenerator());
        panel.add(generate);

        length = new JLabel("Length");
        length.setBounds(50, 300, 100, 50);
        panel.add(length);

        lengthSlider = new JSlider(JSlider.HORIZONTAL, 0, 24, 12);
        lengthSlider.setBounds(150, 300, 200, 50);
        lengthSlider.addChangeListener(new PasswordGenerator());
        lengthSlider.setMajorTickSpacing(4);
        lengthSlider.setMinorTickSpacing(1);
        lengthSlider.setPaintTicks(true);
        lengthSlider.setPaintLabels(true);
        panel.add(lengthSlider);

        frame.setVisible(true); // do at end

    }

    public static String generatePassword() {

        String password = rand.ints(passwordLength, '!', '{')
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return password;
    }

    // connected to generate button
    @Override
    public void actionPerformed(ActionEvent e) {
        password.setText(generatePassword());
    }

    // connected to lengthSlider
    @Override
    public void stateChanged(ChangeEvent e) {
        passwordLength = lengthSlider.getValue();
    }
}
