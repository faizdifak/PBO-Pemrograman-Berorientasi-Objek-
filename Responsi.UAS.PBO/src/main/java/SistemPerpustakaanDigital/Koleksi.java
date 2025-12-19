package SistemPerpustakaanDigital;

import java.io.Serializable;
// Kelas Koleksi
public abstract class Koleksi implements Serializable {
    protected String id;
    protected String judul;

    public Koleksi(String id, String judul) {
        this.id = id;
        this.judul = judul;
    }

    public abstract String getInfo();

    public String getJudul() {
        return judul;
    }
}
