import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jml = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] namaMatkul = new String[jml];
        int[] sks = new int[jml];
        int[] semester = new int[jml];
        String[] hariKuliah = new String[jml];
        

        int i = 0;
        while (i < jml) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
            i++;
        }
        
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\nSeluruh Jadwal Kuliah:");
                    i = 0;
                    while (i < jml) {
                        System.out.println(namaMatkul[i] + " - SKS: " + sks[i] + " - Semester: " + semester[i] + " - Hari: " + hariKuliah[i]);
                        i++;
                    }
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String hariCari = scanner.nextLine();
                    System.out.println("\nJadwal kuliah untuk " + hariCari + ":");
                    i = 0;
                    while (i < jml) {
                        if (hariKuliah[i].equalsIgnoreCase(hariCari)) {
                            System.out.println(namaMatkul[i] + " - SKS: " + sks[i] + " - Semester: " + semester[i]);
                        }
                        i++;
                    }
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int semesterCari = scanner.nextInt();
                    System.out.println("\nJadwal kuliah untuk semester " + semesterCari + ":");
                    i = 0;
                    while (i < jml) {
                        if (semester[i] == semesterCari) {
                            System.out.println(namaMatkul[i] + " - SKS: " + sks[i] + " - Hari: " + hariKuliah[i]);
                        }
                        i++;
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String matkulCari = scanner.nextLine();
                    System.out.println("\nHasil pencarian untuk " + matkulCari + ":");
                    i = 0;
                    while (i < jml) {
                        if (namaMatkul[i].equalsIgnoreCase(matkulCari)) {
                            System.out.println(namaMatkul[i] + " - SKS: " + sks[i] + " - Semester: " + semester[i] + " - Hari: " + hariKuliah[i]);
                        }
                        i++;
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
        
    }
}
