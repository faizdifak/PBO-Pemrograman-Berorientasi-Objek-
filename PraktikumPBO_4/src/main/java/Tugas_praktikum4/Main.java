package Tugas_praktikum4;


public class Main {
    
    public static void main(String[] args) {
        // Membuat objek dari kelas pekerja
        Pekerja pekerja = new Pekerja("Ravi", 25, "Pelayan", 1500000);
        
        // Menampilkan informasi pekerja menggunakan metode toString()
        System.out.println("Informasi Pekerja Awal: ");
        System.out.println(pekerja.toString());
        
        // Mengubah nama pekerja menggunkan metode Setter
        pekerja.setNama("Faiz");
        
        // Menampilkan ulang informasi pekerja setelah perubahan nama
        System.out.println("\nInformasi Pekerja Setelah dirubah Nama: ");
        System.out.println(pekerja.toString());    
    }   
}
