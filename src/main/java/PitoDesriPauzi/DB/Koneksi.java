/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PitoDesriPauzi.DB;

import java.sql.*;

import javax.swing.JOptionPane;
import PitoDesriPauzi.Model.*;

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

    public static void main(String[] args) {
        try {
            cn = Koneksi.getConnection();
            AnggotaDao dao = new AnggotaDaoImpl(cn);
            Anggota ag = new Anggota("0013", "Ali", "Padang", "l");
            dao.insert(ag);
            JOptionPane.showMessageDialog(null, "berhasil terkoneksi kedatabases");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
