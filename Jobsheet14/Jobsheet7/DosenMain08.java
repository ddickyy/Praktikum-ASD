
import java.util.Scanner;


public class DosenMain08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen08 dsn = new DataDosen08();

        Dosen08 dsn1 = new Dosen08("ABD", "ABDUL", true, 45);
        Dosen08 dsn2 = new Dosen08("STI", "SITI", false, 58);
        Dosen08 dsn3 = new Dosen08("FUD", "FUAD", true, 47);
        Dosen08 dsn4 = new Dosen08("KRS", "KRIS", true, 52);
        Dosen08 dsn5 = new Dosen08("DW", "DWIPUTRI", false, 42);
        Dosen08 dsn6 = new Dosen08("ZAN", "ZAINAL", true, 55);
        Dosen08 dsn7 = new Dosen08("BRL", "BERLIAN", false, 40);
        Dosen08 dsn8 = new Dosen08("MIS", "MISEL", false, 38);
        Dosen08 dsn9 = new Dosen08("MAS", "MASNAIMAH", false, 57);
        Dosen08 dsn10 = new Dosen08("MUH", "MUHAIMIN", true, 48);

        dsn.tambah(dsn1);
        dsn.tambah(dsn2);
        dsn.tambah(dsn3);
        dsn.tambah(dsn4);
        dsn.tambah(dsn5);
        dsn.tambah(dsn6);
        dsn.tambah(dsn7);
        dsn.tambah(dsn8);
        dsn.tambah(dsn9);
        dsn.tambah(dsn10);

        dsn.bubbleSort();//diurutkan terlebih dahulu
        
        System.out.println("--------------------");
        System.out.println("Pencarian Data");
        System.out.println("--------------------");
        System.out.print("Masukkan nama dosen yang dicari: ");
        String cariNama = input.nextLine();
        dsn.pencarianDataSequential(cariNama);
        
        System.out.print("Masukkan usia dosen yang dicari: ");
        int cariUsia = input.nextInt();
        dsn.pencarianDataBinary(cariUsia, 0, dsn.idx -1);
    }
}
