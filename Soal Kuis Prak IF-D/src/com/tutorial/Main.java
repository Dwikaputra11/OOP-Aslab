package com.tutorial;

import java.util.PropertyResourceBundle;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String strip = "-".repeat(40);
    private static Pengunjung pengunjung;

    public static void main(String[] args) {

        /*
        * Masukkan Nama pada variabel nama dan 3 Angka terakhir NIM pada variabel plat kendaraan
        * Contoh:
        * nama: Dwika Putra
        * NIM: 123200112 (0112)
        * pengunjung = new Pengunjung(jamMasuk, jamKeluar,nama, platKendaraan);
        * */

        showMenu();

    }

    private static void showMenu() {
        int option = 0;

        while (option != 3){
            System.out.println(strip);
            System.out.println("MENU LAYANAN");
            System.out.println(strip);
            System.out.println("Menu");
            System.out.println("1. Lihat Data Pengunjung");
            System.out.println("2. Lihat Total Tagihan");
            System.out.println("0. Tutup Aplikasi");
            System.out.println("------------------------------------");
            System.out.print("Pilih menu: "); option = scanner.nextInt();

            switch (option){
                case 1 ->{
                    // tampilakan pengunjung pada class Pengunjung
                }
                case 2 ->{
                    // tampilakan total tagihan pada class Pengunjung
                }
                case 3 ->{
                    System.out.println("Terima kasih sudah menggunakan program ini.");
                }
                default -> {
                    System.out.println("Pilihan tidak tersedia, silahkan mengulang input!");
                }
            }
        }
    }
}
