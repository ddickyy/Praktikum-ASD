import java.util.Scanner;

public class MataKuliahDemo08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jmlmatkul = sc.nextInt();
        
        MataKuliah08[] arrayOfMataKuliah = new MataKuliah08[jmlmatkul];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1));
            System.out.print("Kode\t : ");
            kode = sc.nextLine();
            System.out.print("Nama\t : ");
            nama = sc.nextLine();
            System.out.print("SKS\t : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt (dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah08(kode, nama, sks, jumlahJam);
            arrayOfMataKuliah[i].tambahData("ALJAB", "ALJABAR", 2, 4);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}