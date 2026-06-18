package bagian3.kontak;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// 1. Membuat class Siswa
class Siswa {
    private String nama;
    private int usia;

    public Siswa(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    // Method mengembalikan string "Nama - Usia"
    public String info() {
        return nama + " - " + usia;
    }

    // Method tambahan untuk format penulisan ke file (Nama,Usia)
    public String keFormatFile() {
        return nama + "," + usia;
    }
}

// 2. Class utama (Diubah menjadi LatihanMandiri)
public class LatihanMandiri {
    public static void main(String[] args) {
        // a. Membuat ArrayList untuk menyimpan objek Siswa
        ArrayList<Siswa> daftarSiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistem Pendaftaran Siswa ===");

        // b. Meminta user untuk memasukkan data sebanyak 3 kali
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nData Siswa ke-" + i);
            System.out.print("Masukkan nama : ");
            String nama = scanner.nextLine();
            
            System.out.print("Masukkan usia : ");
            int usia = scanner.nextInt();
            scanner.nextLine(); // Membersihkan sisa newline (enter) di buffer

            // Menambahkan objek Siswa baru ke dalam ArrayList
            daftarSiswa.add(new Siswa(nama, usia));
        }

        // c. Menyimpan data tersebut ke dalam file teks
        try (PrintWriter penulis = new PrintWriter(new FileWriter("pendaftaran.txt"))) {
            for (Siswa siswa : daftarSiswa) {
                penulis.println(siswa.keFormatFile());
            }
            // d. Menampilkan pesan berhasil jika sudah selesai
            System.out.println("\nData pendaftaran berhasil disimpan!");
        } catch (IOException e) {
            System.out.println("\nTerjadi kesalahan saat menyimpan data: " + e.getMessage());
        }

        scanner.close();
    }
}