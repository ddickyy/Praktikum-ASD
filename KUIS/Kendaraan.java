public class Kendaraan {
    String merk08, model08;
    double kapasitasTangki08, konsumsiBBM08, jarakTempuh08;

    public Kendaraan (String merk, String model, double kapasitasTangki, double konsumsiBBM, double jarakTempuh) {
        this.merk08 = merk08;
        this.model08 = model08;
        this. kapasitasTangki08 = kapasitasTangki08;
        this.konsumsiBBM08 = konsumsiBBM08;
        this.jarakTempuh08 = jarakTempuh08;
    }
    
    public static void tampilkanInformasi(Kendaraan[] arrMobil08) {
        for (Kendaraan a : arrMobil08) {
            System.out.println("===DATA KENDARAAN===");
            System.out.println(a);
        }
    }

    void cekSisaBahanBakar() {


    }
}