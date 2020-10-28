/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan22.perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Perhitungan Lingkaran
 */
public class PBOIF210119060Latihan22PerhitunganLingkaran {
    public static double hitungJariJari(int diameter){
        double JariJari = diameter/2;
        return JariJari;
}
    public static double hitungLuas(double diameter) {
        double JariJari = diameter/2;
        double luas = 3.14 * JariJari * JariJari;
        return luas;
        
    }
      public static double hitungkeliling(double diameter) {
        double JariJari = diameter/2;
        double keliling = 2 * 3.14 * JariJari;
        return keliling;
      }
    public static void main(String[] args) {
        int diameter=0;
        String konversiAngka;
        boolean kondisi = true;
        
        Scanner input = new Scanner(System.in);
        System.out.println("=====Perhitungan Lingkaran=====");
        do{
        System.out.print("Masukan Nilai diameter Lingkaran :");
        
        konversiAngka = input.next();
            if(konversiAngka.matches("[0-9]*")){
                diameter = Integer.parseInt(konversiAngka);
                kondisi = true;
            }else{
                System.err.println("Nilai tidak sesuai!");
                kondisi = false;
                
            }
        }while (!kondisi);
       
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran ="+hitungJariJari(diameter) + "cm");
        System.out.println("Luas Lingkaran ="+hitungLuas(diameter) + "cm");
        System.out.println("Keliling Lingkaran ="+hitungkeliling(diameter) + "cm");
        
    }
    
}
