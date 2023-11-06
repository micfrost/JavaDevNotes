package JAVA_3.IO_NIO.NIO2.A.E2_CopyFile;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        // Define a directory path and a file name
        Path directoryPath = Paths.get("NIO2_Directory");
        Path filePath = directoryPath.resolve("NIO2_File.txt");

        try {
            // Create a directory if it doesn't exist
            if (!Files.exists(directoryPath)) {
                Files.createDirectory(directoryPath);
            }

            // Create a text file in the directory
            String content = "This is an example of Java JAVA_3.IO_NIO.NIO2.";
            Files.write(filePath, content.getBytes(), StandardOpenOption.CREATE);

            System.out.println("File created at: " + filePath.toAbsolutePath());

            // Copy the file to the same directory
            Path copyPath = directoryPath.resolve("copied_NIO2_File.txt");
            Files.copy(filePath, copyPath, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("File copied to: " + copyPath.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
