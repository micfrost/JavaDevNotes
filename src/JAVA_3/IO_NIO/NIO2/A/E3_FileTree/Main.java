package JAVA_3.IO_NIO.NIO2.A.E3_FileTree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


public class Main {

//    Create a directory and a subdirectory.
//    Create a text file in the subdirectory.
//    Walk the file tree and print the names of visited files.
//    Delete the directory and its contents.

    public static void main(String[] args) {
        // Define a directory path
        Path directoryPath = Paths.get("NIO2_Example_Directory");

        try {
            // Create a directory if it doesn't exist
            if (!Files.exists(directoryPath)) {
                Files.createDirectory(directoryPath);
                System.out.println("Directory created: " + directoryPath.toAbsolutePath());
            }

            // Create a subdirectory
            Path subdirectoryPath = directoryPath.resolve("Subdirectory");
            Files.createDirectories(subdirectoryPath);
            System.out.println("Subdirectory created: " + subdirectoryPath.toAbsolutePath());

            // Create a text file in the subdirectory
            Path filePath = subdirectoryPath.resolve("example.txt");
            String content = "This is an example of Java JAVA_3.IO_NIO.NIO2.";
            Files.write(filePath, content.getBytes(), StandardOpenOption.CREATE);
            System.out.println("File created: " + filePath.toAbsolutePath());

            // Walk the file tree and print file names
            Files.walkFileTree(directoryPath, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    System.out.println("Visited file: " + file.getFileName());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    System.err.println("Failed to visit file: " + file.getFileName());
                    return FileVisitResult.CONTINUE;
                }
            });

            // Delete the directory and its contents

//            Files.walkFileTree(directoryPath, new SimpleFileVisitor<Path>() {
//                @Override
//                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                    Files.delete(file);
//                    System.out.println("Deleted file: " + file.getFileName());
//                    return FileVisitResult.CONTINUE;
//                }
//
//                @Override
//                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
//                    System.err.println("Failed to delete file: " + file.getFileName());
//                    return FileVisitResult.CONTINUE;
//                }
//
//                @Override
//                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
//                    Files.delete(dir);
//                    System.out.println("Deleted directory: " + dir.getFileName());
//                    return FileVisitResult.CONTINUE;
//                }
//            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
