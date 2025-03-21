import java.util.Scanner;
public class MahasiswaDemo08 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();

        for (int i = 0; i < 5; i++) {
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

            list.tambah(new Mahasiswa08(nim, nama, kelas, ipk));
        }
        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();
    }
}