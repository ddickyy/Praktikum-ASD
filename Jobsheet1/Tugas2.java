import java.util.Scanner;
public class Tugas2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        double sisi;
        
        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            
            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                sisi = scanner.nextDouble();
                
                switch (pilihan) {
                    case 1:
                        System.out.println("Volume kubus: " + hitungVolume(sisi));
                        break;
                    case 2:
                        System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
                        break;
                    case 3:
                        System.out.println("Keliling kubus: " + hitungKeliling(sisi));
                        break;
                }
            } else if (pilihan != 4) {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 4);
    }

    public static void tampilkanMenu() {
        System.out.println("\nMenu Perhitungan Kubus:");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }
    
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * (sisi * sisi);
    }
    
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
}
