package Tugas10;
// Kelas Makanan yang mengimplementasikan interface Pembayaran
public class Makanan implements Pembayaran {
    
    @Override
    public double hitungPajak(double harga) {
        // Menghitung pajak 5% untuk produk makanan
        return harga * 0.05;
    }  
}
