package Evaluasii;

import Evaluasi.HitungNilai.HitungNilaiAkhir;
import Evaluasi.Mahasiswaa.Identitas;
import Evaluasi.Mahasiswaa.Nilai;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Utama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Input nama dan stambuk menggunakan Scanner
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan stambuk: ");
        String stambuk = scanner.nextLine();

        // b. Input nilai tugas1, tugas2, mid, dan uas menggunakan Scanner
        System.out.print("Masukkan nilai tugas1: ");
        int tugas1 = scanner.nextInt();
        System.out.print("Masukkan nilai tugas2: ");
        int tugas2 = scanner.nextInt();
        System.out.print("Masukkan nilai mid: ");
        int mid = scanner.nextInt();
        System.out.print("Masukkan nilai uas: ");
        int uas = scanner.nextInt();

        // c. Set nilai nama dan stambuk pada class Identitas
        Identitas identitas = new Identitas();
        identitas.setNama(nama);
        identitas.setStambuk(stambuk);

        // d. Set nilai tugas1, tugas2, mid, dan uas pada class Nilai
        Nilai nilai = new Nilai();
        nilai.setTugas1(tugas1);
        nilai.setTugas2(tugas2);
        nilai.setMid(mid);
        nilai.setUas(uas);

        // Hitung nilai tugas rata-rata
        double tugasRata = (nilai.getTugas1() + nilai.getTugas2()) / 2.0;

        // Hitung nilai akhir
        HitungNilaiAkhir hitungNilaiAkhir = new HitungNilaiAkhir();
        double na = hitungNilaiAkhir.nilaiAkhir(tugasRata, nilai.getMid(), nilai.getUas());

        // e. Tampilkan hasil menggunakan JOptionPane
        String message = "Nama: " + identitas.getNama() + "\nStambuk: " + identitas.getStambuk() +
                "\nNilai Tugas: " + tugasRata + "\nNilai Mid: " + nilai.getMid() +
                "\nNilai UAS: " + nilai.getUas() + "\nNilai Akhir: " + na;
        JOptionPane.showMessageDialog(null, message);
    }
}
