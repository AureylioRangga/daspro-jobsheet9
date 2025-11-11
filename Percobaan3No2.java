import java.util.Scanner;
public class Percobaan3No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = scanner.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];

        int totalLulus = 0, totalTidakLulus = 0;
        int jmlLulus = 0, jmlTidakLulus = 0;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = scanner.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }

        double rataLulus = 0, rataTidakLulus = 0;
        if (jmlLulus > 0) {
            rataLulus = (double) totalLulus / jmlLulus;
        }
        if (jmlTidakLulus > 0) {
            rataTidakLulus = (double) totalTidakLulus / jmlTidakLulus;
        }

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);

        scanner.close();
    }
}
