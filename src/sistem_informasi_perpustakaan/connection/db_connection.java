/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_informasi_perpustakaan.connection;

import com.mysql.jdbc.Driver;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
//Class untuk melakukan koneksi dengan database
public class db_connection {
    static final String db = "jdbc:mysql://localhost:3306/perpustakaan";
    static final String user = "root";
    public static Connection getConnection(){
        Connection koneksi = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(db,user,"");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(db_connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return koneksi;
    }
}
