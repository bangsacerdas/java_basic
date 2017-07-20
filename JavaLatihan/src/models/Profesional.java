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
public class Profesional  extends Person implements IPajak{

    @Override
    public double hitungPajak() {
       return super.getPendapatan() *0.015;
    }

    @Override
    public void cetak(int pilihan) {
       super.cetak(pilihan);
       System.out.println("Pajak " + Misc.formatCurrency(this.hitungPajak()));
    }
 
    
}
