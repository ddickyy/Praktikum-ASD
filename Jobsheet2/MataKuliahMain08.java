public class MataKuliahMain08 {

    public static void main(String[] args) {
        System.out.println("===============================");
        MataKuliah08 mk1 = new MataKuliah08();
        mk1.nama = "Pemrograman";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        mk1.kodeMK = "PR";
        
        mk1.ubahSKS(2);
        mk1.kurangiJam(2);
        mk1.tampilInformasi();
        System.out.println("===============================");

        MataKuliah08 mk2 = new MataKuliah08("Matematika", "MTK", 3, 6);
        mk2.tambahJam(2);
        mk2.ubahSKS(4);
        mk2.tampilInformasi();
        System.out.println("===============================");
    }
}