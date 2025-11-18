package Tugas11;
// Kelas Pengarang
class Pengarang {
    private String namaPengarang;
    private Pengarang pengarang;
    
    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }
    // Method infoPengarang
    public void infoPengarang() {
        System.out.println("Pengarang: " + namaPengarang);
    }
    
    // Getter untuk pengarang (opsional)
    public Pengarang getPengarang() {
        return pengarang;
    }
}
