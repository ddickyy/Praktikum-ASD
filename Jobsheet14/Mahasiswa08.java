public class Mahasiswa08 {

    String nim, nama, kelas;
    double ipk;

    public Mahasiswa08() {

    }

    public Mahasiswa08(String nm, String name, String kls, double ipk) {
        nim = nm;
        nama = name;
        kelas = kls;
        this.ipk= ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " + nim + " " + 
        "Nama: " + nama + " " +
        "Kelas: " +kelas + " " +
        "IPK: " + this.ipk);
    }
}