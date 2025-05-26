import java.util.Scanner;
public class SLLMain08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList08 sll = new SingleLinkedList08();

        Mahasiswa08 mhs1 = new Mahasiswa08("244107040390", "Alvaro", "2A", 3.8);
        Mahasiswa08 mhs2 = new Mahasiswa08("244107040391", "Kemal", "2A", 3.5);
        Mahasiswa08 mhs3 = new Mahasiswa08("244107040392", "Ayu", "2A", 3.7);
        Mahasiswa08 mhs4 = new Mahasiswa08("244107040393", "Dirga", "2A", 3.8);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}