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
}
