
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

}
