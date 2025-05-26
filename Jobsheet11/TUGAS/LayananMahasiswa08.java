import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
public class LayananMahasiswa08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList08 sll = new SingleLinkedList08(); 

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    if (sll.isFull()) {
                        System.out.println("Antrian telah penuh!");
                    } else {
                        System.out.println("Masukkan Data");
                        System.out.print("Nama  : ");
                        String nama = sc.nextLine();
                        System.out.print("NIM   : ");
                        String nim = sc.nextLine();
                        System.out.print("Kelas : ");
                        String kelas = sc.nextLine();
                        Mahasiswa08 mhs = new Mahasiswa08(nama, nim, kelas);
                        sll.tambahAntrian(mhs);
                    
                        System.out.println("Data Berhasil Ditambahkan!");
                    }
                    break;
                case 2: 
                    if (sll.isEmpty()) {
                        System.out.println("Antrian Kosong!");
                    } else {
                        sll.panggilAntrian();
                    }
                    break;
                case 3:
                    if (sll.isEmpty()) {
                        System.out.println("Antrian Kosong!");
                    } else {
                        sll.tampilTerdepan();
                    }
                    break;
                case 4: 
                    if (sll.isEmpty()) {
                        System.out.println("Antrian Kosong!");
                    } else {
                        sll.tampilBelakang();
                    }
                    break;
                case 5: 
                    if (sll.isEmpty()) {
                        System.out.println("Antrian Kosong!");
                    } else {
                        sll.tampilSemua();
                    }
                    break;
                case 6:
                    if (sll.isEmpty()) {
                        System.out.println("Antrian Kosong!");
                    } else {
                        sll.jmlAntrian();
                    }
                    break;
                case 7: 
                    if (sll.isEmpty()) {
                        System.out.println("Antrian telah kosong!");
                    } else {
                        sll.kosongkanAntrian();
                        System.out.println("Berhasil Mengosongkan Antrian");
                    }
                    break;
            }
            
        } while (pilih != 0);
    }

    static void menu() {
        System.out.println("\n== LAYANAN MAHASISWA ==");
        System.out.println("1. Tambahkan Data Antrian");
        System.out.println("2. Proses Antrian");
        System.out.println("3. Tampilkan Antrian Terdepan");
        System.out.println("4. Tampilkan Antrian Terbelakang");
        System.out.println("5. Tampilkan Semua Antrian");
        System.out.println("6. Tampilkan Jumlah Antrian");
        System.out.println("7. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }
}