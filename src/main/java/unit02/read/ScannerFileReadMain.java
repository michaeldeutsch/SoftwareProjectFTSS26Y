package unit02.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Basic file reading example using the Scanner class.
 */
public class ScannerFileReadMain {

    /**
     * Entry point to demonstrate reading a text file line by line.
     * @param args command line arguments
     * @throws FileNotFoundException if the specified file path is incorrect
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Define path to the names resource file
        String path = "src/main/resources/names.txt";
        
        // Initialize Scanner with the file
        Scanner sc = new Scanner(new File(path));
        
        // Iterate through each line of the file and print it to the console
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
