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

public class Basesdatos2 {

    public static void main(String[] args) throws Exception {

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admferreteria", "root", "");
        // 111 list<usuario>  ususa = new arrylist<>();
        int id ;

        String q1 = "select * from clientes where idCliente= ?";

        PreparedStatement ps = c.prepareStatement(q1);

        getById(ps, 1);

        getById(ps, 2);

    }

    private static void getById (PreparedStatement ps, int id)throws Exception {

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            id = rs.getInt("idCliente");
            System.out.println(rs.getString("nombreCliente"));
            System.out.println(rs.getString("mailCliente"));

        }
    }

}
