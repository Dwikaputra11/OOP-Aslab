/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Dwika
 */
public class Movie {
    private String judul;
    private double alurCerita;
    private double penokohan;
    private double akting;
    private double rating;

    public Movie(String judul, double alurCerita, double penokohan, double akting) {
        this.judul = judul;
        this.alurCerita = alurCerita;
        this.penokohan = penokohan;
        this.akting = akting;
        setRating();
    }
    public Movie(String judul, double alurCerita, double penokohan, double akting,double rating) {
        this.judul = judul;
        this.alurCerita = alurCerita;
        this.penokohan = penokohan;
        this.akting = akting;
        this.rating = rating;
    }

    public Movie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public double getAlurCerita() {
        return alurCerita;
    }

    public void setAlurCerita(double alurCerita) {
        this.alurCerita = alurCerita;
    }

    public double getPenokohan() {
        return penokohan;
    }

    public void setPenokohan(double penokohan) {
        this.penokohan = penokohan;
    }

    public double getAkting() {
        return akting;
    }

    public void setAkting(double akting) {
        this.akting = akting;
    }

    public double getRating() {
        return rating;
    }

    public void setRating() {
        this.rating = (alurCerita + penokohan + akting)/3;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" + "judul=" + judul + ", alurCerita=" + alurCerita + ", penokohan=" + penokohan + ", akting=" + akting + ", rating=" + rating + '}';
    }
    
    
    
}
