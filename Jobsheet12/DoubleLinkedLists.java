
public class DoubleLinkedLists {

    Node08 head, tail;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa08 data) {
        Node08 newNode = new Node08(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa08 data) {
        Node08 newNode = new Node08(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void add(int item, int index) {

    }

    public void print() {
        Node08 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {

    }

    public void removeLast() {

    }

    public Node08 search(String nim) {
    Node08 current = head;
    while (current != null) {
        if (current.data.nim.equals(nim)) {
            return current; 
        }
        current = current.next;
    }
    return null; // tidak ditemukan
}


    public void insertAfter(String keyNim, Mahasiswa08 data) {
        Node08 current = head;

        // Mencari node berdasarkan NIM
        while (current != null && !current.data.nim.equalsIgnoreCase(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node08 newNode = new Node08(data);

        // Current adalah tail, cukup menambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

}