package TugasPraktikum_5;

public class Anjing extends Hewan_Darat {
    String suaraanjing;
    
    @Override
    public void tampilkaninfo() {
        super.tampilkaninfo();
        System.out.println("Suara Anjing: " + suaraanjing);
    }
}
