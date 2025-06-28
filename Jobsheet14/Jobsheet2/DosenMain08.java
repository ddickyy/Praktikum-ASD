<<<<<<< HEAD
public class DosenMain08 {

    public static void main(String[] args) {
        System.out.println("===============================");
        Dosen08 ds1 = new Dosen08();
        ds1.nama = "Tunggul Ametung";
        ds1.bidangAhli = "Critial Thinking";
        ds1.idDosen = "TGA";
        ds1.tahunBergabung = 1978;
        ds1.statusAktif = false;

        ds1.hitungMasaKerja(2025);
        ds1.setStatusAktif(true);
        ds1.ubahKeahlian("Kesehatan");
        ds1.tampilInformasi();
        System.out.println("===============================");

        Dosen08 ds2 = new Dosen08("Jayabaya", "Meramal", "JBY", 1954, true);
        ds2.hitungMasaKerja(2025);
        ds2.setStatusAktif(false);
        ds2.ubahKeahlian("Stategi Perang");
        ds2.tampilInformasi();
        System.out.println("===============================");

    }
=======
public class DosenMain08 {

    public static void main(String[] args) {
        System.out.println("===============================");
        Dosen08 ds1 = new Dosen08();
        ds1.nama = "Tunggul Ametung";
        ds1.bidangAhli = "Critial Thinking";
        ds1.idDosen = "TGA";
        ds1.tahunBergabung = 1978;
        ds1.statusAktif = false;

        ds1.hitungMasaKerja(2025);
        ds1.setStatusAktif(true);
        ds1.ubahKeahlian("Kesehatan");
        ds1.tampilInformasi();
        System.out.println("===============================");

        Dosen08 ds2 = new Dosen08("Jayabaya", "Meramal", "JBY", 1954, true);
        ds2.hitungMasaKerja(2025);
        ds2.setStatusAktif(false);
        ds2.ubahKeahlian("Stategi Perang");
        ds2.tampilInformasi();
        System.out.println("===============================");

    }
>>>>>>> 6226c2c4d930be7b1d76ea52195857ef7969855c
}