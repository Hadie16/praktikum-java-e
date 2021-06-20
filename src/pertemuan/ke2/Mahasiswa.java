/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.ke2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    
    String npm, nama; //property
    Date tanggalLahir;//property
    
    void tampilkanIdentitasDiri()//procedure, method
    {
            
       SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
       System.out.println("NPM " +this.npm);
       System.out.println("NAMA " +this.nama);
       System.out.println("TANGGAL LAHIR "+ sdf.format(this.tanggalLahir));  
}
    int hitungUsia()//function, method
    {
    Calendar tglLahir = Calendar.getInstance();
    tglLahir.setTime(this.tanggalLahir);
    Calendar hariIni = Calendar.getInstance();
    
    int selisih = hariIni.get(Calendar.YEAR) - tglLahir.get(Calendar.YEAR);
    if(hariIni.get(Calendar.MONTH)< tglLahir.get(Calendar.MONTH)){
        selisih--;
    }else{
        if(hariIni.get(Calendar.MONTH) == tglLahir.get(Calendar.MONTH)
                &&
                hariIni.get(Calendar.DAY_OF_MONTH)< tglLahir.get(Calendar.DAY_OF_MONTH)){
            selisih --;
        }
    }
    return selisih;
    
    }
    double hitungKali(double nilai1, double nilai2)//parameter in ( )
    { 
        return nilai1 * nilai2;
                }
    void SapaNama(String nama)
    {
          JOptionPane.showMessageDialog( 
            null, "Hai "+nama, "Informasi",JOptionPane.INFORMATION_MESSAGE);
    }
    
}   
            


