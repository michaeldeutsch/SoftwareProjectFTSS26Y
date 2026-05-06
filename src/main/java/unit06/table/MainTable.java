package unit06.table;

/**
 * Main entry point for Unit 06.
 * This unit demonstrates advanced JTable usage, including mouse listeners
 * and passing data between different GUI components (JFrame to JDialog).
 */
public class MainTable {

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread for thread safety
        javax.swing.SwingUtilities.invokeLater(() -> {
            new BasicTableDemo().setVisible(true);
        });
    }
}
