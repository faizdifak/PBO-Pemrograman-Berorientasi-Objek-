package TugasPraktikum_5;

public class Kucing extends Hewan_Darat {
    String suarakucing;
    
    @Override
    public void tampilkaninfo() {
        super.tampilkaninfo();
        System.out.println("Suara Kucing: " + suarakucing);
    }
}
