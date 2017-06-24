/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesdatos;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Basesdatos {

    public static void main(String[] args) throws Exception {

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        
         String q ="select * from usuarios" ;
         
         Statement stm = c.createStatement();
         ResultSet  rs = stm.executeQuery(q);
         
         while (rs.next()){
             
             int id = rs.getInt("ID");
             String nom =rs.getString("nom");
             String ape= rs.getString("ape");
             
             
         }

    }

}
