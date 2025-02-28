public class DataDosen08 {
        public static void tampilData(Dosen08[] arrDosen) {
            System.out.println("\n=== Data Semua Dosen ===");
            for (Dosen08 d : arrDosen) {
                System.out.println(d);
            }
        }
    
        public static void jumlahDosenPerJenisKelamin(Dosen08[] arrDosen) {
            int pria = 0, wanita = 0;
            for (Dosen08 d : arrDosen) {
                if (d.jenisKelamin) pria++;
                else wanita++;
            }
            System.out.println("\n=== Jumlah Dosen Per Jenis Kelamin ===");
            System.out.println("Laki-laki : " + pria);
            System.out.println("Wanita    : " + wanita);
        }
    
        public static void rataUsiaPerJenisKelamin(Dosen08[] arrDosen) {
            int totalUsiaPria = 0, totalUsiaWanita = 0;
            int pria = 0, wanita = 0;
    
            for (Dosen08 d : arrDosen) {
                if (d.jenisKelamin) {
                    totalUsiaPria += d.usia;
                    pria++;
                } else {
                    totalUsiaWanita += d.usia;
                    wanita++;
                }
            }
    
            double rataPria = (pria == 0) ? 0 : (double) totalUsiaPria / pria;
            double rataWanita = (wanita == 0) ? 0 : (double) totalUsiaWanita / wanita;
    
            System.out.println("\n=== Rata-rata Usia Dosen Per Jenis Kelamin ===");
            System.out.println("Laki-laki : " + (pria == 0 ? "Tidak ada data" : rataPria));
            System.out.println("Wanita    : " + (wanita == 0 ? "Tidak ada data" : rataWanita));
        }
    

        public static void dosenPalingTua(Dosen08[] arrDosen) {
            if (arrDosen.length == 0) {
                System.out.println("\nTidak ada data dosen.");
                return;
            }
    
            Dosen08 tertua = arrDosen[0];
            for (Dosen08 d : arrDosen) {
                if (d.usia > tertua.usia) {
                    tertua = d;
                }
            }
    
            System.out.println("\n=== Dosen Paling Tua ===");
            System.out.println(tertua);
        }
    
        public static void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
            if (arrayOfDosen.length == 0) {
                System.out.println("\nTidak ada data dosen.");
                return;
            }
    
            Dosen08 termuda = arrayOfDosen[0];
            for (Dosen08 d : arrayOfDosen) {
                if (d.usia < termuda.usia) {
                    termuda = d;
                }
            }
    
            System.out.println("\n=== Dosen Paling Muda ===");
            System.out.println(termuda);
    }
}
