package com.tutorial;

public class Polisi extends MobilPolisi{
    String nama;
    int umur;

    public Polisi(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    void displayPolisi(){
        System.out.println("Nama " + nama + " Umur: " + umur);
    }
}
