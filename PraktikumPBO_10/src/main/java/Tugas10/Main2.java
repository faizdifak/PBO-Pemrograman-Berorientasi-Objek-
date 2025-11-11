package Tugas10;
// Kelas Main
public class Main2 {
    public static void main(String[] args) {
        // Membuat objek Elektronik
        Pembayaran laptop = new Elektronik();
        double hargaLaptop = 8000000;
        double pajakLaptop = laptop.hitungPajak(hargaLaptop);
        double totalLaptop = hargaLaptop + pajakLaptop;
        
        // Membuat objek Makanan
        Pembayaran snack = new Makanan();
        double hargaSnack = 15000;
        double pajakSnack = snack.hitungPajak(hargaSnack);
        double totalSnack = hargaSnack + pajakSnack;
        
        // Menampilkan hasil perhitungan untuk Elektronik
        System.out.println("=== PRODUK ELEKTRONIK ===");
        System.out.println("Harga Produk: Rp " + hargaLaptop);
        System.out.println("Pajak (10%): Rp " + pajakLaptop);
        System.out.println("Total Bayar: Rp " + totalLaptop);
        
        System.out.println("\n=== PRODUK MAKANAN ===");
        System.out.println("Harga Produk: Rp " + hargaSnack);
        System.out.println("Pajak (5%): Rp " + pajakSnack);
        System.out.println("Total Bayar: Rp " + totalSnack);
        
        // Menampilkan total keseluruhan
        System.out.println("\n=== RINGKASAN PEMBAYARAN ===");
        System.out.println("Total Harga Produk: Rp " + (hargaLaptop + hargaSnack));
        System.out.println("Total Pajak: Rp " + (pajakLaptop + pajakSnack));
        System.out.println("Grand Total: Rp " + (totalLaptop + totalSnack));
    }
}
