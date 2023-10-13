package IO.A.FileInputStream;

import java.io.*;

    public class FileInputStream {

        public static void main(String[] args) {
            String filePath = "IO_FileInputStream.txt";
            String contentToWrite = "Hello, world!";

            try {
                // Writing to a file using FileOutputStream
                FileOutputStream outputStream = new FileOutputStream(filePath);
                outputStream.write(contentToWrite.getBytes());
                outputStream.close();
                System.out.println("Content written to file.");

                // Reading from a file using FileInputStream
                java.io.FileInputStream inputStream = new java.io.FileInputStream(filePath);
                int character;
                while ((character = inputStream.read()) != -1) {
                    System.out.print((char) character);
                }
                inputStream.close();
            } catch (IOException e) {
                System.out.println("Messege: " +e);            }
        }
    }

