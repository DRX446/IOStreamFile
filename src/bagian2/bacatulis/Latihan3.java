package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Latihan3 {
    public static void main(String[] args) {
        // try-with-resources: stream is automatically closed after the block finishes
        try (PrintWriter writer = new PrintWriter(new FileWriter("mahasiswa.txt"))) {
            writer.println("Andi");
            writer.println("Budi");
            writer.println("Citra");
            System.out.println("Data successfully written to mahasiswa.txt");
        } catch (IOException e) {
            System.out.println("Failed to write: " + e.getMessage());
        }
    }
}