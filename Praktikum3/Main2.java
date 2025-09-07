package Praktikum3;

public class Main2 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil ("Hyundai", "Stargazer", 2022, "Kuning");
        Mobil mobil2 = new Mobil ("Toyota", "Kijang", 1977, "Hitam");
        
        mobil1.displayinfo();
        mobil1.startEngine();
        mobil1.ubahWarna("Biru");
        mobil1.displayinfo();
        
        mobil2.displayinfo();
        mobil2.startEngine();
        mobil2.ubahWarna("Hijau");
        mobil2.displayinfo();
    }
}
