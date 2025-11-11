package Tugas10;
// Kelas Elektronik yang mengimplementasikan interface Pembayaran
public class Elektronik implements Pembayaran {
    
    @Override
    public double hitungPajak(double harga) {
        // Menghitung pajak 10% untuk produk elektronik
        return harga * 0.10;
    }
}
