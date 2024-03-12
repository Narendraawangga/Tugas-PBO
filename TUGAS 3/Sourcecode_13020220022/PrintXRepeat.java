// Nama : Narendra Awangga
// Nim : 13020220022
// Kelas : A1 
// Hari / Tanggal : Rabu / 6-03-2024
// Waktu pengerjaan : 22.30


import java.util.Scanner;

public class PrintXRepeat {
 
    public static void main(String[] args) {
  
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan nilai x (int), akhiri dgn 999 : ");
        x = masukan.nextInt(); 
        if (x == 999) {
            System.out.print("Kasus kosong \n");
        } else { 
            Sum = 0;
            do {
                Sum = Sum + x; 
                System.out.print("Masukkan nilai x (int), akhiri dgn 999 : ");
                x = masukan.nextInt(); 
            } while (x != 999);
            System.out.println("Hasil penjumlahan = " + Sum);

        }
    }
}