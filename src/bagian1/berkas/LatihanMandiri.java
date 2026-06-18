package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri {
    public static void main(String[] args) {
        
        // Task 1: Check if laporan.txt exists and print its size
        System.out.println("--- Task 1 ---");
        File file1 = new File("laporan.txt");
        System.out.println("Exists: " + file1.exists());
        if (file1.exists()) {
            System.out.println("Size (bytes): " + file1.length());
        }

        // Task 2: Create a folder named "arsip" using mkdir()
        System.out.println("\n--- Task 2 ---");
        File folder = new File("arsip");
        boolean isCreated = folder.mkdir();
        if (isCreated) {
            System.out.println("Success creating directory.");
        } else {
            System.out.println("Failed to create directory (or it already exists).");
        }

        // Task 3: Create sementara.txt, delete it, and check status before/after
        System.out.println("\n--- Task 3 ---");
        File file3 = new File("sementara.txt");
        try {
            // Create the file
            file3.createNewFile();
            System.out.println("Status before delete: " + file3.exists());
            
            // Delete the file
            file3.delete();
            System.out.println("Status after delete: " + file3.exists());
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
