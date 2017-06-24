/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesdatos;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Basesdatos {

    public static void main(String[] args) throws Exception {

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admferreteria", "root", "");
        // 111 list<usuario>  ususa = new arrylist<>();
        int id = 13;
        //  String q = "select * from clientes";

        //  Statement stm = c.createStatement();
        /*   ResultSet rs = stm.executeQuery(q);

        while (rs.next()) {

            int id = rs.getInt("idCliente");
            String nomClient = rs.getString("nombreCliente");
            String mailClient = rs.getString("mailCliente");
            //111  usua.sel(new(usua(in,xxx));

            //orm 
        }
         */
        String q1 = "select * from clientes where idCliente= ?";
      
        PreparedStatement ps = c.prepareStatement(q1);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
             id = rs.getInt("idCliente");
            String nomClient = rs.getString("nombreCliente");
            String mailClient = rs.getString("mailCliente");
        }

    }

}
