package unit06.table;

import javax.swing.*;
import java.awt.*;

/**
 * EditHotel is a dialog that displays details of a selected hotel.
 * This class demonstrates data passing from a parent JFrame to a JDialog.
 */
public class EditHotel extends JDialog {

    /**
     * Constructs the EditHotel dialog.
     * @param owner The parent frame
     * @param data The data array representing the selected hotel row
     */
    public EditHotel(JFrame owner, Object[] data) {
        super(owner, "Edit Hotel: " + data[1], true); // Modal dialog
        
        defineDialog();
        initComponents(data);
    }

    private void defineDialog() {
        setSize(400, 300);
        setLocationRelativeTo(getOwner());
        setLayout(new GridLayout(0, 2, 10, 10)); // 2 columns, dynamic rows
    }

    /**
     * Initializes components and displays the passed data.
     * @param data The data to display
     */
    private void initComponents(Object[] data) {
        // Labels for the columns (matching BasicTableDemo's columns)
        String[] labels = {"ID:", "Name:", "Rating:", "Address:", "City:"};

        for (int i = 0; i < labels.length; i++) {
            add(new JLabel("  " + labels[i]));
            
            String value = (data != null && i < data.length) ? data[i].toString() : "N/A";
            JTextField textField = new JTextField(value);
            textField.setEditable(false); // For now, just viewing
            add(textField);
        }

        // Close button
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> dispose());
        add(new JLabel("")); // Spacer
        add(closeButton);
    }
}
