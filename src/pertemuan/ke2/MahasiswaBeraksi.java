/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.ke2;


import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author ASUS
 */
public class MahasiswaBeraksi {
        public static void main(String[] args ) throws ParseException{//throws ParseException{
            Mahasiswa mhs = new Mahasiswa();
            SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-mm-yyyy");
            
           // Date tglHariIni = new Date()
                    
                    mhs.npm = "19631023";
                    mhs.nama = "Abdul Hadi";
                    //mhs.tanggalLahir = new Date();
                    mhs.tanggalLahir = formatTanggal.parse("16-03-1999");
                    
                    
                    System.out.println("NPM " +mhs.npm);
                    System.out.println("NAMA " +mhs.nama);
                    //System.out.println("TANGGAL LAHIR " +mhs.tanggalLahir);
                    //formatTanggal.format(mhs.tanggalLahir);
                    System.out.println("TANGGAL LAHIR "+ formatTanggal.format(mhs.tanggalLahir));
                    
                    System.out.println("=========================================================");
                    
                    Mahasiswa mhs2 = new Mahasiswa();
                    mhs2.npm = "19631010";
                    mhs2.nama = "Davd Xmays";
                    mhs2.tanggalLahir = formatTanggal.parse("11-11-2001");
                            
                    System.out.println("NPM " +mhs2.npm);
                    System.out.println("NAMA " +mhs2.nama);
                   // formatTanggal.format(mhs2.tanggalLahir);
                    System.out.println("TANGGAL LAHIR "+ formatTanggal.format(mhs2.tanggalLahir));     
/*
      System.out.println("=========================================================");
      System.out.println("Ini yang menggunakan Method");
      System.out.println("=========================================================");
      
      mhs.tampilkanIdentitasDiri();
      mhs2.tampilkanIdentitasDiri();
*/
}
}
