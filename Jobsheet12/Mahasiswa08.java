public class Mahasiswa08 {

    String nim, nama, kelas;
    double ipk;

    public Mahasiswa08(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama= nama;
        this. kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("NIM: " +nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }
}