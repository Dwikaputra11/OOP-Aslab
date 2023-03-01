package com.tutorial;

public class Polisi extends MobilPolisi implements Perkerjaan,Kantor{
    String nama;
    int umur;

    public Polisi(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    void displayPolisi(){
        System.out.println("Nama " + nama + " Umur: " + umur);
    }

    @Override
    public void gaji() {
        System.out.println("Gaji " + 500000);
    }

    @Override
    public void namaPekerjaan() {
        System.out.println("Nama pekerjaan polisi");
    }

    @Override
    public void jjj() {

    }
}
