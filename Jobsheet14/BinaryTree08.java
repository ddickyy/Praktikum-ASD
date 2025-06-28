public class BinaryTree08 {

    Node08 root;

    public BinaryTree08() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addRekursif(Mahasiswa08 data) {
        root = addRekursif(root, data);
    }

    public Node08 addRekursif(Node08 current, Mahasiswa08 data) {
        if (current == null) {
            return new Node08(data);
        }

        if (data.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, data);
        } else {
            current.right = addRekursif(current.right, data);
        }

        return current;
    }

    public Mahasiswa08 cariMinIPK() {
        if (root == null) return null;
        Node08 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa;
    }

    public Mahasiswa08 cariMaxIPK() {
        if (root == null) return null;
        Node08 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa;
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    public void tampilMahasiswaIPKdiAtas(Node08 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                System.out.println("Nama: " + node.mahasiswa.nama + ", IPK: " + node.mahasiswa.ipk);
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }

    public void add(Mahasiswa08 mahasiswa) {
        Node08 newNode = new Node08(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node08 current = root;
            Node08 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node08 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node08 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node08 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    public void traverseInOrder(Node08 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    Node08 getSuccesor(Node08 del) {
        Node08 successor = del.right;
        Node08 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        // cari node (current) yang akan dihapus
        Node08 parent = root;
        Node08 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // Penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //Jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null ) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else{
                        parent.right = null;
                    } 
                }  
            } else if (current.left == null) {// Jika 1 anak di kanan
                if (current == root) {
                root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                } 
            } else if (current.right == null) {// Jika 1 anak di kiri
                if (current == root) {
                    root = current.left;
                } else {
                    if(isLeftChild) {
                        parent.left=current.left;
                    } else {
                       parent.right = current.left;
                    }
                }
            } else { // Jika punya 2 anak
                Node08 successor = getSuccesor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current== root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left= successor;
                    } else {
                        parent.left = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}