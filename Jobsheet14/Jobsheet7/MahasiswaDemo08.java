
import java.util.Scanner;

public class MahasiswaDemo08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumMhs = input.nextInt();

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

        list.SelectionSort();
        list.tampil();
        System.out.println("---------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input.nextDouble();
        System.out.println("-------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("-------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
