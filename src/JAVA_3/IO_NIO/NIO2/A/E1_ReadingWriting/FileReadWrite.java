package JAVA_3.IO_NIO.NIO2.A.E1_ReadingWriting;

import java.io.IOException;
import java.nio.file.*;

public class FileReadWrite {

    public static void main(String[] args) {
        // Define the directory and file path
        Path directoryPath = Paths.get("NIO2_FileWriteRead");
        Path filePath = Paths.get("NIO2_FileWriteRead//file.txt");

        try {
            // Create the directory if it doesn't exist
            if (!Files.exists(directoryPath)) {
                Files.createDirectories(directoryPath);
                System.out.println("Directory created: " + directoryPath);
            }

            // Check if the file exists
            boolean fileExists = Files.exists(filePath);

            if (fileExists) {
                // Reading file content
                String content = new String(Files.readAllBytes(filePath));
                System.out.println("File content: " + content);
            } else {
                // Writing to a file
                String data = "Hello, JAVA_3.IO_NIO.NIO2! This is a new line of text.";
                Files.write(filePath, data.getBytes(), StandardOpenOption.CREATE);
                System.out.println("File created and data written.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
