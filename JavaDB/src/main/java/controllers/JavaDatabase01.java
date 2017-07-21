/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jupiterzhuo
 */
public class JavaDatabase01 {
    public static void main(String[] args) {
        try {
            System.out.println(insertData());
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        }
    }
    
    private static int insertData() throws SQLException{
        Connection conn =null;
        Statement stm =null;
        int result = 0;
        String insertSQL1 = "INSERT INTO `classicmodels`.`offices`\n" +
                "(`officeCode`,`city`,`phone`,"
                + "`addressLine1`,`addressLine2`,`state`,"
                + "`country`,`postalCode`,`territory`)\n" 
                + "VALUES('23','Jakarta',"
                + "'+6283898986397','Jl Permata',"
                + "'Jakarta Selatan','JKT',"
                + "'ID','11830','ID');";
        
        String insertSQL2 = "INSERT INTO `classicmodels`.`offices`\n" +
                "(`officeCode`,`city`,`phone`,"
                + "`addressLine1`,`addressLine2`,`state`,"
                + "`country`,`postalCode`,`territory`)\n" 
                + "VALUES('20','Jakarta',"
                + "'+6283898986397','Jl Permata',"
                + "'Jakarta Selatan','JKT',"
                + "'ID','11830','ID');";
        
        String insertSQL3 = "INSERT INTO `classicmodels`.`offices`\n" +
                "(`officeCode`,`city`,`phone`,"
                + "`addressLine1`,`addressLine2`,`state`,"
                + "`country`,`postalCode`,`territory`)\n" 
                + "VALUES('24','Jakarta',"
                + "'+6283898986397','Jl Permata',"
                + "'Jakarta Selatan','JKT',"
                + "'ID','11830','ID');";
        
        try {
            conn =ConnectionDB.ConnectDB();
            conn.setAutoCommit(true);
            
            stm = conn.createStatement();
            stm.addBatch(insertSQL1);
            stm.addBatch(insertSQL2);
            stm.addBatch(insertSQL3);
            stm.executeBatch();
            conn.commit();
            
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
