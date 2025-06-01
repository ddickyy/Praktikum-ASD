public class Node08 {

    Mahasiswa08 data;
    Node08 next, prev;
    
    public Node08(Mahasiswa08 data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node08(Node08 prev, Mahasiswa08 data, Node08 next) {
    this.prev = prev;
    this.data = data;
    this.next = next;
    }
}