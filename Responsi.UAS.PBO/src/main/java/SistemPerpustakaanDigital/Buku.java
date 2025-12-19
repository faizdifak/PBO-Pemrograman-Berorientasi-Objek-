package SistemPerpustakaanDigital;

// Kelas Buku
public class Buku extends Koleksi {
    private String penulis;

    public Buku(String id, String judul, String penulis) {
        super(id, judul);
        this.penulis = penulis;
    }

    @Override
    public String getInfo() {
        return "Buku: " + judul + " | Penulis: " + penulis;
    }
}
    

