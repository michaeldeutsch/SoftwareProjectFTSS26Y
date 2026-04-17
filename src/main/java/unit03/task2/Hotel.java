package unit03.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Data model representing a Hotel entity.
 * Uses Lombok to generate getters, setters, and constructors.
 */
@Data
@AllArgsConstructor
public class Hotel {

    private int id;
    private String category;
    private String name;
    private String owner;
    private String contact;
    private String address;
    private String city;
    private String cityCode;
    private String state;
    private int noRooms;
    private int noBeds;

    /**
     * Converts the Hotel object into a Comma Separated Values (CSV) format.
     * @return CSV string representation of the hotel
     */
    public String toCSV() {
        return id + "," + name + "," + owner + "," + contact + "," + address + "," + city;
    }
}
