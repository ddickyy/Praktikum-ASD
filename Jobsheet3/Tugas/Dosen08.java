public class Dosen08 {
    String kode, nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen08 (String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;

    }
    
    public String toString() {
        return 
        "Kode            : " + kode + 
        "\nNama            : " + nama + 
        "\nJenis Kelamin   : " + (jenisKelamin ? "Laki-laki" : "Wanita") +
        "\nUsia            : " + usia + 
        "\n------------------------------------------";
    }

}