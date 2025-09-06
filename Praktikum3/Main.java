package Praktikum3;


public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Mimi", 3);
        kucing.suara();
        kucing.info();
        
        Hewan Anjing = new Hewan("Azril", 4);
        Anjing.berlari();
        Anjing.info();
    }
}
