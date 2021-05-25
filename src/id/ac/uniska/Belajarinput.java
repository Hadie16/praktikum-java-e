/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.uniska;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Belajarinput {
    
    public static void main(String[] args){
       
        String namaLengkap; //null (ada wadah, tidak ada isi)
        
       Scanner input = new Scanner(System.in);
       
       System.out.println("Masukkan nama Anda : ");
               
        namaLengkap = input.nextLine(); //string
        
        JOptionPane.showMessageDialog( 
            null, "Halo "+namaLengkap, "Informasi",JOptionPane.INFORMATION_MESSAGE);
        
        //System.out.println("Nama Lengkap Anda Adalah "+namaLengkap);
        /* JOptionPane.showMessageDialog(
          null, "Halo " "Ini Judul", JOptionPane.WARNING_MESSAGE); */
       // ambilInputDariJOptionPane()
}
   /* public static void ambilInputDariJOptionPane()
    {
        String name;
        name = JOption.showInputDialog(null, "Mohon Masukkan Nama Anda");
        JOptionPane.showMessageDialog(null, :"Hi " +name );
    }*/
}
