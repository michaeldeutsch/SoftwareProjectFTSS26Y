package unit03.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Advanced file reading example using BufferedReader and InputStream.
 * Demonstrates reading resources from the classpath using ClassLoader.
 */
public class BufferedDemo {

    public static void main(String[] args) throws IOException {

        // Get resource as stream from the classpath - ideal for JAR deployments
        InputStream is = BufferedDemo.class
                .getClassLoader()
                .getResourceAsStream("names.txt");

        // Wrap InputStream in InputStreamReader (with UTF-8) and then in BufferedReader for efficient reading
        BufferedReader br = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8)
        );

        String line;

        // Read line by line until end of file
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // Close the reader to free resources
        br.close();

    }
}
