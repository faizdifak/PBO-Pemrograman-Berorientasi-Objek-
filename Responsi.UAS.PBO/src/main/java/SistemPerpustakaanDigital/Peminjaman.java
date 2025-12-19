package SistemPerpustakaanDigital;

import java.io.Serializable;
import java.util.List;
// Kelas Peminjaman
public class Peminjaman implements PeminjamanService, Serializable {
    private Anggota anggota;
    private List<Buku> daftarBuku;

    public Peminjaman(Anggota anggota, List<Buku> daftarBuku) {
        this.anggota = anggota;
        this.daftarBuku = daftarBuku;
    }

    @Override
    public void pinjam() {
        System.out.println("Peminjaman oleh: " + anggota.getNama());
        daftarBuku.forEach(b -> System.out.println(b.getInfo()));
    }

    @Override
    public void kembalikan() {
        System.out.println("Buku dikembalikan oleh: " + anggota.getNama());
    }
}
    

