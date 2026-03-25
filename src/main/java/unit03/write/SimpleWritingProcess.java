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

public class SimpleWritingProcess {

    static void main() throws IOException {


        ArrayList<Hotel> hotels = HotelUtility.loadHotelsFromFile();

        writeBackup(hotels);




    }

    private static void writeBackup(ArrayList<Hotel> hotels) throws IOException {
        String adress = "output/backup.txt";
        Path path = Path.of(adress);


        ArrayList<String> SOME_DATA = new ArrayList<>();

        for (Hotel hotel : hotels) {
            SOME_DATA.add(hotel.toCSV());
        }


        boolean append = false;

        Files.write(path,SOME_DATA,StandardCharsets.UTF_8, append ?  StandardOpenOption.APPEND : StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE);

        JOptionPane.showMessageDialog(null, "file was written successfully");

       int answer =  JOptionPane.showConfirmDialog(null,"You wanna see the content?");
       boolean allowedToOpen = Desktop.isDesktopSupported();
        System.out.println("you answered: " + answer + " and you can open the file? " + allowedToOpen + "!");

        if(answer == 0 && Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(path.toFile());
        }
    }
}
