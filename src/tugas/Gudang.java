package tugas;

import java.util.ArrayList;
import java.io.*;

public class Gudang {
    private ArrayList<Barang> daftarBarang;

    public Gudang() {
        daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilkanSemua() {
        for (Barang barang : daftarBarang) {
            barang.info();
        }
    }

    public void simpanKeBerkas(String namaFile) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(namaFile))) {
            for (Barang barang : daftarBarang) {
                pw.println(barang.keBaris());
            }
            System.out.println("Data berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void muatDariBerkas(String namaFile) {
        daftarBarang.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String baris;

            while ((baris = br.readLine()) != null) {
                String[] data = baris.split(";");

                String nama = data[0];
                double harga = Double.parseDouble(data[1]);
                int stok = Integer.parseInt(data[2]);

                daftarBarang.add(new Barang(nama, harga, stok));
            }

            System.out.println("Data berhasil dimuat.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double totalNilai() {
        double total = 0;

        for (Barang barang : daftarBarang) {
            total += barang.getHarga() * barang.getStok();
        }

        return total;
    }
}