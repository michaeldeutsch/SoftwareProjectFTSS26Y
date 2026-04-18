package unit05.gui_advanced;

import javax.swing.*;
import javax.swing.event.CaretListener;
import java.awt.*;

/**
 * Advanced Login GUI implementation.
 * Demonstrates:
 * - Basic Swing components and event handling (CaretListener, ActionListener).
 * - Real-time input validation.
 * - Basic security measures like login attempt tracking.
 * - Role-based window switching.
 */
public class Login extends JFrame {

    private static final int MAX_ATTEMPTS = 3;
    private static final int MIN_LENGTH = 5;
    private int attempts = 0;

    private final JTextField usernameField = new JTextField();
    private final JPasswordField passwordField = new JPasswordField();
    private final JButton loginButton = new JButton("Login");

    public Login() {
        // Base window configuration
        setTitle("Secure Login System");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Separate UI building from logic for better readability
        setupUI();
        
        // Setup event listeners
        setupListeners();
    }

    private void setupUI() {
        // Use padding for better aesthetics
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Use GridLayout for consistent label/field alignment
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        inputPanel.add(new JLabel("Username:"));
        inputPanel.add(usernameField);
        inputPanel.add(new JLabel("Password:"));
        inputPanel.add(passwordField);

        // Login button is disabled until valid input is entered
        loginButton.setEnabled(false);

        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(loginButton, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void setupListeners() {
        // Validation listener ensures that fields aren't empty/too short
        CaretListener validationListener = e -> validateInputs();

        usernameField.addCaretListener(validationListener);
        passwordField.addCaretListener(validationListener);

        loginButton.addActionListener(e -> handleLogin());
    }

    /**
     * Checks if inputs meet length requirements to enable the login button.
     */
    private void validateInputs() {
        boolean isValid = usernameField.getText().length() >= MIN_LENGTH 
                       && passwordField.getPassword().length >= MIN_LENGTH;
        loginButton.setEnabled(isValid);
    }

    /**
     * Processes the login attempt and handles security logic.
     */
    private void handleLogin() {
        attempts++;

        // Basic protection against brute force
        if (attempts > MAX_ATTEMPTS) {
            JOptionPane.showMessageDialog(this, "Too many attempts. System locking.", "Security Alert", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        String user = usernameField.getText();
        String pass = new String(passwordField.getPassword());

        if (user.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please enter a username", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Mock authentication: In a real app, check against a DB
        if (authenticate(user, pass)) {
            openDashboard(user);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean authenticate(String user, String pass) {
        // Simple mock validation for demo purposes
        return user.equals(pass) && (user.equals("junior") || user.equals("senior") || user.equals("admin"));
    }

    private void openDashboard(String role) {
        // Strategy approach: Open a specific window based on user role
        JFrame dashboard = switch (role) {
            case "junior" -> new JuniorWindow();
            case "senior" -> new SeniorWindow();
            case "admin" -> new AdminWindow();
            default -> null;
        };

        if (dashboard != null) {
            dashboard.setVisible(true);
            this.dispose(); // Close login window
        }
    }
}
