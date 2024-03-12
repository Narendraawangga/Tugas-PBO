// Nama : Narendra Awangga
// Nim : 13020220022
// Kelas : A1 
// Hari / Tanggal : Rabu / 6-03-2024
// Waktu pengerjaan : 22.30


import java.util.Scanner;

public class PrintWhile1 {
   
    public static void main(String[] args) {
  
        int N;
        int i = 1;
        Scanner masukan = new Scanner(System.in);
     
        System.out.print("Nilai N >0 = ");
        N = masukan.nextInt();
        System.out.print("Print i dengan WHILE (ringkas): \n");
        while (i <= N) {
            System.out.println(i++);
        }
    }
}