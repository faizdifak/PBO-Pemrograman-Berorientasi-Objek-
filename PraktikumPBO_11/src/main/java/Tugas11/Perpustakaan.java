package Tugas11;
import java.util.ArrayList;
import java.util.List;
// Kelas Perpustakaan
class Perpustakaan {
    private List<Buku> daftarBuku;  // Komposisi dengan Buku
    
    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();  // Inisialisasi list buku (array)
    }
    
    // Method untuk menambahkan buku (komposisi)
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku '" + "judul" + "' berhasil ditambahkan ke perpustakaan");
    }
    
    // Method untuk menampilkan semua buku
    public void tampilkanSemuaBuku() {
        System.out.println("\n=== DAFTAR BUKU DI PERPUSTAKAAN ===");
        if (daftarBuku.isEmpty()) {
            System.out.println("Perpustakaan kosong.");
        } else {
            for (int i = 0; i < daftarBuku.size(); i++) {
                System.out.print((i + 1) + ". ");
                daftarBuku.get(i).infoBuku();
                System.out.println("-------------------");
            }
        }
    }
    // Getter untuk daftar buku
    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }
}


