package Evaluasi.HitungNilai;
//Nama : Narendra Awangga
//Nim  : 13020220022
//Kelas : A1 Teknik Informatika
//Tugas : 4 Evaluasi Praktikum

public class HitungNilaiAkhir {

 
    public double nilaiTugas(int tugas1, int tugas2) {
       
        return (tugas1 + tugas2) / 2.0;
    }


    public double nilaiAkhir(double tugas, int mid, int uas) {
       
        return (tugas * 0.4) + (mid * 0.3) + (uas * 0.3);
    }
}
