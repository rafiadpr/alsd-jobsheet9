public class StackTugasMahasiswa23 {

    Mahasiswa23[] stack;
    int size, top;

    public StackTugasMahasiswa23(int size) {
        this.size = size;
        stack = new Mahasiswa23[size];
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

    public void push(Mahasiswa23 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa23 pop() {
        if (!isEmpty()) {
            Mahasiswa23 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong, tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa23 peek() {
        if (!isEmpty()) {
            System.out.println("Tugas teratas: " + stack[top].nim + " - " + stack[top].nama);
            return stack[top];
        } else {
            System.out.println("Stack kosong, tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Daftar tugas yang belum dinilai:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
            System.out.println("");
        } else {
            System.out.println("Stack kosong, tidak ada tugas untuk diprint.");
        }
    }
}