package Praktikum3;


public class Mobil {
    private String Merk;
    private String Model;
    private int Tahun;
    private String Warna;
    
 public Mobil(String Merk, String Model, int Tahun, String Warna) {
     this.Merk = Merk;
     this.Model = Model;
     this.Tahun = Tahun;
     this.Warna = Warna;
 }
 public String getMerk() {
     return Merk;
 }
 public void setMerk(String Merk) {
     this.Merk = Merk;
 }
 public String getModel() {
     return Model;
 }
 public void setModel(String Model) {
     this.Model = Model;
 }
 public int getTahun() {
     return Tahun;
 }
 public void setTahun(int Tahun) {
     this.Tahun = Tahun;
 }
 public String getWarna() {
     return Warna;
 }
 public void setWarna(String Warna) {
     this.Warna = Warna;
 }
 
  public void displayinfo() {
      System.out.println("Merk Mobil ini adalah " + Merk + " dengan Model " + Model + " dan keluaran tahun " + Tahun + " Berwarna " + Warna);
  }
  public void startEngine() {
      System.out.println("Mesin Mobil " + Merk + " Menyala ");
  }
  public void ubahWarna(String WarnaBaru) {
      this.Warna = WarnaBaru;
      System.out.println("Warna Mobil diubah menjadi " + WarnaBaru);
  }
}
