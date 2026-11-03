import java.util.Scanner;
public class Tugas1_20 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
 
        if (n < 1) {
            System.out.println("Nilai n minimal 1.");
        } else {
            int totalAngka = 0;
 
            for (int i = 1; i <= n; i++) {          // outer loop: baris
                for (int j = 1; j <= i; j++) {      // inner loop: angka 1 sampai i
                    if (j > 1) {
                        System.out.print(" ");
                    }
                    System.out.print(j);
                    totalAngka++;
                }
                System.out.println();
            }
            System.out.println("Total angka tercetak: " + totalAngka);
        }
        sc.close();
    }

    
}
