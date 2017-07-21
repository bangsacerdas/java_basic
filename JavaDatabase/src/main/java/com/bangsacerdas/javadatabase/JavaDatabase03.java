/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bangsacerdas.javadatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jupiterzhuo
 */
public class JavaDatabase03 {
     private static void selectTable() throws SQLException{
        
        Connection conn =null;
        Statement smt  =null;
        
        String selectSql= "SELECT `customers`.`customerNumber`,\n" +
                        "    `customers`.`customerName`,\n" +
                        "    `customers`.`contactLastName`,\n" +
                        "    `customers`.`contactFirstName`\n" +
                        "FROM `classicmodels`.`customers`;";
        try {
            conn = ConnectionDB.DBConnect();
            smt =conn.createStatement();
            System.out.println(selectSql);
         
            ResultSet rs=smt.executeQuery(selectSql);
            while (rs.next()) {                
                int cusNo = rs.getInt("customerNumber");
                String cusName =rs.getString("customerName");
                System.out.println(cusNo + " " + cusName);
            }
            
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            if (smt!=null)
                smt.close();
            if (conn !=null)
                conn.close();
        }
    }
     public static void main(String[] args) {
          try {
            selectTable();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
