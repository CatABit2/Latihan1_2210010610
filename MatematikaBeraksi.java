package hitung;

public class MatematikaBeraksi {
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
