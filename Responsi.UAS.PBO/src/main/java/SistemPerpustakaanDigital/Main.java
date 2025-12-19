package SistemPerpustakaanDigital;

import java.util.ArrayList;
import java.util.List;
// Kelas Main
public class Main {
      public static void main(String[] args) {

        try {
            Buku b1 = new Buku("B01", "Pemrograman Java", "James Gosling");
            Buku b2 = new Buku("B02", "Basis Data", "Roberto Santana");
            Buku b3 = new Buku("B03", "Struktur Data", "Mark Allen Weiss");
            Buku b4 = new Buku("B04", "Jaringan Komputer", "Elmasri & Navathe");
            Buku b5 = new Buku("B05", "Algoritma dan Pemrograman", "Abdul Kadir");
            
            Anggota a1 = new Anggota("F01", "Faiz");
            Anggota a2 = new Anggota("A02", "Difa");
            Anggota a3 = new Anggota("A03", "Kurniawan");
           
            List<Buku> bukuDipinjam = new ArrayList<>();
            bukuDipinjam.add(b1);
            bukuDipinjam.add(b5);

            Peminjaman p = new Peminjaman(a1, bukuDipinjam);
            p.pinjam();
            p.kembalikan();

            Perpustakaan perpus = new Perpustakaan();
            perpus.tambahAnggota(a1);
            perpus.tambahAnggota(a2);
            perpus.tambahAnggota(a3);
            perpus.simpanData("anggota.ser");
            perpus.bacaData("anggota.ser");

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan pada sistem.");
        }
    }
}

