import java.util.Scanner;

public class SuratDemo08 {

    public static void main(String[] args) {
        StackSurat08 stack = new StackSurat08(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama: ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin: ");
                    char jenisIzin = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    Surat08 surat = new Surat08(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("Surat berhasil ditambahkan");
                    break;
                case 2:
                    Surat08 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Surat dari " + proses.namaMahasiswa + " berhasil diproses");
                    }
                    break;
                case 3:
                    Surat08 teratas = stack.peek();
                    if (teratas!=null) {
                        System.out.println("Surat teratas adalah milik " + teratas.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama Mahasiswa: ");
                    String nm =sc.nextLine();
                    stack.cariSurat(nm);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih > 0 && pilih <= 4);
    }
}
