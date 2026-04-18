package unit05.gui_advanced;

import javax.swing.*;

/**
 * A specialized window accessible only by users with the Admin role.
 * Represents a role-based dashboard view.
 */
public class AdminWindow extends JFrame {

    public AdminWindow(){
        super("Admin Window");
        setSize(300,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Close only this window
    }
}
