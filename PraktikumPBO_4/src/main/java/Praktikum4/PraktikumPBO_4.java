package Praktikum4;


public class PraktikumPBO_4 {
    
    public static void main(String[] args) {
        // Membuat objek dari kelas kendaraan
        Kendaraan Lala = new Kendaraan("Toyota Avanza", 500, "Bensin");
        // menampilkan informasi kendaraan menggunakan metode tampilkaninfoKendaraan
        Lala.tampilkaninfoKendaraan();
        
        // Membuat objek dari kelas mobil
        Mobil Milmil = new Mobil("Range Rover", 600, "Electric Vehicle", 4);
        Milmil.tampilkaninfoMobil();
    }
}
