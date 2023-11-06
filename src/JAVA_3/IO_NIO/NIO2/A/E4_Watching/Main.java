package JAVA_3.IO_NIO.NIO2.A.E4_Watching;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a WatchService
            WatchService watchService = FileSystems.getDefault().newWatchService();

            // Registering a directory to be watched
            Path directory = Paths.get("NIO2_Example_Directory");
            directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

            System.out.println("Watching directory: " + directory);

            while (true) {
                WatchKey key = watchService.take(); // Blocking call, waits for events

                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    Path eventPath = (Path) event.context();

                    System.out.println("Event kind: " + kind + ", File affected: " + eventPath);
                }

                boolean valid = key.reset();
                if (!valid) {
                    System.out.println("WatchKey no longer valid, exiting watch loop.");
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
