package unit05.gui_advanced;

import javax.swing.*;

/**
 * A specialized window accessible by users with the Senior role.
 * Represents a role-based dashboard view.
 */
public class SeniorWindow extends JFrame {

    public SeniorWindow(){
        super("Senior Window");
        setSize(300,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Close only this window
    }
}
