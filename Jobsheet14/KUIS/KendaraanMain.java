import java.util.Scanner;

public class KendaraanMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kendaraan[][] arrMobil08 = new Kendaraan [3][5];
        String merk08, model08, no08;
        double kapasitasTangki08, konsumsiBBM08, jarakTempuh08;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan Merk Kendaraan: ");
                merk08 = sc.nextLine();
                
                System.out.print("Masukkan Model Kendaraan: ");
                model08 =  sc.nextLine();

                System.out.print("Masukkan Kapasitas Tangki (liter): ");
                no08 = sc.nextLine();
                kapasitasTangki08 =  Double.parseDouble(no08);

                System.out.print("Masukkan Konsumsi BBM (km/liter): ");
                no08 = sc.nextLine();
                konsumsiBBM08 = Double.parseDouble(no08);

                System.out.print("Masukkan Jarak (km): ");
                no08 = sc.nextLine();
                jarakTempuh08 = Double.parseDouble(no08);

                arrMobil08[i][j] = new Kendaraan (merk08, model08, kapasitasTangki08, konsumsiBBM08, jarakTempuh08);
            }
        }
    }
}