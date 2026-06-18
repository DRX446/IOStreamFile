package bagian2.bacatulis;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Latihan4 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("mahasiswa.txt"))){
            String line;
            int number = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(number + ". " + line);
                number++;
            }
        } catch (IOException e) {
            System.out.println("Failed to read: " + e.getMessage());
        }
    }
}