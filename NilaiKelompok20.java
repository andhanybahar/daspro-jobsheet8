import java.util.Scanner;

public class NilaiKelompok20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok: ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai: ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0");
            sc.close();
            return;
        }

        double rataTertinggi = -1;
        int kelompokTerbaik = 0;

        for (int nomorKelompok = 1; nomorKelompok <= jumlahKelompok; nomorKelompok++) {
            System.out.println("Kelompok " + nomorKelompok);
            double totalNilai = 0;

            for (int penilai = 1; penilai <= jumlahPenilai; penilai++) {
                int nilai;
                do {
                    System.out.print("Nilai Penilai " + penilai + " = ");
                    nilai = sc.nextInt();
                    if (nilai < 0 || nilai > 100) {
                        System.out.println("Nilai harus antara 0-100");
                    }
                } while (nilai < 0 || nilai > 100);

                totalNilai += nilai;
            }

            double rataNilai = totalNilai / jumlahPenilai;
            System.out.println("Kelompok " + nomorKelompok + " : Nilai rata-rata " + rataNilai);

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTerbaik = nomorKelompok;
            }

            System.out.println("==============================");
        }

        System.out.println("Kelompok terbaik    : " + kelompokTerbaik);
        System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        sc.close();
    }
}