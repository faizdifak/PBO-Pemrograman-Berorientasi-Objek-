package TugasPraktikum_5;

public class Hewan_Darat extends Hewan {
    String Habitat;
    
    @Override
    public void tampilkaninfo() {
        super.tampilkaninfo();
        System.out.println("Habitan Hewan ini di: " + Habitat);
    }
}
