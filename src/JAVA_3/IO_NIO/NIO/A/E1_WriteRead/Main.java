package JAVA_3.IO_NIO.NIO.A.E1_WriteRead;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("NIO_E1_example.txt");

            // Create the file and write initial content if it doesn't exist
            if (!Files.exists(filePath)) {
                String initialContent = "This is the initial content of the file.";
                Files.write(filePath, initialContent.getBytes(), StandardOpenOption.CREATE);
                System.out.println("File created with initial content.");
            }

            RandomAccessFile randomAccessFile = new RandomAccessFile(filePath.toFile(), "r");
            FileChannel fileChannel = randomAccessFile.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

            int bytesRead = fileChannel.read(byteBuffer);
            while (bytesRead != -1) {
                byteBuffer.flip(); // Flip the buffer for reading
                while (byteBuffer.hasRemaining()) {
                    System.out.print((char) byteBuffer.get());
                }
                byteBuffer.clear(); // Clear the buffer for next read
                bytesRead = fileChannel.read(byteBuffer);
            }

            fileChannel.close();
            randomAccessFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
