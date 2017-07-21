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
public class JavaDatabase02 {
     public static void main(String[] args) {
        try {
            System.out.println(insertData());
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        }
    }
    
    private static int insertData() throws SQLException{
        Connection conn =null;
        PreparedStatement stm =null;
        int result = 0;
        String insertSQL1 = "INSERT INTO `classicmodels`.`offices`\n" +
                "(`officeCode`,`city`,`phone`,"
                + "`addressLine1`,`addressLine2`,`state`,"
                + "`country`,`postalCode`,`territory`)\n" 
                + "VALUES(?,?,"
                + "?,?,"
                + "?,?,"
                + "?,?,?);";
        
      
        
        try {
            conn =ConnectionDB.ConnectDB();
          
            
            stm = conn.prepareStatement(insertSQL1);
            stm.setString(1, "25");
            stm.setString(2, "Bandung");
            stm.setString(3, "24");
            stm.setString(4, "24");
            stm.setString(5, "24");
            stm.setString(6, "24");
            stm.setString(7, "24");
            stm.setString(8, "24");
            stm.setString(9, "24");

            stm.executeUpdate();
            System.out.println("Success");
       
        
            
        } catch (SQLException e) {
            System.out.println("Error Insert "+e.getMessage());
        }
        finally{
            if(stm!=null){
                stm.close();
            }
             if(conn!=null){
                conn.close();
            }
        }
        return result;
    }
}
