package UTS;
// Class Produk
public class Produk {
     // Atribut private (enkapsulasi)
    private String namaProduk;
    private double harga;
    
    // Constructor
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    // Getter dan Setter
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Metode tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + (long)harga); // tampilkan tanpa desimal jika bilangan bulat
    }
}
