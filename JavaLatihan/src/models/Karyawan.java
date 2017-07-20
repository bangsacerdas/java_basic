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
public class Karyawan extends Person implements IPajak{
    private String statusMenikah;
    private String StatusTetap;
    private double bonus;
    private double tunjangan;
  

    public String getStatusMenikah() {
        return statusMenikah;
    }

    public void setStatusMenikah(String statusMenikah) {
        this.statusMenikah = statusMenikah;
    }

    public String getStatusTetap() {
        return StatusTetap;
    }

    public void setStatusTetap(String StatusTetap) {
        this.StatusTetap = StatusTetap;
    }
    
   
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

  

    @Override
    public double hitungPajak() {
        double pajak=0;
        if(this.hitungGajiKotor() > 1000000000){
           pajak= 0.05 * this.hitungGajiKotor();
        }
        else if (this.hitungGajiKotor() > 500000000 && this.hitungGajiKotor() <= 1000000000){
           pajak= 0.02* this.hitungGajiKotor();
        }
        else if (this.hitungGajiKotor() > 100000000 && this.hitungGajiKotor() <=500000000){
           pajak= 0.015 * this.hitungGajiKotor();
        }
        else if (this.hitungGajiKotor() <=100000000){
            pajak= 0;
        }
            return pajak;
    }
    
    public double hitungGajiKotor(){
        return super.getPendapatan() +this.bonus- this.tunjangan;
    }
    public double hitungBonus(){
        double bonus = 0;
     
        if("2".equals(this.getStatusMenikah()) && "2".equals(this.getStatusTetap())){
            bonus  =0.1*super.getPendapatan();
        }
            return bonus;
    }
    @Override
    public void cetak(int pilihan) {
        super.cetak(pilihan);
        System.out.println("Status Menikah : " + ("1".equals(this.getStatusMenikah())?"Single" :"Menikah" ));
        System.out.println("Status tetap: " + ("1".equals(this.getStatusTetap())?"Tidak tetap" :"Tetap" ));
        System.out.println("Bonus : " + Misc.formatCurrency(hitungBonus()));
        System.out.println("Tunjangan : " + Misc.formatCurrency(getTunjangan()));
        System.out.println("Pajak " + Misc.formatCurrency(this.hitungPajak()));
         
    }
    
    
}
