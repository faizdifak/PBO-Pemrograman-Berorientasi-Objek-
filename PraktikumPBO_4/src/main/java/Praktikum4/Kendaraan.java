package Praktikum4;

public class Kendaraan {
   String nama; // Hanya bisa diakses dalam class ini
   protected int kecepatanMaks; // Hanya bisa diakses di package yang sama dan subclass
   public String jenisMesin; // Bisa diakses dari mana saja
   
   // Constructor
   public Kendaraan(String nama,int kecepatanMaks, String jenisMesin) {
       this.nama = nama;
       this.kecepatanMaks = kecepatanMaks;
       this.jenisMesin = jenisMesin;
   }
   // Getter dan Setter untuk menampilkan variable private nama
   public String getNama() {
       return nama;
   }
   public void setNama(String nama) {
       this.nama = nama;
   }
   // Method public untuk menampilkan informasi Kendaraan
   public void tampilkaninfoKendaraan() {
       System.out.println("Nama Kendaraan: " + nama);
       System.out.println("Kecepatan Maksimum " + kecepatanMaks + " km/h");
       System.out.println("Jenis Mesin " + jenisMesin);
   }
}
