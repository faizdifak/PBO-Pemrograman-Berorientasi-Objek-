package praktikum5;

public class Mobil extends Kendaraan {
    int jumlahPintu;
    
    @Override
    public void tampilkaninfo() {
        super.tampilkaninfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
