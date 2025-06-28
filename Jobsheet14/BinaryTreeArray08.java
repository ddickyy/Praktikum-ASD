public class BinaryTreeArray08 {
    Mahasiswa08[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray08() {
        this.dataMahasiswa = new Mahasiswa08[10];
    }

    public void populateData(Mahasiswa08 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 1);
            }
        }
    }

    public void add(Mahasiswa08 dataBaru) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Tree penuh");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = dataBaru;
    }

    public void traversePreOrder() {
        traversePreOrder(0);
    }

    public void traversePreOrder(int idx) {
        if (idx > idxLast || dataMahasiswa[idx] == null) return;
        System.out.println("Nama: " + dataMahasiswa[idx].nama + ", IPK: " + dataMahasiswa[idx].ipk);
        traversePreOrder(2 * idx + 1); // anak kiri
        traversePreOrder(2 * idx + 2); // anak kanan
    }
}
