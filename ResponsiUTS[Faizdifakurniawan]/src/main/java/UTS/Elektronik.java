package UTS;
// Class Turunan Elektronik
public class Elektronik extends Produk {
    private int garansi; // dalam tahun
    
    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga); // memanggil constructor parent class
        this.garansi = garansi;
    }
    
    // Getter dan Setter
    public int getGaransi() {
        return garansi;
    }
    
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    // Override metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // memanggil metode parent
        System.out.println("Garansi: " + garansi + " tahun");
    }
}


