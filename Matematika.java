package hitung;

public class Matematika {

    // Variabel bertipe double
    private double bil1;
    private double bil2;

    // Konstruktor untuk mengisi nilai variabel bil1 dan bil2
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    // Method setPenjumlahan yang mengembalikan hasil penjumlahan bil1 + bil2
    public double setPenjumlahan() {
        return bil1 + bil2;
    }

    // Kelas MatematikaBeraksi yang berisi method main
    public static class MatematikaBeraksi {
        public static void main(String[] args) {
            // Membuat objek Matematika dan menginisialisasi bil1 dan bil2
            Matematika matematika = new Matematika(10.5, 5.5);

            // Menghitung dan menampilkan hasil penjumlahan
            double hasilPenjumlahan = matematika.setPenjumlahan();
            System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        }
    }
}
