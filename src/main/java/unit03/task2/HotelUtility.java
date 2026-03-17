package unit03.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelUtility {

    static void main() throws FileNotFoundException {
        // online for internal testing purposes - delete (main) in production
        optimizedLoadHotelsFromFile().forEach(System.out::println);

    }


    public static ArrayList<Hotel> loadHotelsFromFile() throws FileNotFoundException {
        ArrayList<Hotel> ALL_HOTELS = new ArrayList<Hotel>();
        String path = "src/main/resources/hotels.txt";

        Scanner sc = new Scanner(new File(path));
        sc.nextLine();

        while(sc.hasNextLine()) {

            String [] parts =  sc.nextLine().split(",");
            //System.out.println(Arrays.toString(parts));
            // id,category,name,owner,contact,address,city,cityCode,phone,noRooms,noBeds

            //System.out.println(parts[2].replaceAll("\"",""));

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


            // id,category,name,owner,contact,address,city,cityCode,phone,noRooms,noBeds

            Hotel temp = new Hotel(id,category,name,owner,contact,address,city,cityCode,state,noRooms,noBeds);
            ALL_HOTELS.add(temp);
        }
        return ALL_HOTELS;
    }


    public static ArrayList<Hotel> optimizedLoadHotelsFromFile() throws FileNotFoundException {
        ArrayList<Hotel> ALL_HOTELS = new ArrayList<Hotel>();
        InputStream is = HotelUtility.class
                .getClassLoader()
                .getResourceAsStream("hotels.txt");


        Scanner sc = new Scanner(is, StandardCharsets.UTF_8);
        sc.nextLine();

        while(sc.hasNextLine()) {

            String [] parts =  sc.nextLine().split(",");
            //System.out.println(Arrays.toString(parts));
            // id,category,name,owner,contact,address,city,cityCode,phone,noRooms,noBeds

            //System.out.println(parts[2].replaceAll("\"",""));

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


            // id,category,name,owner,contact,address,city,cityCode,phone,noRooms,noBeds

            Hotel temp = new Hotel(id,category,name,owner,contact,address,city,cityCode,state,noRooms,noBeds);
            ALL_HOTELS.add(temp);
        }
        return ALL_HOTELS;
    }

}
