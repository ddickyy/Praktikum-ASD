<<<<<<< HEAD
public class Dosen08 {
    String idDosen, nama, bidangAhli;
    int tahunBergabung;
    boolean statusAktif;


    public Dosen08 (){

    }

    public Dosen08 (String nama, String idDosen, String bidangAhli, int tahunBergabung, boolean statusAktif) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangAhli = bidangAhli;
        this.tahunBergabung = tahunBergabung;
        this.statusAktif = statusAktif;

    }

    void tampilInformasi() {
        System.out.println("Nama Dosen" + "\t: " +nama);
        System.out.println("ID Dosen" + "\t: " + idDosen);
        System.out.println("Bidang Keahlian" + "\t: " +bidangAhli);
        System.out.println("Tahun Bergabung" + "\t: " +tahunBergabung);
        System.out.println("Status" + "\t\t: " +(statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrng) {
        return thnSkrng - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangAhli = bidang;
    }
=======
public class Dosen08 {
    String idDosen, nama, bidangAhli;
    int tahunBergabung;
    boolean statusAktif;


    public Dosen08 (){

    }

    public Dosen08 (String nama, String idDosen, String bidangAhli, int tahunBergabung, boolean statusAktif) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangAhli = bidangAhli;
        this.tahunBergabung = tahunBergabung;
        this.statusAktif = statusAktif;

    }

    void tampilInformasi() {
        System.out.println("Nama Dosen" + "\t: " +nama);
        System.out.println("ID Dosen" + "\t: " + idDosen);
        System.out.println("Bidang Keahlian" + "\t: " +bidangAhli);
        System.out.println("Tahun Bergabung" + "\t: " +tahunBergabung);
        System.out.println("Status" + "\t\t: " +(statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrng) {
        return thnSkrng - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangAhli = bidang;
    }
>>>>>>> 6226c2c4d930be7b1d76ea52195857ef7969855c
}