package TugasPraktikum_5;


public class Main1 {
     public static void main(String[] args) {
         Kucing kucing = new Kucing();
         kucing.nama = "Kucing";
         kucing.jenis = "Anggora";
         kucing.suarakucing = "Meong-meong";
         kucing.Habitat = "Darat";
         kucing.tampilkaninfo();
         
         Anjing anjing = new Anjing();
         anjing.nama = "Anjing";
         anjing.jenis = "Buldog";
         anjing.suaraanjing = "Houg-Houg";
         anjing.Habitat = "Darat";
         anjing.tampilkaninfo();
     }
}
