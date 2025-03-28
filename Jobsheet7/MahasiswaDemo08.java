
import java.util.Scanner;

public class MahasiswaDemo08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            String ip = input.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------");

            list.tambah(new Mahasiswa08(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("-----------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input.nextDouble();

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
