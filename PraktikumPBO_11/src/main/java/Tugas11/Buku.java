package Tugas11;
// Kelas Buku
class Buku {
    private String judul;
    private Pengarang pengarang;  // Agregasi dengan Pengarang
    
    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;  // Agregasi: Buku memiliki referensi ke Pengarang
    }
    
    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
         if (pengarang != null) {
            pengarang.infoPengarang();  // Memanggil method dari Pengarang
        }
    }   
}
