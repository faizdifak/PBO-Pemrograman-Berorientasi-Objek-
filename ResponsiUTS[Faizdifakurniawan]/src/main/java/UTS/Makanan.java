package UTS;
// Class Turunan Makanan
public class Makanan extends Produk {
     private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    // Getter dan Setter
    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    
    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    // Override metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}

