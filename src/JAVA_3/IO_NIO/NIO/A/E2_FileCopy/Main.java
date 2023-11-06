package JAVA_3.IO_NIO.NIO.A.E2_FileCopy;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

    public static void main(String[] args) {
        Path sourcePath = Paths.get("NIO_E2_source.txt");
        Path targetPath = Paths.get("NIO_E2_target.txt");

        // Create the source file if it doesn't exist
        try {
            if (!Files.exists(sourcePath)) {
                String initialContent = "This is the initial content of the source file.";
                Files.write(sourcePath, initialContent.getBytes(), StandardOpenOption.CREATE);
                System.out.println("Source file created.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            return;
        }

        try (FileChannel sourceChannel = FileChannel.open(sourcePath, StandardOpenOption.READ);
             FileChannel targetChannel = FileChannel.open(targetPath, StandardOpenOption.CREATE,
                     StandardOpenOption.WRITE)) {

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead;

            while ((bytesRead = sourceChannel.read(buffer)) != -1) {
                buffer.flip(); // Switch to read mode
                targetChannel.write(buffer);
                buffer.clear(); // Clear the buffer for the next read
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

