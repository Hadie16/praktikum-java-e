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
public class MahasiswaBeraksiMethod {
        public static void main(String[] args) throws ParseException{
  
            Mahasiswa mhs2 = new Mahasiswa();
                    SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-mm-yyyy");
                    mhs2.npm = "19631010";
                    mhs2.nama = "Davd Xmays";
                    mhs2.tanggalLahir =  formatTanggal.parse("11-11-2001");
                    
                    mhs2.tampilkanIdentitasDiri();
                    
                    System.out.println("Usia "+mhs2.nama+ " adalah "+mhs2.hitungUsia()+" tahun");
                    
            System.out.println(mhs2.hitungKali(7, 9));
            
            mhs2.SapaNama("Davd Xmays");
}
}
