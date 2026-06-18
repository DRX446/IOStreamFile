package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Latihan5 {
    public static void main(String[] args) {
        // The true parameter means append, not overwrite
        try (PrintWriter writer = new PrintWriter(new FileWriter("mahasiswa.txt", true)))
        {
            writer.println("Dewi");
            writer.println("Eka");
            System.out.println("Two new names added without deleting old data.");
        } catch (IOException e) {
            System.out.println("Failed to append data: " + e.getMessage());
        }
    }
}