import java.util.Scanner;

public class Tugas1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel awal
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        int totalPendapatan = 0;
        
        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");
        
        // Loop untuk transaksi harian
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            int jumlah = input.nextInt();
            
            // Program berhenti jika diinput angka 0
            if (jumlah == 0) {
                break;
            }
            
            // Hitung harga sebelum diskon
            int hargaKotor = jumlah * hargaTiket;
            double persenDiskon = 0;
            
            // Cek ketentuan diskon sesuai soal
            if (jumlah > 10) {
                persenDiskon = 0.15; // Diskon 15%
            } else if (jumlah > 4) {
                persenDiskon = 0.10; // Diskon 10%
            }
            
            // Hitung potongan dan total yang harus dibayar
            double potongan = hargaKotor * persenDiskon;
            double totalBayar = hargaKotor - potongan;
            
            System.out.println("Total bayar pelanggan: Rp " + totalBayar);
            System.out.println("----------------------------------------");
            
            // Akumulasi total harian
            totalTiketTerjual = totalTiketTerjual + jumlah;
            totalPendapatan = totalPendapatan + (int) totalBayar;
        }
        
        // Cetak hasil akhir setelah keluar dari loop
        System.out.println("\n=== REKAPITULASI PENJUALAN HARIAN ===");
        System.out.println("Total Tiket Terjual : " + totalTiketTerjual + " tiket");
        System.out.println("Total Pendapatan    : Rp " + totalPendapatan);
    }
}
