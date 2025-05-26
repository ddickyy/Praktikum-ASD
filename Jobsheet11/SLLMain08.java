import java.util.Scanner;
public class SLLMain08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList08 sll = new SingleLinkedList08();

        String pilih;
        do {   
            System.out.println("Tambahkan Data Mahasiswa");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            Mahasiswa08 mhs = new Mahasiswa08(nim, nama, kelas, ipk);
            sll.addFirst(mhs);
            
            System.out.print("Ingin menambah data lagi? (Y/N): ");
            pilih = sc.nextLine();

            sc.nextLine();
        } while (pilih.equalsIgnoreCase("y"));

        System.out.println();
        sll.print();
    }
}