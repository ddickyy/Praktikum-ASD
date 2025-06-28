import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedLists list = new DoubleLinkedLists();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah di indeks tertentu");
            System.out.println("4. Hapus di awal");
            System.out.println("5. Hapus di akhir");
            System.out.println("6. Hapus di indeks tertentu");
            System.out.println("7. Hapus setelah NIM tertentu");
            System.out.println("8. Tampilkan semua data");
            System.out.println("9. Cari Mahasiswa berdasarkan NIM");
            System.out.println("10. Tampilkan data pertama");
            System.out.println("11. Tampilkan data terakhir");
            System.out.println("12. Tampilkan data pada indeks tertentu");
            System.out.println("13. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1: {
                    Mahasiswa08 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                    break;
                }
                case 2: {
                    Mahasiswa08 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                    break;
                }
                case 3: {
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa08 mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                    break;
                }
                case 4: {
                    list.removeFirst();
                    break;
                }
                case 5: {
                    list.removeLast();
                    break;
                }
                case 6: {
                    System.out.print("Masukkan indeks yang akan dihapus: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.remove(index);
                    break;
                }
                case 7: {
                    System.out.print("Masukkan NIM: ");
                    String nim = scan.nextLine();
                    list.removeAfter(nim);
                    break;
                }
                case 8: {
                    list.print();
                    break;
                }
                case 9: {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node08 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;
                }
                case 10: {
                    list.getFirst();
                    break;
                }
                case 11: {
                    list.getLast();
                    break;
                }
                case 12: {
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(index);
                    break;
                }
                case 13: {
                    System.out.println("Jumlah data: " + list.getSize());
                    break;
                }
                case 0: {
                    System.out.println("Keluar dari program.");
                    break;
                }
                default: {
                    System.out.println("Pilihan tidak valid.");
                }
            }
        } while (pilihan != 0);

        scan.close();
    }

    public static Mahasiswa08 inputMahasiswa(Scanner scan) {
        System.out.print("NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa08(nim, nama, kelas, ipk);
    }
}