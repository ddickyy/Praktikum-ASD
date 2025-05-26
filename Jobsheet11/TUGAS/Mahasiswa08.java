public class Mahasiswa08 {

    String nama, nim, kelas;

    public Mahasiswa08() {

    }

    public Mahasiswa08(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas);
    }
}