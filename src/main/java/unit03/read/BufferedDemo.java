package unit03.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class BufferedDemo {

    public static void main(String[] args) throws IOException {


        InputStream is = BufferedDemo.class
                .getClassLoader()
                .getResourceAsStream("names.txt");

        BufferedReader br = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8)
        );

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();



    }
}
