package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri {
    public static void main(String[] args) {
        String namaBerkas = "hari.txt";

        // --- Tugas 1: Tulis 5 hari dan baca kembali ---
        System.out.println("--- Tugas 1: Tulis dan Baca ---");
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {
            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jumat");
        } catch (IOException e) {
            System.out.println("Kesalahan menulis: " + e.getMessage());
        }
        bacaDanTampilkan(namaBerkas);

        // --- Tugas 2: Tambahkan 2 hari tanpa menimpa ---
        System.out.println("\n--- Tugas 2: Tambah dan Baca Semua ---");
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas, true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
        } catch (IOException e) {
            System.out.println("Kesalahan menambah: " + e.getMessage());
        }
        bacaDanTampilkan(namaBerkas);

        // --- Tugas 3: Hitung total baris dalam berkas ---
        System.out.println("\n--- Tugas 3: Hitung Baris ---");
        int jumlahBaris = 0;
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Total baris di dalam " + namaBerkas + ": " + jumlahBaris);
        } catch (IOException e) {
            System.out.println("Kesalahan membaca: " + e.getMessage());
        }
    }

    // Method bantuan untuk membaca dan menampilkan isi berkas
    private static void bacaDanTampilkan(String namaBerkas) {
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Kesalahan membaca: " + e.getMessage());
        }
    }
}