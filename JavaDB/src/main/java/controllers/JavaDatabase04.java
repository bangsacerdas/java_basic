/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jupiterzhuo
 */
public class JavaDatabase04 {
     public static void main(String[] args) {
        try {
            System.out.println(insertData());
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        }
    }
    
    private static int insertData() throws SQLException{
        Connection conn =null;
        PreparedStatement stm1 =null;
        PreparedStatement stm2 =null;
        int result = 0;
         String insertSQL1 = "INSERT INTO `classicmodels`.`offices`\n" +
                "(`officeCode`,`city`,`phone`,"
                + "`addressLine1`,`addressLine2`,`state`,"
                + "`country`,`postalCode`,`territory`)\n" 
                + "VALUES(?,?,"
                + "?,?,"
                + "?,?,"
                + "?,?,?);";
        
          String insertSQL2 = "INSERT INTO `classicmodels`.`offices`\n" +
                "(`officeCode`,`city`,`phone`,"
                + "`addressLine1`,`addressLine2`,`state`,"
                + "`country`,`postalCode`,`territory`)\n" 
                + "VALUES(?,?,"
                + "?,?,"
                + "?,?,"
                + "?,?,?);";
        
        try {
            conn =ConnectionDB.ConnectDB();
            conn.setAutoCommit(false);
            
            stm1 =conn.prepareStatement(insertSQL1);
            stm1.setString(1, "30");
            stm1.setString(2, "Bandung");
            stm1.setString(3, "24");
            stm1.setString(4, "24");
            stm1.setString(5, "24");
            stm1.setString(6, "24");
            stm1.setString(7, "24");
            stm1.setString(8, "24");
            stm1.setString(9, "24");
            stm1.executeUpdate();
            
            stm2 =conn.prepareStatement(insertSQL2);
            stm2.setString(1, "31");
            stm2.setString(2, "Bandung");
            stm2.setString(3, "24");
            stm2.setString(4, "24");
            stm2.setString(5, "24");
            stm2.setString(6, "24");
            stm2.setString(7, "24");
            stm2.setString(8, "24");
            stm2.setString(9, "24");
            stm1.executeUpdate();
     
            
            conn.commit();
            
        } catch (SQLException e) {
            System.out.println("Error Insert "+e.getMessage());
        }
        finally{
            if(stm1!=null){
                stm1.close();
            }
            if(stm2!=null){
                stm2.close();
            }
             if(conn!=null){
                conn.close();
            }
        }
        return result;
    }
}
