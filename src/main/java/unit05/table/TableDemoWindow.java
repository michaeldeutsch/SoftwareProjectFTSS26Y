package unit05.table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Example demonstrating the usage of JTable and DefaultTableModel in Swing.
 * Shows how to define columns, add rows, and use JScrollPane for table navigation.
 */
public class TableDemoWindow extends JFrame {

    public TableDemoWindow() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize JTable and its underlying data model
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        table.setModel(model);

        // Wrapping the table in a scroll pane is necessary for viewing large data and showing column headers
        JScrollPane scrollPane = new JScrollPane(table);

        // Define table columns
        model.addColumn("ID");
        model.addColumn("NAME");
        model.addColumn("AGE");
        model.addColumn("ADDRESS");
        model.addColumn("CITY");
        model.addColumn("STATE");

        // Add sample data rows to the model
        model.addRow(new String[]{"ID", "NAME", "AGE", "ADDRESS", "CITY", "STATE"});
        model.addRow(new String[]{"1", "Michael", "33", "Street 1", "Vienna", "AT"});
        
        // Add scroll pane containing the table to the frame's center
        add(scrollPane, BorderLayout.CENTER);
    }

}
