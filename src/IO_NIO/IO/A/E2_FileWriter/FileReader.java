package IO_NIO.IO.A.E2_FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileReader {

    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + File.separator +  "IO_FileWriter.txt";
        String contentToWrite = "Hello, world!";

        try {
            // Writing to a file
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(contentToWrite);
            fileWriter.close();
            System.out.println("Content written to file.");

            // Reading from a file
            java.io.FileReader fileReader = new java.io.FileReader(filePath);
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Messege: " +e);
        }
    }
}



