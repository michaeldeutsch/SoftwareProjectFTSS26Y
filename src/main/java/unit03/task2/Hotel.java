package unit03.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hotel {

    int id;
    String category;
    String name;
    String owner;
    String contact;
    String address;
    String city;
    String cityCode;
    String state;
    int noRooms;
    int noBeds;

    public String toCSV() {
        return id+","+name+","+owner+","+contact+","+address+","+city;
    }
}
