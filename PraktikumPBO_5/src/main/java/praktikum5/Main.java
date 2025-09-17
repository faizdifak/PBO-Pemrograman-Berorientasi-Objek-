package praktikum5;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Avanza";
        mobil.kecepatan = 200;
        mobil.jumlahPintu = 4;
        mobil.tampilkaninfo();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Suzuki";
        motor.kecepatan = 150;
        motor.jenisMesin = "2-tak";
        motor.tampilkaninfo();
    }
}
