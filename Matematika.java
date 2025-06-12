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

    // Kelas MatematikaBeraksi yang berisi method main
    public static class MatematikaBeraksi {
        public static void main(String[] args) {
            // Membuat objek Matematika
            Matematika matematika = new Matematika();

            // Menghitung dan menampilkan hasil operasi
            int tambahHasil = matematika.tambah(10, 5);
            System.out.println("Hasil Penjumlahan: " + tambahHasil);

            int kurangHasil = matematika.kurang(10, 5);
            System.out.println("Hasil Pengurangan: " + kurangHasil);

            int kaliHasil = matematika.kali(10, 5);
            System.out.println("Hasil Perkalian: " + kaliHasil);

            double bagiHasil = matematika.bagi(10, 5);
            System.out.println("Hasil Pembagian: " + bagiHasil);
        }
    }
}
