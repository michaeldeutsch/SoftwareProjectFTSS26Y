package unit03.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utility class for loading hotel data from files.
 * Demonstrates parsing CSV-like data into Java objects.
 */
public class HotelUtility {

    /**
     * Loads hotels from the local file system using a hardcoded path.
     * @return List of parsed Hotel objects
     * @throws FileNotFoundException if the file is not found
     */
    public static ArrayList<Hotel> loadHotelsFromFile() throws FileNotFoundException {
        ArrayList<Hotel> ALL_HOTELS = new ArrayList<Hotel>();
        String path = "src/main/resources/hotels.txt";

        Scanner sc = new Scanner(new File(path));
        // Skip header line
        sc.nextLine();

        while(sc.hasNextLine()) {

            String [] parts =  sc.nextLine().split(",");
            // Map CSV columns to Hotel object properties, removing quotes for cleanup
            int id = Integer.parseInt(parts[0]);
            String category = parts[1].replaceAll("\"","");
            String name = parts[2].replaceAll("\"","");
            String owner =  parts[3].replaceAll("\"","");
            String contact =  parts[4].replaceAll("\"","");
            String address = parts[5].replaceAll("\"","");
            String city = parts[6].replaceAll("\"","");
            String cityCode = parts[7].replaceAll("\"","");
            String state = parts[8].replaceAll("\"","");
            int noRooms = Integer.parseInt(parts[9].replaceAll("\"",""));
            int noBeds = Integer.parseInt(parts[10].replaceAll("\"",""));

            Hotel temp = new Hotel(id,category,name,owner,contact,address,city,cityCode,state,noRooms,noBeds);
            ALL_HOTELS.add(temp);
        }
        return ALL_HOTELS;
    }

    /**
     * Loads hotels from the classpath, which is more robust for deployed applications.
     * @return List of parsed Hotel objects
     * @throws FileNotFoundException if the resource is missing
     */
    public static ArrayList<Hotel> optimizedLoadHotelsFromFile() throws FileNotFoundException {
        ArrayList<Hotel> ALL_HOTELS = new ArrayList<Hotel>();
        InputStream is = HotelUtility.class
                .getClassLoader()
                .getResourceAsStream("hotels.txt");


        Scanner sc = new Scanner(is, StandardCharsets.UTF_8);
        sc.nextLine();

        while(sc.hasNextLine()) {

            String [] parts =  sc.nextLine().split(",");
            int id = Integer.parseInt(parts[0]);
            String category = parts[1].replaceAll("\"","");
            String name = parts[2].replaceAll("\"","");
            String owner =  parts[3].replaceAll("\"","");
            String contact =  parts[4].replaceAll("\"","");
            String address = parts[5].replaceAll("\"","");
            String city = parts[6].replaceAll("\"","");
            String cityCode = parts[7].replaceAll("\"","");
            String state = parts[8].replaceAll("\"","");
            int noRooms = Integer.parseInt(parts[9].replaceAll("\"",""));
            int noBeds = Integer.parseInt(parts[10].replaceAll("\"",""));

            Hotel temp = new Hotel(id,category,name,owner,contact,address,city,cityCode,state,noRooms,noBeds);
            ALL_HOTELS.add(temp);
        }
        return ALL_HOTELS;
    }

}
