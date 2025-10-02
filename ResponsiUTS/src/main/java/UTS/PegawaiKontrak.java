package UTS;
// Class Turunan PegawaiKontrak
public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak; // dalam bulan
    
    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    // Getter dan Setter
    public int getLamaKontrak() {
        return lamaKontrak;
    }
    
    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }
    
    // Override metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}

