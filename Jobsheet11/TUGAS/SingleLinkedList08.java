
import javax.sound.sampled.SourceDataLine;

public class SingleLinkedList08 {

    Node08 head;
    Node08 tail;
    int max = 5, jml = 0;

    public boolean isEmpty() {
        return (head == null);
    }

    public boolean isFull() {
        if (jml == max) {
            return true;
        } else {
            return false;
        }
    }

    public void kosongkanAntrian() {
        head = tail = null;
    }

    public void tambahAntrian(Mahasiswa08 input) {
        Node08 ndInput = new Node08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        } jml++;
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            System.out.println("Berhasil memproses antrian dari " + head.data.nama);
            head = tail = null;
        } else {
            System.out.println("Berhasil memproses antrian dari " + head.data.nama);
            head = head.next;
        }
        jml--;
    }

    public void tampilSemua() {
        if (!isEmpty()) {
            Node08 tmp = head;
            System.out.println("Antrian:");
            System.out.println("Nama\tNIM\tKelas");
            System.out.println("---------------------");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }
    
    public void tampilTerdepan() {
        System.out.println("Antrian terdepan adalah");
        head.data.tampilInformasi();
    }

    public void tampilBelakang() {
        System.out.println("Antrian terbelakang adalah");
        tail.data.tampilInformasi();
    }

    public void jmlAntrian() {
        System.out.println("Jumlah antrian: " + jml + " mahasiswa");
    }
}