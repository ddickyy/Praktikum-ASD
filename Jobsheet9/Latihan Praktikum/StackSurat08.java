public class StackSurat08 {

    Surat08[] stack;
    int size, top;

    public StackSurat08(int size) {
        this.size = size;
        stack = new Surat08[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat08 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh");
        }
    }

    public Surat08 pop() {
        if (!isEmpty()) {
            Surat08 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat08 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                ditemukan = true;
                System.out.println("Surat atas nama " + nama + " berhasil ditemukan");
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan!");
        }
    }
}