/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.Misc;

/**
 *
 * @author jupiterzhuo
 */
public class Pengusaha extends Person implements IPajak{


    @Override
    public double hitungPajak() {
        double pajak =0;
        if (super.getPendapatan() <=1000000000){
           pajak= 0.03 * super.getPendapatan();
        }
        else if (super.getPendapatan() >=500000000 && super.getPendapatan() <1000000000){
            pajak= 0.025*super.getPendapatan();
        }
        else if (super.getPendapatan() >=100000000 && super.getPendapatan() <500000000){
           pajak= 0.015 *super.getPendapatan();
        }
        else if (super.getPendapatan() < 100000000){
            pajak= 0;
        }
        return pajak;
    }

    @Override
    public void cetak(int pilihan) {
        super.cetak(pilihan);
        System.out.println("Pajak " + Misc.formatCurrency(this.hitungPajak()));
    }
   
  
    
}
