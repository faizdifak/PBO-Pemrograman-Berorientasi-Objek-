package Tugas_praktikum4;

public class Pekerja extends Manusia {
    // Atribut tambahan dengan akses modifier private
    private double Gaji;
    
    // Constructor untuk inisialisasi atribut nama, usia, pekerjaan, dan gaji
    public Pekerja(String nama, int usia, String pekerjaan, double Gaji) {
        super(nama, usia, pekerjaan); // Untuk memanggil constructor dari kelas Manusia
        this.Gaji = Gaji; // inisialisasi atribut Gaji
    }
    
    // Getter untuk atribut Gaji
    public double getGaji(){
        return Gaji;
    }
    
    // Setter untuk atribut Gaji
    public void setgaji(double Gaji){
        this.Gaji = Gaji;
    }
    
    // Override metode toString() untuk menampilkan informasi lengkap
    @Override
    public String toString(){
        return "Identitas pekerja Swalayan " + 
               "\nNama Pekerja :" + getNama() +
               "\nUsia Pekerja :" + usia + 
               "\npekerjaan :" + pekerjaan +
               "\nGaji yang diperoleh: " + Gaji;
    }
}
