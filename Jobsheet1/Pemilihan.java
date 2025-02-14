import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double tugas, kuis, uts, uas, nilaiAkhir;
        
        // input nilai
        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextDouble();
        if (tugas < 0 || tugas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        
        System.out.print("Masukkan nilai kuis: ");
        kuis = input.nextDouble();
        if (kuis < 0 || kuis > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        
        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextDouble();
        if (uts < 0 || uts > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        
        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextDouble();
        if (uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        
        // hitung nilai akhir
        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
        
        String nilaiHuruf;
        String keterangan;
        
        if (nilaiAkhir >= 85) {
            nilaiHuruf = "A";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 80) {
            nilaiHuruf = "B+";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "C+";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "D";
            keterangan = "ANDA TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            keterangan = "ANDA TIDAK LULUS";
        }
        System.out.println("=========================");
        System.out.printf("Nilai Akhir: %.2f%n" , nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println(keterangan);
        
    }
}

