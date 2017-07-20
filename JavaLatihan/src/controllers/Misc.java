/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.text.NumberFormat;

/**
 *
 * @author jupiterzhuo
 */
public class Misc {
     public static String formatCurrency(double _currency){
        NumberFormat formatter  =NumberFormat.getCurrencyInstance();
        return formatter.format(_currency);
     }
}
