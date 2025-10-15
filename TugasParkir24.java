import java.util.Scanner;
public class TugasParkir24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi;
        double total = 0;
        System.out.println("=== PROGRAM PARKIR KENDARAAN ===");
        do {
            System.out.print("Masukkan jenis kendaraan (Mobil, Motor, 0. Keluar): ");
            jenis = input.nextInt();
            if (jenis == 0) {
                break;
            }
            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid! Masukkan 1 untuk Mobil atau 2 untuk Motor.");
                continue;
            }
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = input.nextInt();
            if (durasi > 5) {
                total += 12500; 
            } else if (jenis == 1) {
                total += durasi * 3000;  
            } else if (jenis == 2) {
                total += durasi * 2000; 
            }
            System.out.println("Total sementara: Rp " + total);
            System.out.println("----------------------------------");
        } while (jenis != 0);
        System.out.println("Total pembayaran parkir seluruh kendaraan: Rp " + total);
        System.out.println("=== Program selesai ===");
        input.close();
    }
}
