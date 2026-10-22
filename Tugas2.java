import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        // Inisialisasi scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel sesuai dengan flowchart
        int jenis;
        int durasi;
        int total = 0;
        
        // Perulangan do-while karena pengecekan kondisi dilakukan di akhir (while jenis != 0)
        do {
            System.out.print("Masukkan jenis kendaraan (1: mobil, 2: motor, 0: keluar): ");
            jenis = input.nextInt(); // input jenis
            
            // Cek apakah jenis kendaraan valid (1 atau 2)
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt(); // input durasi
                
                // Hitung biaya berdasarkan jenis kendaraan
                if (jenis == 1) {
                    total += durasi * 3000; // Tarif mobil Rp 3.000/jam
                } else {
                    total += durasi * 2000; // Tarif motor Rp 2.000/jam
                }
            }
            
        } while (jenis != 0); // Perulangan berlanjut selama jenis bukan 0
        
        // Menampilkan total pembayaran setelah keluar dari loop
        System.out.println("Total pembayaran parkir: Rp " + total);
        
        input.close();
    }
}

