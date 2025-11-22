/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa1;

/**
 *
 * @author Hawinna
 */
// =============== KELAS UTAMA ===============

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        // ===== Variabel Lokal =====
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa1> data = new ArrayList<>();
        int menu;

        do {
            // ===== MENU =====
            System.out.println("=== MENU MAHASISWA 1 ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {

                case 1:
                    // ===== TAMBAH DATA =====
                    System.out.println("\n--- Tambah Data Mahasiswa ---");

                    System.out.print("NPM   : ");
                    String nim = input.nextLine(); 

                    System.out.print("Nama  : ");
                    String nama = input.nextLine(); 

                    System.out.print("Kelas : ");
                    String kelas = input.nextLine(); 
      
                    Mahasiswa1 m = new Mahasiswa1(nim, nama, kelas);

                    data.add(m);

                    System.out.println("Data berhasil ditambahkan!\n");
                    break;

                case 2:
                    // ===== TAMPILKAN DATA =====
                    System.out.println("\n--- Data Mahasiswa ---");

                    if (data.isEmpty()) {
                        System.out.println("Belum ada data.\n");
                    } else {
                        for (Mahasiswa1 mhs : data) {
                            mhs.tampilkanData();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.\n");
            }

        } while (menu != 3);
    }
}
