package praktikum9;

// Definisi kelas abstrak
abstract class Kendaraan {
    // Method abstract
    abstract void berjalan();
    
    // Method dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}

// Kelas turunan dari Kendaraan
class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}

// Kelas turunan dari Kendaraan
class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan dengan pelan.");
    }
}