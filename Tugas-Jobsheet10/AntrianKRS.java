public class AntrianKRS {

    Mahasiswa[] data;
    int front, rear, size, max;
    int sudahProses = 0, maxMhs = 30;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public void layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        if (sudahProses >= maxMhs) {
            System.out.println("Semua mahasiswa telah dilayani");
            return;
        }
        int jumlahDiproses = 0;
        while (!IsEmpty() && jumlahDiproses < 2 && sudahProses <= maxMhs) {
            Mahasiswa mhs = data[front];
            System.out.println("Memproses KRS ");
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            maxMhs--;
            sudahProses++;
            jumlahDiproses++;
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampil2Terdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        }
        System.out.println("2 Antrian Terdepan: ");
        for (int i = front; i < front + 2; i++) {
            data[i].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void sudahProses() {
        System.out.println("Mahasiswa yang telah dilayani sebanyak: " +sudahProses + " mahasiswa");
    }

    public void belumProses() {
        System.out.println("Mahasiswa yang belum dilayani sebanyak: " + maxMhs + " mahasiswa");
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        }
        System.out.println("Mahasiswa Antrian belakang: ");
        data[rear].tampilkanData();
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}