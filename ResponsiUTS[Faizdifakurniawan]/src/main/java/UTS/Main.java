package UTS;

public class Main {
     public static void main(String[] args) {
        // 1. Output Produk (Elektronik)
        Elektronik radio = new Elektronik("Radio", 150000, 1);
        System.out.println("1. Output Produk");
        System.out.println("================="); 
        radio.tampilkanInfo();
        System.out.println(); // baris kosong

        // 2. Output Pegawai (PegawaiTetap)
        PegawaiTetap faiz = new PegawaiTetap("Faiz", 5500000, 15000000);
        System.out.println("2. Output Pegawai");
        System.out.println("=================");
        faiz.tampilkanInfo();
        System.out.println();

        // 3. Output Polimorfisme
        System.out.println("3. Output Polimorfisme");
        System.out.println("=================");
        // Produk referensi tapi memegang Makanan (polimorfisme)
        Produk snack = new Makanan("Coklat Silferqueen", 20000, "2025-10-2");
        snack.tampilkanInfo();
        System.out.println();

        // Pegawai referensi tapi memegang PegawaiKontrak (polimorfisme)
        Pegawai difa = new PegawaiKontrak("Difa", 5000000, 10);
        difa.tampilkanInfo();
    }
}

