package IO_NIO.IO.A.E5_BufferedReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String outputInputFile = "IO_outputInput.txt";

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(outputInputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputInputFile))) {
            writer.write("Hello, this is a line of text written to the file.\n");
            writer.write("Another line of text.\n");
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
