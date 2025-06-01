public class DoubleLinkedLists {

    Node08 head, tail;
    int size = 0;

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

    public void add(int index, Mahasiswa08 data) {
        if (index == 0) {
            addFirst(data);
        } else if (index >= size) {
            addLast(data);
        } else {
            Node08 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node08 newNode = new Node08(current.prev, data, current);
            current.prev.next = newNode;
            current.prev = newNode;
        }
        size++;
    }

    public void print() {
        Node08 current = head;
        if (isEmpty()) {
            System.out.println("Linked List masih kosong!");
        }
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return;
        } 
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
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