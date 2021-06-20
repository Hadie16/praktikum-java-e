/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.uniska;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DataType {
    
    public static void main(String[] args){
        String namaDepan = "Ainz";
        String namaTengah = "Ooal";
        String namaBelakang = "Gown";
        int usia = 20;
        int targetTahunKuliah = 4;
        Double ipk = 3.8;
        char nilaiAbjad = 'A';
        boolean tampan = true;
        
        System.out.println("Nama Depan :" + namaDepan);
        System.out.println("Nama Tengah :" + namaTengah);
        System.out.println("Nama Belakang :" + namaBelakang);
        System.out.println("Usia :" + usia);
        System.out.println("Target Kuliah :" + targetTahunKuliah + " tahun");
        System.out.println("IPK : "+ ipk);
        System.out.println("Nilai PBO : " + nilaiAbjad);
        System.out.println("Tampan " + tampan);
        
  // JOptionPane.showMessageDialog( parentComponent null, message "Halo "+namaDepan+" "+namaTengah+" "+namaBelakang, "Ini Judul",JOptionPane.WARNING_MESSAGE);
JOptionPane.showMessageDialog( null, "Halo "+namaDepan+" "+namaTengah+" "+namaBelakang, "Ini Judul",JOptionPane.WARNING_MESSAGE);
    }
}

