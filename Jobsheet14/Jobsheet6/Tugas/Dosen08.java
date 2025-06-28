
public class Dosen08 {

    String kode, nama;
    Boolean jenisKelamin = true; //true = laki-laki
    int usia;

    public Dosen08(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        if (jenisKelamin) {
            System.out.println("Jenis Kelamin: Laki-laki");
        } else {
            System.out.println("Jenis kelamin: Perempuan");
        }
        System.out.println("Usia         : " + usia);
    }

}
