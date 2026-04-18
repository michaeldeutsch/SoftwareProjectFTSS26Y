package unit04.gui_basics;

import javax.swing.*;
import java.awt.*;

/**
 * A basic Login Window implementation using Java Swing.
 * Demonstrates layout managers (BorderLayout, GridLayout) and basic event handling.
 */
public class LoginWindow extends JFrame {

    public LoginWindow() {

        setTitle("Login"); 
        setSize(300, 200); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Ensures the process ends when the window is closed
        setLocationRelativeTo(null); // Centers the window on the screen
        setLayout(new BorderLayout()); // Using BorderLayout for structured component placement

        JButton button = new JButton("Login");
        button.setEnabled(true);

        JTextField tf_username = new JTextField();
        JPasswordField tf_password = new JPasswordField();

        // Panel for input fields using GridLayout for alignment
        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));

        panel.add(new JLabel("Username"));
        panel.add(tf_username);
        panel.add(new JLabel("Password"));
        panel.add(tf_password);

        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(panel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        // Basic listener for text field changes
        tf_username.addCaretListener(e -> {
            System.out.println("you moved in the textfield");
        });

        // Action listener for the login button
        button.addActionListener(e -> {
            String username = tf_username.getText();

            // Simple validation check
            if (username.isBlank()) {
                JOptionPane.showMessageDialog(this, "Please enter a username");
                return;
            }

            tf_username.setText("");

            // Transition to dashboard windows upon successful "login"
            new JuniorWindow().setVisible(true);
            new SeniorWindow().setVisible(true);
            dispose(); // Close the login window

        });

    }
}
