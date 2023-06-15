package PitoDesriPauzi.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AnggotaDaoImpl implements AnggotaDao {
    private Connection cn;

    public AnggotaDaoImpl(Connection cn) {
        this.cn = cn;
    }

    public void insert(Anggota anggota) throws Exception {
        String sql = "insert into anggota values(?,?,?,?)";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, anggota.getKodeanggota());
        ps.setString(2, anggota.getNamaanggota());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJeniskelamin());
        ps.executeUpdate();
        ps.close();
    }

    public void Update(Anggota anggota) throws Exception {
        String sql = "UPDATE anggota SET namaanggota = ?, alamat = ?, jeniskelamin = ? WHERE anggota.kodeanggota = ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, anggota.getNamaanggota());
        ps.setString(2, anggota.getAlamat());
        ps.setString(3, anggota.getJeniskelamin());
        ps.setString(4, anggota.getKodeanggota());
        ps.executeUpdate();
        ps.close();
    }

    public void Delete(Anggota anggota) throws Exception {
        String sql = "DELETE FROM anggota WHERE anggota.kodeanggota = " + anggota.getKodeanggota();
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }
}
