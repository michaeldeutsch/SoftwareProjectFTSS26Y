package unit03.task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HotelEtlMain {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Hotel> ALL_HOTELS = HotelUtility.loadHotelsFromFile();
        ALL_HOTELS.forEach(System.out::println);
    }


}
