/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.uniska;

/**
 *
 * @author ASUS
 */
public class BelajarString {
    
       public static void main(String[] args){
            char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
             String uniskaString = new String(uniskaChar);
             System.out.println(uniskaString);
             
           /*System.out.println(uniskaChar[0]);
           System.out.println(uniskaChar[1]);
           System.out.println(uniskaChar[2]);
           System.out.println(uniskaChar[3]);
           System.out.println(uniskaChar[4]);
           System.out.println(uniskaChar[5]);*/
           
           //----------------------------------
           
        String namaDepan = "Ainz";
        String namaTengah = "Ooal";
        String namaBelakang = "Gown";
        
        String namaLengkap = namaDepan + " "+ namaTengah+ " "+ namaBelakang;
        
        System.out.println(namaLengkap.length()); // mengetahui panjang karakter
        System.out.println(namaBelakang.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5)); // menghilangkan karakter dari nama depan sebanyak n
        System.out.println(namaLengkap.substring(5, 12)); // menghilangkan karakter dari nama depan dan belakang sebanyak n
        System.out.println(namaLengkap.replace("Ooal", "Laoo")); // me replace target dengan string yg di berikan
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));
    
        
        String[] namaArray = namaLengkap.split(" ");
        System.out.println(namaArray.length);
        for (String nama : namaArray)
        {
            System.out.println(nama);
        }
       }

}
