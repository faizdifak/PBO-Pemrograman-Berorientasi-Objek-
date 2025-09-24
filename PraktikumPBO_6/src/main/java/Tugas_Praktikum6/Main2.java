package Tugas_Praktikum6;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Produk> produkList = new ArrayList<>();
        produkList.add(new Buku("Buku Ensiklopedia", 200000));
        produkList.add(new Elektronik("Televisi", 3000000));
        produkList.add(new Pakaian("Baju Muslim", 15000));
        
        KeranjangBelanja keranjang = new KeranjangBelanja(produkList);
        
        System.out.println("Keranjang Belanja:");
        keranjang.displayKeranjang();
    }
}
