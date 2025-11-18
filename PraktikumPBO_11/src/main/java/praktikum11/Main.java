package praktikum11;
// Kelas Main
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== KOMPOSISI (Perpustakaan - Buku) ===");
        
        // KOMPOSISI: Buku dibuat dalam konteks Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();
        
        // Buku hanya bermakna dalam konteks Perpustakaan
        perpustakaan.tambahBuku(new Buku("Pemrograman Java"));
        perpustakaan.tambahBuku(new Buku("Struktur Data"));
        perpustakaan.tambahBuku(new Buku("Algoritma dan Pemrograman"));
        
        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.infoPerpustakaan();
        
        System.out.println("\n=== AGREGASI (Klub - Anggota) ===");
        
        // AGREGASI: Anggota dapat eksis independen dari Klub
        Anggota anggota1 = new Anggota("Rusdi");
        Anggota anggota2 = new Anggota("Rido");
        Anggota anggota3 = new Anggota("Cantika");
        
        // Anggota dapat digunakan di multiple klub atau tanpa klub
        Klub klubProgramming = new Klub("Programming Club");
        klubProgramming.tambahAnggota(anggota1);
        klubProgramming.tambahAnggota(anggota2);
        
        Klub klubBaca = new Klub("Book Club");
        klubBaca.tambahAnggota(anggota2); // Rido di dua klub
        klubBaca.tambahAnggota(anggota3);
        
        System.out.println("Info Klub Programming:");
        klubProgramming.infoKlub();
        
        System.out.println("\nInfo Klub Baca:");
        klubBaca.infoKlub();
        
        // Demonstrasi anggota tetap ada meski klub dihapus
        System.out.println("\n=== ANGGOTA TETAP ADA SETELAH KLUB ===");
        klubProgramming = null; // Klub dihapus
        System.out.println("Klub Programming dihapus, tapi anggota tetap ada:");
        anggota1.infoAnggota(); // Rusdi masih ada
        anggota2.infoAnggota(); // Rido masih ada
    }
}

