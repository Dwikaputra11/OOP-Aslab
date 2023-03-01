package com.tutorial;

public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Mhs", "2387283", 12);
//        mhs.showMhs();
//        mhs.orangTua();


        Polisi polisi = new Polisi("Budi", 50);
//        polisi.displayPolisi();
//        polisi.displayMobilPolisi();
//        polisi.displayMobil();
        polisi.namaPekerjaan();
        polisi.gaji();


        OperasiMatematika matematika = new OperasiMatematika();

//        matematika.kali(12, 20);
//        matematika.kali();
//        matematika.kali(12.2, 13.4);

        System.out.println();
//        mhs.bernafas();
    }
}
