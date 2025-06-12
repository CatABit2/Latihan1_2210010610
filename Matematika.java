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

    // Method setPengurangan yang mengembalikan hasil pengurangan bil1 - bil2
    public double setPengurangan() {
        return bil1 - bil2;
    }

    // Method setPerkalian yang mengembalikan hasil perkalian bil1 * bil2
    public double setPerkalian() {
        return bil1 * bil2;
    }

    // Method setPembagian yang mengembalikan hasil pembagian bil1 / bil2
    public double setPembagian() {
        if (bil2 != 0) {
            return bil1 / bil2;
        } else {
            System.out.println("Pembagi tidak boleh nol");
            return 0; // Mengembalikan 0 jika bil2 adalah 0
        }
    }

    // Kelas MatematikaBeraksi yang berisi method main
    static class MatematikaBeraksi {
        public static void main(String[] args) {
            // Membuat objek Matematika dan menginisialisasi dengan dua digit terakhir NPM (10 dan 10)
            Matematika aldi = new Matematika(10, 10);

            // Menampilkan hasil penjumlahan
            double hasilPenjumlahan = aldi.setPenjumlahan();
            System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);

            // Menampilkan hasil pengurangan
            double hasilPengurangan = aldi.setPengurangan();
            System.out.println("Hasil Pengurangan: " + hasilPengurangan);

            // Menampilkan hasil perkalian
            double hasilPerkalian = aldi.setPerkalian();
            System.out.println("Hasil Perkalian: " + hasilPerkalian);

            // Menampilkan hasil pembagian
            double hasilPembagian = aldi.setPembagian();
            System.out.println("Hasil Pembagian: " + hasilPembagian);
        }
    }
}
