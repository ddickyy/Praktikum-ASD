public class MataKuliah08 {

    String nama, kodeMK;
    int sks, jumlahJam;

    public MataKuliah08 () {

    }

    public MataKuliah08 (String nama, String kodeMK, int sks, int jumlahJam) {
        this.nama = nama;
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Nama Mata Kuliah: " +nama);
        System.out.println("Kode Mata Kuliah: " +kodeMK);
        System.out.println("SKS" + "\t\t: " +sks);
        System.out.println("Jumlah Jam" + "\t: " +jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        jumlahJam -= jam;
    }
}