/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Hewan {
    String nama, jenis;
    int jumlahKaki;
    Date tanggalLahir;

    public Hewan(String nama, String jenis, int jumlahKaki/*, Date tanggalLahir) throws ParseException*/) 
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
        this.nama = nama;
        this.jenis = jenis;
        this.jumlahKaki = jumlahKaki;
        //this.tanggalLahir = simpleDateFormat.parse(tanggalLahir.toString());
        //System.out.println("Halo");
        
       /* try{
            this.tanggalLahir = simpleDateFormat.parse(tanggalLahir.toString());
        }catch(ParseException e)
        {
            System.err.println("Kesalahan pada Tanggal Lahir");
        }*/
            System.out.println(nama+" "+jenis+" "+jumlahKaki);
        }
    }
  
