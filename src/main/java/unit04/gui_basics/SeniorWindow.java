package unit04.gui_basics;

import javax.swing.*;

/**
 * A basic window for users with the Senior role.
 */
public class SeniorWindow extends JFrame {

    /**
     * Entry point for individual testing of this window.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        new SeniorWindow().setVisible(true);
    }
    
    public SeniorWindow() {
        setTitle("Senior-UserRole");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Using DISPOSE_ON_CLOSE for secondary windows
        setLocationRelativeTo(null);
    }
}
