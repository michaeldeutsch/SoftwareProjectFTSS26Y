package unit02.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static void main() throws FileNotFoundException {


        String path ="src/main/resources/names.txt";  // path + name + extension

        Scanner sc = new Scanner(new File(path));

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());

        }





    }
}
