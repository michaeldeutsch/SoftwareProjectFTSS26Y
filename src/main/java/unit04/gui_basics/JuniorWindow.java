package unit04.gui_basics;

import javax.swing.*;

/**
 * A basic window for users with the Junior role.
 */
public class JuniorWindow extends JFrame {

    /**
     * Entry point for individual testing of this window.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        new JuniorWindow().setVisible(true);
    }
    
    public JuniorWindow() {
        setTitle("Junior-Stage");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Using DISPOSE_ON_CLOSE for secondary windows
        setLocationRelativeTo(null);
    }
}
