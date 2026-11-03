import java.util.Scanner;
public class Tugas3_20 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
 
        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSeluruh = 0;
            int barangTerbanyak = -1;   // -1 agar toko pertama (walau 0 barang) pasti tercatat
            int tokoTerbanyak = 0;
 
            for (int toko = 1; toko <= jumlahToko; toko++) {
                int jumlahPelanggan;
                do {
                    System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);
 
                int totalBarangToko = 0;
 
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("  Pelanggan " + p + " - jumlah barang: ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }
 
                System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko);
 
                totalSeluruh += totalBarangToko;
 
                if (totalBarangToko > barangTerbanyak) {   // ">" agar nomor toko terkecil dipilih saat seri
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }
 
            System.out.println("Total barang seluruh toko: " + totalSeluruh);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }

}
