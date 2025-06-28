public class BinaryTreeMain08 {
    public static void main(String[] args) {
        BinaryTree08 bst = new BinaryTree08();

        bst.add(new Mahasiswa08("244107024", "Ali", "A", 3.57));
        bst.add(new Mahasiswa08("244107025", "Bahlil", "B", 3.85));
        bst.add(new Mahasiswa08("244107026", "Cahyo", "C", 3.21));
        bst.add(new Mahasiswa08("244107027", "Damar", "D", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);
        
        bst.add(new Mahasiswa08("244107028", "Harry", "A", 3.72));
        bst.add(new Mahasiswa08("244107029", "Ron", "B", 3.37));
        bst.add(new Mahasiswa08("244107030", "Malfoy", "C", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOder Traversal");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}
