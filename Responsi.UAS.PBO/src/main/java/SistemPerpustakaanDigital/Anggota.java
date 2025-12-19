package SistemPerpustakaanDigital;

import java.io.Serializable;
// Kelas Anggota
public class Anggota implements Serializable {
    private String id;
    private String nama;

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
    

