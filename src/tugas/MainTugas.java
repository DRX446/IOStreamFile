package tugas;

// NAMA : Darmawan
// NPM  : 2410010554

public class MainTugas {
    public static void main(String[] args) {

        String[] kategori = {
            "Elektronik",
            "Makanan",
            "Minuman"
        };

        System.out.println("=== DAFTAR KATEGORI ===");
        for (String k : kategori) {
            System.out.println("- " + k);
        }

        Gudang gudang = new Gudang();

        gudang.tambahBarang(new Barang("Laptop", 7500000, 5));
        gudang.tambahBarang(new Barang("Mouse", 150000, 10));
        gudang.tambahBarang(new Barang("Keyboard", 250000, 8));
        gudang.tambahBarang(new Barang("Monitor", 1800000, 4));
        gudang.tambahBarang(new Barang("Printer", 1200000, 3));

        System.out.println("\n=== DATA BARANG ===");
        gudang.tampilkanSemua();

        gudang.simpanKeBerkas("barang.txt");

        Gudang gudangBaru = new Gudang();
        gudangBaru.muatDariBerkas("barang.txt");

        System.out.println("\n=== DATA DARI BERKAS ===");
        gudangBaru.tampilkanSemua();

        System.out.println("Total Nilai Persediaan = Rp" +
                gudangBaru.totalNilai());
    }
}