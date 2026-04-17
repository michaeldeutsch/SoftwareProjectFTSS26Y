package unit03.write;


import unit03.task2.Hotel;
import unit03.task2.HotelUtility;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

/**
 * Demonstrates the process of writing data to a file.
 * Includes creating a backup of hotel data and opening the file using the desktop's default application.
 */
public class SimpleWritingProcess {

    public static void main(String[] args) throws IOException {
        // Load data to be written
        ArrayList<Hotel> hotels = HotelUtility.loadHotelsFromFile();
        writeBackup(hotels);
    }

    /**
     * Writes the given list of hotels to a backup file.
     * @param hotels the data to back up
     * @throws IOException if writing fails
     */
    private static void writeBackup(ArrayList<Hotel> hotels) throws IOException {
        String adress = "output/backup.txt";
        Path path = Path.of(adress);

        // Convert objects back to CSV strings for storage
        ArrayList<String> SOME_DATA = new ArrayList<>();
        for (Hotel hotel : hotels) {
            SOME_DATA.add(hotel.toCSV());
        }

        boolean append = false;

        // Efficiently write all lines to the file with specified options
        Files.write(path, SOME_DATA, StandardCharsets.UTF_8, 
                    append ? StandardOpenOption.APPEND : StandardOpenOption.TRUNCATE_EXISTING, 
                    StandardOpenOption.CREATE);

        JOptionPane.showMessageDialog(null, "file was written successfully");

        // Interaction with the user to open the file immediately
        int answer = JOptionPane.showConfirmDialog(null, "You wanna see the content?");
        boolean allowedToOpen = Desktop.isDesktopSupported();
        System.out.println("you answered: " + answer + " and you can open the file? " + allowedToOpen + "!");

        // Use Desktop API to open the file if supported and requested
        if (answer == 0 && Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(path.toFile());
        }
    }
}
