package unit06;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class BasicTableDemo extends JFrame {
    JTable table;
    DefaultTableModel model;

   BasicTableDemo(){

       //

        defineFrame(); // define the frame
        initComponents(); // initialize the components
        fillTable(); // fill the table
        
        addComponents(); // add the components to the frame

    }

    private void initComponents() {
         model = new DefaultTableModel();
        table = new JTable();
        table.setModel(model);
    }

    private void defineFrame() {
        setSize(500, 500);
        setTitle("Table Demo Recap");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void addComponents() {
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);
    }

    private  void fillTable() {
        model.addColumn("ID");
        model.addColumn("NAME");
        model.addColumn("AGE");
        model.addColumn("ADDRESS");
        model.addColumn("CITY");

        String[] first = new String[]{"1", "Michael", "33", "Street 1", "Vienna", "AT"};
        String[] second = {"1", "Michael", "33", "Street 1", "Vienna", "AT"};
        Object [] third = {"1", "Michael", 1d, 1, "Vienna", true};
        model.addRow(first);
        model.addRow(second);
        model.addRow(third);
    }
}
