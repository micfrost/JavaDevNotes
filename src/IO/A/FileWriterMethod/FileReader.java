package IO.A.FileWriterMethod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileReader {

    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + File.separator +  "IO_FileWriter.txt";
        String contentToWrite = "Hello, world!";

        try {
            // Writing to a file
            FileWriter writer = new FileWriter(filePath);
            writer.write(contentToWrite);
            writer.close();
            System.out.println("Content written to file.");

            // Reading from a file
            java.io.FileReader reader = new java.io.FileReader(filePath);
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Messege: " +e);
        }
    }
}



