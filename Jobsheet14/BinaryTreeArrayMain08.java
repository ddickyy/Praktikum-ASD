public class BinaryTreeArrayMain08 {
    public static void main(String[] args) {
        BinaryTreeArray08 bta = new BinaryTreeArray08();
        Mahasiswa08 mhs1 = new Mahasiswa08("244107024", "Ali", "A", 3.57);
        Mahasiswa08 mhs2 = new Mahasiswa08("244107025", "Bahlil", "B", 3.85);
        Mahasiswa08 mhs3 = new Mahasiswa08("244107026", "Cahyo", "C", 3.21);
        Mahasiswa08 mhs4 = new Mahasiswa08("244107027", "Damar", "D", 3.54);

        Mahasiswa08 mhs5 = new Mahasiswa08("244107028", "Harry", "A", 3.72);
        Mahasiswa08 mhs6 = new Mahasiswa08("244107029", "Ron", "B", 3.37);
        Mahasiswa08 mhs7 = new Mahasiswa08("244107030", "Malfoy", "C", 3.46);

        Mahasiswa08[] dataMahasiswa = { mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null };
        int idxLast = 6;
        bta.populateData(dataMahasiswa, idxLast);
        System.out.println("\nInOrder Traversal Mahasiswa:");
        bta.traverseInOrder(0);
    }
}
