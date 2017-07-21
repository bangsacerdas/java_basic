/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bangsacerdas.javadatabase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jupiterzhuo
 */
public class JavaDatabase04 {
     private static void batchInsertTable() throws SQLException{
        
        Connection conn =null;
        Statement smt  =null;
        
        String insertTableSql1= "INSERT INTO `persons`(`PersonID`,`LastName`,`FirstName`,`Address`,`City`)\n" +
                                "VALUES(1,'Zhuo','Jupiter','Jl Merpati','Jakarta');";
        String insertTableSql2= "INSERT INTO `persons`(`PersonID`,`LastName`,`FirstName`,`Address`,`City`)\n" +
                                "VALUES(2,'Zhuo','Jupiter','Jl Merpati','Jakarta');";
        String insertTableSql3= "INSERT INTO `persons`(`PersonID`,`LastName`,`FirstName`,`Address`,`City`)\n" +
                                "VALUES(3,'Zhuo','Jupiter','Jl Merpati','Jakarta');";
        try {
            conn = ConnectionDB.DBConnect();
            smt =conn.createStatement();
            conn.setAutoCommit(false);
            
            smt.addBatch(insertTableSql1);
            smt.addBatch(insertTableSql2);
            smt.addBatch(insertTableSql3);
            
            smt.executeBatch();
            conn.commit();
            System.out.println("Success Insert");
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
            batchInsertTable();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
