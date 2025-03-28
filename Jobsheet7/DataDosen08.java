
public class DataDosen08 {

    Dosen08 arrDosen[] = new Dosen08[10];
    int idx;

    void tambah(Dosen08 dsn) {
        if (idx < arrDosen.length) {
            arrDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen08 arr : arrDosen) {
            arr.tampil();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort() { //Ascending
        for (int i = 0; i < arrDosen.length; i++) {
            for (int j = 1; j < arrDosen.length - i; j++) {
                if (arrDosen[j].usia < arrDosen[j - 1].usia) {
                    Dosen08 tmp = arrDosen[j];
                    arrDosen[j] = arrDosen[j - 1];
                    arrDosen[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() { //Descending
        for (int i = 0; i < arrDosen.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < arrDosen.length; j++) {
                if (arrDosen[j].usia > arrDosen[idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen08 tmp = arrDosen[idxMin];
            arrDosen[idxMin] = arrDosen[i];
            arrDosen[i] = tmp;
        }
    }
    
    void pencarianDataSequential(String cari) {
        int posisi = -1;
        boolean lebihDariSatu = false;
    
        for (int i = 0; i < arrDosen.length; i++) {
            if (arrDosen[i].nama.equalsIgnoreCase(cari)) {
                if (posisi == -1) {
                    posisi = i;
                } else {
                    lebihDariSatu = true;
                }
            }
        }
    
        if (posisi != -1) {
            System.out.println("Dosen ditemukan pada indeks: " + posisi);
            System.out.println("Kode         : " + arrDosen[posisi].kode);
            System.out.println("Nama         : " + arrDosen[posisi].nama);
            System.out.println("Jenis Kelamin: " + (arrDosen[posisi].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia         : " + arrDosen[posisi].usia);
    
            if (lebihDariSatu) {
                System.out.println("\nPeringatan: Lebih dari satu hasil ditemukan. Pastikan memilih yang sesuai");
            }
        } else {
            System.out.println("Dosen dengan nama '" + cari + "' tidak ditemukan");
        }
    }
    
    void pencarianDataBinary(int cariUsia, int left, int right) {
        if (left > right) {
            System.out.println("Dosen dengan usia " + cariUsia + " tahun tidak ditemukan");
            return;
        }
    
        int mid = (left + right) / 2;
    
        if (arrDosen[mid].usia == cariUsia) {
            System.out.print("Dosen dengan usia " + cariUsia + " tahun ditemukan di indeks: " + mid);
    
            boolean lebihDariSatu = false;
    
            // kiri
            int i = mid - 1;
            while (i >= left && arrDosen[i].usia == cariUsia) {
                System.out.print(", " + i);
                lebihDariSatu = true;
                i--;
            }
    
            // kanan
            i = mid + 1;
            while (i <= right && arrDosen[i].usia == cariUsia) {
                System.out.print(", " + i);
                lebihDariSatu = true;
                i++;
            }
    
            System.out.println();

            if (lebihDariSatu) {
                System.out.println("Peringatan: Lebih dari satu hasil ditemukan. Pastikan memilih yang sesuai");
            }
        } else if (arrDosen[mid].usia > cariUsia) {
            pencarianDataBinary(cariUsia, left, mid - 1);
        } else {
            pencarianDataBinary(cariUsia, mid + 1, right);
        }
    }
    
}
