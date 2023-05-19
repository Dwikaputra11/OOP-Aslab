/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import main.Movie;
import model.MovieModel;
import view.MovieView;

/**
 *
 * @author Dwika
 */
public class MovieController {
    
    private ArrayList<Movie> list;
    private String judul;
    private double alur;
    private double akting;
    private double penokohan;
    private double rating;
    
    public MovieController(MovieView view, MovieModel model){
        
        if(model.isContainMovie()){
            list = model.getMovie();
            String [][] data = convertData(list);
            view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
        }else{
            JOptionPane.showMessageDialog(null, "Movie belum tersedia");
        }
        view.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String judul = view.getJudul();
               double alur = view.getAlur();
               double penokohan = view.getPenokohan();
               double akting = view.getAkting();
               if(isValid(alur, penokohan, akting)){
                Movie movie = new Movie(judul,alur,penokohan,akting);
                model.insertMovie(movie);   
               };
               list = model.getMovie();
               System.out.println(list.get(0).getJudul());
               String [][] data = convertData(list);
               view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
            }
        });
        
        view.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("btnUpdate");
               judul = view.getJudul();
               alur = view.getAlur();
               penokohan = view.getPenokohan();
               akting = view.getAkting();
               Movie movie = new Movie(judul, alur, penokohan, akting);
//                System.out.println(movie.getAkting());
               model.updateMovie(movie);
               list = model.getMovie();
               String [][] data = convertData(list);
               view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
            }
        });
        
        view.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = view.getJudul();
                model.deleteMovie(judul);
                list = model.getMovie();
                String[][] data = convertData(list);
                view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
            }
        });
        
        view.tabel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                int baris = view.tabel.getSelectedRow();
                int kolom = view.tabel.getSelectedColumn();
                judul = view.tabel.getValueAt(baris, 0).toString(); 
                alur = Double.valueOf(view.tabel.getValueAt(baris, 1).toString());
                penokohan = Double.valueOf(view.tabel.getValueAt(baris, 2).toString());
                akting = Double.valueOf(view.tabel.getValueAt(baris, 3).toString());
                
                view.tfJudul.setText(judul);
                view.tfAlur.setText(String.valueOf(alur));
                view.tfPenokohan.setText(String.valueOf(penokohan));
                view.tfAkting.setText(String.valueOf(akting));
            }
            
        });
        
        view.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.tfJudul.setText("");
                view.tfAlur.setText("");
                view.tfPenokohan.setText("");
                view.tfAkting.setText("");
            }
        });
    }
    
    private boolean isValid(double alur, double penokohan, double akting){
        if((alur >= 0) && (penokohan >= 0) && (akting >= 0) && (alur <= 5) && (penokohan <= 5) && (akting <= 5))
            return true;
        else 
            return false;
    }
    private String[][] convertData(ArrayList<Movie> list){
        String[][] data = new String[list.size()][5];
        
        for(int i = 0; i < list.size(); i++){
            data[i][0] = list.get(i).getJudul();
            data[i][1] = String.valueOf(list.get(i).getAlurCerita());
            data[i][2] = String.valueOf(list.get(i).getPenokohan());
            data[i][3] = String.valueOf(list.get(i).getAkting());
            data[i][4] = String.valueOf(list.get(i).getRating());
        }
        
        return data;
    }
}