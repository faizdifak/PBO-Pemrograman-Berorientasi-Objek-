package SistemPerpustakaanDigital;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
// Kelas Perpustakaan
public class Perpustakaan {
    private List<Anggota> anggotaList = new ArrayList<>();

    public void tambahAnggota(Anggota a) {
        anggotaList.add(a);
    }

    public void simpanData(String file) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(anggotaList);
            System.out.println("Data anggota berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data!");
        }
    }

    @SuppressWarnings("unchecked")
    public void bacaData(String file) {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {
            anggotaList = (List<Anggota>) ois.readObject();
            System.out.println("Data anggota berhasil dibaca.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca data!");
        }
    }
}

