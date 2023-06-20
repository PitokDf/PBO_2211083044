/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PitoDesriPauzi.DB;

import java.sql.*;

/**
 *
 * @author pitokdf
 */
public class Koneksi {
    private static Connection cn;

    public static Connection getConnection() throws SQLException {
        if (cn == null) {
            String databaseURL = "jdbc:mysql://localhost/PBO_2211083044";
            String username = "root";
            String password = "";
            cn = DriverManager.getConnection(databaseURL, username, password);
            System.out.println("berhasil");
        }
        return cn;
    }
}
