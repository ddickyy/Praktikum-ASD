public class MahasiswaMain08 {
     public static void main(String[] args) {
        Mahasiswa08 mhs1 = new Mahasiswa08();
        mhs1.nama = "Dicky Darmawan";
        mhs1.nim = "244107020037";
        mhs1.kelas = "TI 1B";
        mhs1.ipk = 3.89;
  
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1A");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
     }
}

