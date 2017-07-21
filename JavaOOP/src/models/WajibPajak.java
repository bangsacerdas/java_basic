/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.FormatClass;

/**
 *
 * @author jupiterzhuo
 */
public class WajibPajak extends Person{
   
    private double gaji;
    final static double TARIF =0.1;

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
   
    
    public WajibPajak() {
        super();
        System.out.println("Call Constructor Wajib Pajak"); 
    }
    
     public double hitungPajak(){
         //return gaji*TARIF;
         double pajak =0; 
         pajak =this.gaji*TARIF;
         return pajak;
     }
     public void cetakWP(){
         System.out.println("----- Cetak Wajib Pajak--------");
         super.cetakBiodata();
         System.out.println("Gaji " + FormatClass.formatCurrency(this.gaji) );
     }

    @Override
    public void hitung(int a, int b) {
       
       System.out.println("Ini adalah Method Hitung Child ");
    }
     
}
