/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

/**
 *
 * @author TUF
 */
import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();

        System.out.println("Masukkan jumlah data yang ingin dimasukkan:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan kunci:");
            String key = scanner.nextLine();
            System.out.println("Masukkan nilai:");
            int value = scanner.nextInt();
            scanner.nextLine(); 
            hashMap.put(key, value);
        }

        System.out.println("HashMap yang telah dibuat:");
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
    }
}
