package Tugas_Praktikum6;

public class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        return getHarga() * 0.85;
    }
}
