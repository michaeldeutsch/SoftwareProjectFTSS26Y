package unit05.gui_advanced;

import javax.swing.*;

/**
 * A specialized window accessible by users with the Junior role.
 * Represents a role-based dashboard view.
 */
public class JuniorWindow extends JFrame {

    public JuniorWindow(){
        super("Junior Window");
        setSize(300,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Close only this window
    }
}
