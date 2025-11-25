package TugasPBO12;

import java.io.*; 
// Kelas Buku yang dapat diserialisasi
public class Buku implements Serializable {
     private static final long serialVersionUID = 1L; // Versi awal untuk mempermudah Kalau ada perubahan besar, naikkan versi:
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    // Constructor
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Getter methods
    public String getJudul() { return judul; }
    public String getPengarang() { return pengarang; }
    public int getTahunTerbit() { return tahunTerbit; }

    // Method untuk menampilkan info buku
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit);
    }

    // Method untuk format teks (untuk file txt)
    @Override
    public String toString() {
        return judul + ";" + pengarang + ";" + tahunTerbit;
    }
}


