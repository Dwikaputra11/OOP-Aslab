package com.tutorial;

public class Pengunjung {
    private final int jamMasuk;
    private final int jamKeluar;
    private final String nama;
    private final String platKendaraan;
    private final String strip = "-".repeat(40);


    public Pengunjung(int jamMasuk, int jamKeluar, String nama, String platKendaraan) {
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
        this.nama = nama;
        this.platKendaraan = platKendaraan;
    }

    public void showProfile(){
        /*
         * Tampilkan semua data dari pengunjung:
         * yang ditampilkan terdiri dari:
         * - Nama pengunjung
         * - Plat kendaraan
         * - Jam Masuk
         * - Jam Keluar
         * */

        System.out.println(strip);
        System.out.println("DATA PENGUNJUNG");
        System.out.println(strip);

        System.out.print("Nama pengunjung: ");
        System.out.print("Plat Kendaraan: ");
        System.out.print("Jam Masuk: ");
        System.out.print("Jam Keluar: ");

    }

    public void showTotalBill(){
        /*
         * Tampilkan total tagihan bayar parkir dari pengunjung dengan ketentuan:
         * 2 jam awal yaitu Rp 2000 dan jam berikutnya ditambah 1000
         *
         * yang ditampilkan terdiri dari:
         * - Nama pengunjung
         * - Plat kendaraan
         * - Total tagihan
         * */

        System.out.println(strip);
        System.out.println("TOTAL TAGIHAN PARKIR");
        System.out.println(strip);

        System.out.print("Nama pengunjung: ");
        System.out.print("Plat Kendaraan: ");
        System.out.print("Total Tagihan: Rp ");
    }

}
