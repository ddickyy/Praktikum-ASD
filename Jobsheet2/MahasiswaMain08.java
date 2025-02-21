public class MahasiswaMain08 {
     public static void main(String[] args) {
        Mahasiswa08 mhs1 = new Mahasiswa08();
        mhs1.nama = "Dicky Darmawan";
        mhs1.nim = "244107020037";
        mhs1.kelas = "TI 1B";
        mhs1.ipk = 3.89;
  
        mhs1.ubahKelas("TI 1A");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa08 mhs2 = new Mahasiswa08 ("Dicky Darmawan","244107020037",3.86,"TI 1B");
        mhs2.updateIpk(3.25);
        mhs2.tampilkanInformasi();
        
        Mahasiswa08 mhsDicky = new Mahasiswa08("Samuel","2514702034",4.00,"TI 4A");
        mhsDicky.nilaiKinerja();
     }
}

