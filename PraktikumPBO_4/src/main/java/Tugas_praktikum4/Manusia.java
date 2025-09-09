package Tugas_praktikum4;


public class Manusia {
    // Atribut dengan akses Modifier sesuai ketentuan
    private String nama; // Hanya bisa diakses dari dalam kelas ini
    protected int usia; // Bisa diakses dari kelas ini dan subclass
    public String pekerjaan; // Bisa diakses dari mana saja
    
    // Constructor untuk inisialisasi atribut
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    
    // Getter sebagai atribut nama
    public String getNama() {
        return nama;
    }
    
    // Setter sebagai atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}
