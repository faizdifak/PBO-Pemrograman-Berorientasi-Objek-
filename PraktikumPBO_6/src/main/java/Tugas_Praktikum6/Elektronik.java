package Tugas_Praktikum6;

public class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        return getHarga() * 0.8;
    }
}
