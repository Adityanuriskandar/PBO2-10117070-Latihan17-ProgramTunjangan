/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * Nama                 : Aditya Nur Iskandar
 * Kelas                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program yang berisi tentang mengetahui coding soal
 * Program Tunjangan.
 */
public class PBO210117070Latihan17ProgramTunjangan {
    
    public static void main(String[] args) {
        
        double gajiPokok;
        double tunjangan;
        double totalGaji;
        
        String status;
        String status1 = "Menikah";
        String status2 = "Belum";
        tunjangan = 0;
        
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        Scanner semua = new Scanner(System.in);
        gajiPokok = semua.nextDouble();
        System.out.print("Status anda ? (Menikah/Belum)\t: ");
        Scanner st = new Scanner(System.in);
        status = st.next();
        System.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok\t: "+ gajiPokok);
        if(status.equals(status2)){
            System.out.println("Tunjangan\t: "+tunjangan);
        }else{
            tunjangan = gajiPokok*0.35;
            System.out.println("Tunjanagan\t: "+tunjangan);
        }
        totalGaji = tunjangan + gajiPokok;
        System.out.println("Total gaji\t: "+totalGaji);
        
       
    }
    
}
