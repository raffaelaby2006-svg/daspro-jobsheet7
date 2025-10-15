import java.util.Scanner;
public class TugasBioskop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;
        final double HARGA_TIKET = 50000;
        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk berhenti): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == 0) {
                System.out.println("Input selesai.\n");
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan kembali.\n");
                continue;
            }
            double totalHarga = jumlahTiket * HARGA_TIKET;
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15 * totalHarga;
            } else if (jumlahTiket > 4) {
                diskon = 0.10 * totalHarga;
            }
            totalHarga -= diskon;
            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total harga setelah diskon: Rp " + totalHarga + "\n");
        }
        System.out.println("=== Rangkuman Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total pendapatan    : Rp " + totalPenjualan);

        sc.close();
    }
}
