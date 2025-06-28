import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String no, kode, nama;
        Boolean jenisKelamin;
        int usia;

        System.out.print("Masukkan Jumlah Dosen: ");
        int jmlDosen = sc.nextInt();
        sc.nextLine();
        
        Dosen08[] arrDosen = new Dosen08[jmlDosen];
        
        for (int i = 0; i < jmlDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode\t\t   : ");
            kode = sc.nextLine();
            System.out.print("Nama\t\t   : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            no = sc.nextLine();
            jenisKelamin = no.equalsIgnoreCase("L");
            System.out.print("Usia\t\t   : ");
            no = sc.nextLine();
            usia = Integer.parseInt(no);
            System.out.println("-----------------------------------");

            arrDosen[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }

        DataDosen08.tampilData(arrDosen);
        DataDosen08.jumlahDosenPerJenisKelamin(arrDosen);
        DataDosen08.rataUsiaPerJenisKelamin(arrDosen);
        DataDosen08.dosenPalingTua(arrDosen);
        DataDosen08.infoDosenPalingMuda(arrDosen);
    }    
}
