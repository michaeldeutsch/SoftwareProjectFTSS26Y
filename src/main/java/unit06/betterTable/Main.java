package unit06.betterTable;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new MainFrame().setVisible(true)
        );
    }
}
