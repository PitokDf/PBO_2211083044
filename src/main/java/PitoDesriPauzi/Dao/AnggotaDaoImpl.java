package PitoDesriPauzi.Dao;

import java.sql.*;
import java.util.*;

import PitoDesriPauzi.Model.Anggota;

public class AnggotaDaoImpl implements AnggotaDao {
    private Connection cn;
    private Anggota agg = new Anggota();

    public AnggotaDaoImpl(Connection cn) throws Exception {
        this.cn = cn;
    }

    public void insert(Anggota agg) throws Exception {
        String insert = "INSERT INTO anggota values(?,?,?,?)";
        PreparedStatement ps = cn.prepareStatement(insert);
        ps.setString(1, agg.getKodeanggota());
        ps.setString(2, agg.getNamaanggota());
        ps.setString(3, agg.getAlamat());
        ps.setString(4, agg.getJeniskelamin());
        ps.executeUpdate();
        ps.close();
    }

    public void update(Anggota agg) throws Exception {
        String update = "UPDATE anggota SET namaanggota = ?, alamat = ?, jeniskelamin = ? WHERE kodeanggota = ?";
        PreparedStatement ps = cn.prepareStatement(update);
        ps.setString(1, agg.getNamaanggota());
        ps.setString(4, agg.getKodeanggota());
        ps.setString(2, agg.getAlamat());
        ps.setString(3, agg.getJeniskelamin());
        ps.executeUpdate();
        ps.close();
    }

    public void delete(String kode) throws Exception {
        String sql = "DELETE FROM anggota WHERE anggota.kodeanggota = ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, kode);
        ps.executeUpdate();
        ps.close();
    }

    public Anggota getAgg(String kode) throws Exception {
        String getagg = "SELECT * FROM anggota WHERE kodeanggota = ?";
        PreparedStatement ps = cn.prepareStatement(getagg);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            agg.setKodeanggota(rs.getString(1));
            agg.setNamaanggota(rs.getString(2));
            agg.setAlamat(rs.getString(3));
            agg.setJeniskelamin(rs.getString(4));
        }
        return agg;
    }

    public List<Anggota> getAll() throws Exception {
        String sql = "SELECT * FROM anggota";
        PreparedStatement ps = cn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Anggota> list = new ArrayList<>();
        while (rs.next()) {
            agg = new Anggota();
            agg.setKodeanggota(rs.getString(1));
            agg.setAlamat(rs.getString(3));
            agg.setNamaanggota(rs.getString(2));
            agg.setJeniskelamin(rs.getString(4));
            list.add(agg);
        }
        return list;
    }
}
