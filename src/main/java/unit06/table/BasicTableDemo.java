package unit06.table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * BasicTableDemo demonstrates how to create a JTable, fill it with data,
 * and handle double-click events to open a detail view (EditHotel).
 */
public class BasicTableDemo extends JFrame {
    private JTable table;
    private DefaultTableModel model;

    public BasicTableDemo() {
        defineFrame();
        initComponents();
        addActions();
        fillTable();
        addComponents();
    }

    /**
     * Configures the main frame settings.
     */
    private void defineFrame() {
        setSize(600, 400);
        setTitle("Unit 06 - JTable & Interaction Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen
    }

    /**
     * Initializes the table and its data model.
     */
    private void initComponents() {
        model = new DefaultTableModel();
        table = new JTable(model);
        // Prevent direct editing in the table cells
        table.setDefaultEditor(Object.class, null);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * Adds event listeners to the table.
     */
    private void addActions() {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Check for double click
                if (e.getClickCount() == 2) {
                    int row = table.getSelectedRow();
                    if (row >= 0) {
                        // Convert view row index to model index (important if sorted/filtered)
                        int modelRow = table.convertRowIndexToModel(row);
                        
                        // Extract data from the selected row
                        int columnCount = model.getColumnCount();
                        Object[] rowData = new Object[columnCount];
                        for (int i = 0; i < columnCount; i++) {
                            rowData[i] = model.getValueAt(modelRow, i);
                        }

                        // Open the Edit window with the selected data
                        new EditHotel(BasicTableDemo.this, rowData).setVisible(true);
                    }
                }
            }
        });
    }

    /**
     * Populates the table with initial columns and sample data.
     */
    private void fillTable() {
        // Define columns
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Rating");
        model.addColumn("Address");
        model.addColumn("City");

        // Add sample rows
        model.addRow(new Object[]{"H001", "Grand Hotel", "5 Stars", "Ringstraße 1", "Vienna"});
        model.addRow(new Object[]{"H002", "Alpine Resort", "4 Stars", "Mountain Way 5", "Innsbruck"});
        model.addRow(new Object[]{"H003", "City Lodge", "3 Stars", "Central Square 10", "Salzburg"});
    }

    /**
     * Adds components to the frame's layout.
     */
    private void addComponents() {
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }
}
