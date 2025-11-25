package TugasPBO12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SistemManajemenBuku {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> daftarBuku = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== SISTEM MANAJEMEN BUKU ===");

        while (true) {
            tampilkanMenu();
            int pilihan = getPilihanUser();

            switch (pilihan) {
                case 1 -> tambahBuku();
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanDariFileTeks();
                case 5 -> tampilkanDariFileSerial();
                case 6 -> {
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    private static void tampilkanMenu() {
        System.out.println("\n=== MENU UTAMA ===");
        System.out.println("1. Tambah Buku Baru");
        System.out.println("2. Simpan ke File Teks (buku.txt)");
        System.out.println("3. Simpan Objek ke File (buku.ser)");
        System.out.println("4. Tampilkan Buku dari File Teks");
        System.out.println("5. Tampilkan Buku dari File Serialisasi");
        System.out.println("6. Keluar");
        System.out.print("Pilih menu (1-6): ");
    }

    private static int getPilihanUser() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Return -1 untuk input tidak valid
        }
    }

    // 1. Tambah Buku Baru
    private static void tambahBuku() {
        System.out.println("\n--- TAMBAH BUKU BARU ---");
        
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        
        System.out.print("Masukkan nama pengarang: ");
        String pengarang = scanner.nextLine();
        
        System.out.print("Masukkan tahun terbit: ");
        try {
            int tahunTerbit = Integer.parseInt(scanner.nextLine());
            
            // Buat objek buku baru dan tambahkan ke daftar
            Buku bukuBaru = new Buku(judul, pengarang, tahunTerbit);
            daftarBuku.add(bukuBaru);
            
            System.out.println("✓ Buku berhasil ditambahkan!");
            bukuBaru.tampilkanInfo();
            
        } catch (NumberFormatException e) {
            System.out.println("✗ Tahun terbit harus berupa angka!");
        }
    }

    // 2. Simpan ke File Teks
    private static void simpanKeFileTeks() {
        if (daftarBuku.isEmpty()) {
            System.out.println("✗ Tidak ada buku untuk disimpan!");
            return;
        }

        // Gunakan try-with-resources untuk memastikan file ditutup otomatis
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku buku : daftarBuku) {
                writer.write(buku.toString() + "\n");
            }
            System.out.println("✓ Data buku berhasil disimpan ke " + TEXT_FILE);
            
        } catch (IOException e) {
            System.out.println("✗ Terjadi kesalahan saat menyimpan ke file teks:");
            e.printStackTrace();
        }
    }

    // 3. Simpan Objek ke File (Serialisasi)
    private static void simpanKeFileSerial() {
        if (daftarBuku.isEmpty()) {
            System.out.println("✗ Tidak ada buku untuk disimpan!");
            return;
        }

        // Gunakan try-with-resources untuk memastikan file ditutup otomatis
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(SERIAL_FILE))) {
            
            oos.writeObject(daftarBuku);
            System.out.println("✓ Objek buku berhasil disimpan ke " + SERIAL_FILE);
            
        } catch (IOException e) {
            System.out.println("✗ Terjadi kesalahan saat serialisasi:");
            e.printStackTrace();
        }
    }

    // 4. Tampilkan Buku dari File Teks
    private static void tampilkanDariFileTeks() {
        System.out.println("\n--- BUKU DARI FILE TEKS ---");
        
        // Gunakan try-with-resources untuk memastikan file ditutup otomatis
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            int counter = 1;
            
            while ((line = reader.readLine()) != null) {
                // Parse data dari format: Judul;Pengarang;Tahun
                String[] data = line.split(";");
                if (data.length == 3) {
                    System.out.println(counter + ". " + 
                                     "Judul: " + data[0] + 
                                     ", Pengarang: " + data[1] + 
                                     ", Tahun: " + data[2]);
                    counter++;
                }
            }
            
            if (counter == 1) {
                System.out.println("✗ Tidak ada data buku di file teks.");
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("✗ File " + TEXT_FILE + " belum dibuat.");
        } catch (IOException e) {
            System.out.println("✗ Terjadi kesalahan saat membaca file teks:");
            e.printStackTrace();
        }
    }

    // 5. Tampilkan Buku dari File Serialisasi
    @SuppressWarnings("unchecked")
    private static void tampilkanDariFileSerial() {
        System.out.println("\n--- BUKU DARI FILE SERIALISASI ---");
        
        // Gunakan try-with-resources untuk memastikan file ditutup otomatis
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(SERIAL_FILE))) {
            
            List<Buku> bukuDariFile = (List<Buku>) ois.readObject();
            int counter = 1;
            
            for (Buku buku : bukuDariFile) {
                System.out.print(counter + ". ");
                buku.tampilkanInfo();
                counter++;
            }
            
            if (counter == 1) {
                System.out.println("✗ Tidak ada data buku di file serialisasi.");
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("✗ File " + SERIAL_FILE + " belum dibuat.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("✗ Terjadi kesalahan saat deserialisasi:");
            e.printStackTrace();
        }
    }
}

