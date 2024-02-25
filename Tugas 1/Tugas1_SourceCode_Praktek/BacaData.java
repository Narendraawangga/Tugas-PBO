//NIM = 13020220022
//Nama = Narendra Awangga
//Hari/Tanggal = Kamis 23/02/2024
//Waktu Pengerjaan = 11.00 - 14.00

import java.util.Scanner;
public class BacaData {
    
    public static void main(String[] args) {
        int a;
        Scanner masukan;
        System.out.print("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt();
        System.out.print("Nilai yang dibaca : " + a);
    }
}