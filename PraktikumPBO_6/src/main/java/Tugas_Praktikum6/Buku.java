package Tugas_Praktikum6;

public class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        return getHarga() * 0.9;
    }
}
