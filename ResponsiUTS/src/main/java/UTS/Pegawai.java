package UTS;
// Class Pegawai
public class Pegawai {
    // Atribut private (enkapsulasi)
    private String namaPegawai;
    private double gaji;
    
    // Constructor
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    // Getter dan Setter
    public String getNamaPegawai() {
        return namaPegawai;
    }
    
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public double getGaji() {
        return gaji;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    // Metode tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + (long)gaji);
    }
}
