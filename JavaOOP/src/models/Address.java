/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author jupiterzhuo
 */
public class Address {
    private String alamat;
    private String propinsi;
    private String kabupaten;
    private String zipCode;

    public String getAlamat() {
        return alamat;
    }

    public String getPropinsi() {
        return propinsi;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPropinsi(String propinsi) {
        this.propinsi = propinsi;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" + "alamat=" + alamat + ", propinsi=" + propinsi + ", kabupaten=" + kabupaten + ", zipCode=" + zipCode + '}';
    }

  


    
    
    
    
    
}
