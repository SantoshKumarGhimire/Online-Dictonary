/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Model;

/**
 *
 * @author Santosh
 */
public class dbConnection {

    public static Connection getDBConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/entries", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;

    }

    public List<Model> getResult(String word) {
        Connection con = getDBConnection();
        try {
           List<Model> resultList = new ArrayList<>();
            String qry = "Select wordtype,definition from entries where word=?";
            System.out.println(qry);
            PreparedStatement ps = con.prepareStatement(qry);
            ps.setString(1, word);
            ResultSet rs = ps.executeQuery();
           Model model ;
            while (rs.next()) {
                model= new Model();
                model.setWordType(rs.getString("wordtype"));
                model.setDefinition(rs.getString("definition"));
                resultList.add(model);
            }
            return resultList;
              
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }

}
