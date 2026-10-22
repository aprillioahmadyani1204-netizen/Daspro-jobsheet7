import java.util.Scanner;

public class KafeDoWhile        {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        int totalHarga; // Tambahan: Deklarasi variabel totalHarga

        // Tambahan: Kata kunci 'do' untuk memulai perulangan
        do {
            System.out.print("\nMasukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            // Sekarang break sudah benar karena berada di dalam perulangan do-while
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break; 
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            
            // Membersihkan sisa baris baru (newline) setelah nextInt()
            sc.nextLine(); 

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            
        } while (true);

        System.out.println("\nSemua transaksi selesai.");
    }
}
