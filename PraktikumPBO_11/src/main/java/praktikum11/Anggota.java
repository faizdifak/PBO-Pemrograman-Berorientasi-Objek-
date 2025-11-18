package praktikum11;

import java.util.ArrayList;
import java.util.List;
// Kelas Anggota
class Anggota {
     private String nama; 
 
    public Anggota(String nama) { 
        this.nama = nama; 
    } 
 
    public void infoAnggota() { 
        System.out.println("Nama Anggota: " + nama); 
    } 
}

// Kelas Klub
class Klub {
    private String namaKlub; 
    private List<Anggota> anggotaList; 
 
    public Klub(String namaKlub) { 
        this.namaKlub = namaKlub; 
        this.anggotaList = new ArrayList<>(); 
    } 
 
    public void tambahAnggota(Anggota anggota) { 
        anggotaList.add(anggota); 
    } 
 
    public void infoKlub() { 
        System.out.println("Nama Klub: " + namaKlub); 
        for (Anggota anggota : anggotaList) { 
            anggota.infoAnggota(); 
        } 
    }
}