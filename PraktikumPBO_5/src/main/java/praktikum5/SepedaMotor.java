package praktikum5;

public class SepedaMotor extends Kendaraan {
    String jenisMesin;
    
    @Override
    public void tampilkaninfo() {
        super.tampilkaninfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
