package Tugas11;
import java.util.ArrayList;
import java.util.List;

// Kelas Main
public class Main2 {
    public static void main(String[] args) {
        System.out.println("=== SISTEM PERPUSTAKAAN DENGAN KOMPOSISI & AGREGASI ===\n");
        System.out.println("1. MEMBUAT DATA PENGARANG (AGREGASI)");
        Pengarang pengarang1 = new Pengarang("Andrea Hirata");
        Pengarang pengarang2 = new Pengarang("Tere Liye");
        Pengarang pengarang3 = new Pengarang("Pramoedya Ananta Toer");       
        // Pengarang bisa eksis tanpa buku
        System.out.println("Pengarang yang tersedia:");
        pengarang1.infoPengarang();
        pengarang2.infoPengarang();
        pengarang3.infoPengarang();
        
        System.out.println("\n2. MEMBUAT PERPUSTAKAAN DAN BUKU (KOMPOSISI)");
        Perpustakaan perpustakaan = new Perpustakaan();    
        // Membuat buku dengan pengarang (agregasi)
        // Buku dibuat dalam konteks perpustakaan komposisi)
        System.out.println("\nMenambahkan buku ke perpustakaan:");
        perpustakaan.tambahBuku(new Buku("Laskar Pelangi", pengarang1));
        perpustakaan.tambahBuku(new Buku("Bumi", pengarang2));
        perpustakaan.tambahBuku(new Buku("Bumi Manusia", pengarang3));
        perpustakaan.tambahBuku(new Buku("Sang Pemimpi", pengarang1)); // Pengarang sama, buku berbeda
        // MENAMPILKAN DATA
        perpustakaan.tampilkanSemuaBuku();
        // HUBUNGAN AGREGASI
        System.out.println("\n3. DEMONSTRASI AGREGASI: PENGARANG EKSIS TANPA BUKU");     
        // Pengarang tetap bisa diakses meski tidak terkait dengan buku tertentu
        Pengarang pengarangBaru = new Pengarang("Dee Lestari");
        System.out.println("Pengarang baru yang belum memiliki buku:");
        pengarangBaru.infoPengarang();
        
        System.out.println("\n4.KOMPOSISI Perpustakaan dg buku");
        System.out.println("Sebelum perpustakaan dihapus, jumlah buku: " + perpustakaan.getDaftarBuku().size());
        
        // penghapusan perpustakaan
        perpustakaan = null;
        System.out.println("Setelah perpustakaan dihapus (diberi null):");
        System.out.println("Buku-buku ikut terhapus (tidak bisa diakses lagi)");
    }
}
    
