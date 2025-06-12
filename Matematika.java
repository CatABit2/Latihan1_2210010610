package hitung;

public class Matematika {

    // Method untuk menghitung penjumlahan
    public int tambah(int a, int b) {
        return a + b;
    }

    // Method untuk menghitung pengurangan
    public int kurang(int a, int b) {
        return a - b;
    }

    // Method untuk menghitung perkalian
    public int kali(int a, int b) {
        return a * b;
    }

    // Method untuk menghitung pembagian
    public double bagi(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Pembagi tidak boleh nol");
            return 0;
        }
    }
}
