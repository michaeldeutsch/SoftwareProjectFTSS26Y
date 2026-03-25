package unit04;

import java.util.HashMap;
import java.util.Map;

public class MapExample {


    static void main() {

        Map<String, String> dict = new HashMap<>();
        //

        dict.put("DE","Deutschland");
        dict.put("EN","England");
        dict.put("FR","Frankreich");
        dict.put("IT","Italien");
        dict.put("ES","Spanien");

        String translation = dict.get("DE");
        System.out.println(translation);


        dict.forEach((k,v) -> System.out.println(k + " -> " + v));


    }
}
