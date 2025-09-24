package Praktikum6;

public class Main {
    public static void main(String[] args) {
        Hewan Lili = new Kucing();
        Lili.bersuara();
        
        Kucing kucing = new Kucing();
        kucing.makan("ikan");         // Memanggil method makan() dari kelas Hewan
        kucing.makan("ikan", 3);     // Memanggil versi method makan() dengan parameter tambahan(overload)

        Anjing anjing = new Anjing();
        anjing.bersuara();            // Memanggil method bersuara() dari kelas Anjing yang menghasilkan overload
        anjing.makan("daging", 3);    // Memanggil versi method makan() yang sudah dioverload pada kelas Hewan
    }
}
