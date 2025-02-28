public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Mahasiswa08[] arrayOfMahasiswa = new Mahasiswa08[3];
        arrayOfMahasiswa[0] = new Mahasiswa08 ();
        arrayOfMahasiswa[0].nim = "244107020037";
        arrayOfMahasiswa[0].nama = "Dicky Darmawan";
        arrayOfMahasiswa[0].kelas = "TI 1B";
        arrayOfMahasiswa[0].ipk = (float) 3.82;

        arrayOfMahasiswa[1] = new Mahasiswa08 ();
        arrayOfMahasiswa[1].nim = "244107020065";
        arrayOfMahasiswa[1].nama = "Tribuwana";
        arrayOfMahasiswa[1].kelas = "TI 1B";
        arrayOfMahasiswa[1].ipk = (float) 3.80;

        arrayOfMahasiswa[2] = new Mahasiswa08 ();
        arrayOfMahasiswa[2].nim = "244107020022";
        arrayOfMahasiswa[2].nama = "Dara Petak";
        arrayOfMahasiswa[2].kelas = "TI 1B";
        arrayOfMahasiswa[2].ipk = (float) 3.75;

        System.out.println("NIM     : " +arrayOfMahasiswa[0].nim);
        System.out.println("Nama    : " +arrayOfMahasiswa[0].nama);
        System.out.println("Kelas   : " +arrayOfMahasiswa[0].kelas);
        System.out.println("IPK     : " +arrayOfMahasiswa[0].ipk);
        System.out.println("------------------------------------");
        System.out.println("NIM     : " +arrayOfMahasiswa[1].nim);
        System.out.println("Nama    : " +arrayOfMahasiswa[1].nama);
        System.out.println("Kelas   : " +arrayOfMahasiswa[1].kelas);
        System.out.println("IPK     : " +arrayOfMahasiswa[1].ipk);
        System.out.println("------------------------------------");
        System.out.println("NIM     : " +arrayOfMahasiswa[2].nim);
        System.out.println("Nama    : " +arrayOfMahasiswa[2].nama);
        System.out.println("Kelas   : " +arrayOfMahasiswa[2].kelas);
        System.out.println("IPK     : " +arrayOfMahasiswa[2].ipk);
        System.out.println("------------------------------------");
    }
}