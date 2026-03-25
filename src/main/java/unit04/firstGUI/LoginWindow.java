package unit04.firstGUI;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame {

    public LoginWindow() {

        setTitle("Login"); // name
        setSize(300, 200); // size
    setDefaultCloseOperation(EXIT_ON_CLOSE); // close the appilcation totally
    setLocationRelativeTo(null); // center the window
    setLayout(new BorderLayout()); // default is BorderLayout

    JButton button = new JButton("Login");
    JTextField tf_username = new JTextField();
    JPasswordField tf_password = new JPasswordField();

    JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));

    panel.add(new JLabel("Username"));
    panel.add(tf_username);
    panel.add(new JLabel("Password"));
    panel.add(tf_password);

    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    add(panel, BorderLayout.CENTER);
    add(button, BorderLayout.SOUTH);


    button.addActionListener(e -> System.out.println("Login"));



    }
}
