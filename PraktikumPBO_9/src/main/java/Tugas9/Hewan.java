package Tugas9;

abstract class Hewan {
    abstract void suara();
}

// Kelas turunan Hewan bernama Kucing
class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeluarkan suara: Meong");
    }
}

// Kelas Turunan Hewan Bernama Anjing
class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing mengeluarkan suara: Guk Guk");
    }
}