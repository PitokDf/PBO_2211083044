package PitoDesriPauzi.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import PitoDesriPauzi.Model.Peminjaman;
import PitoDesriPauzi.View.FormPeminjamandb;

public class PeminjamanDaoImpl implements PeminjamanDao {
    private Connection cn;
    private Peminjaman pm = new Peminjaman();
    private AnggotaDao dao;
    private FormPeminjamandb form;

    public PeminjamanDaoImpl(Connection cn) throws Exception {
        this.cn = cn;
        dao = new AnggotaDaoImpl(cn);
    }

    public void Insert(Peminjaman pm) throws Exception {
        String insert = "INSERT INTO peminjaman VALUES(?,?,?,?,?)";
        PreparedStatement ps = cn.prepareStatement(insert);
        ps.setString(1, pm.getAgg().getKodeanggota());
        ps.setString(2, pm.getAgg().getNamaanggota());
        ps.setString(3, pm.getBuku().getKodeBuku());
        ps.setString(4, pm.getTanggalPinjam());
        ps.setString(5, pm.getTanggalPinjam());
        ps.executeUpdate();
    }

    public void Update(Peminjaman pm) throws Exception {
        String update = "UPDATE Peminjaman set namaAnggota = ?, kodeBuku = ?, tanggalPinjam = ?, tanggalKembali = ? WHERE kodeAnggota";
        PreparedStatement ps = cn.prepareStatement(update);
        ps.setString(1, pm.getAgg().getNamaanggota());
        ps.setString(2, pm.getBuku().getKodeBuku());
        ps.setString(3, pm.getTanggalPinjam());
        ps.setString(4, pm.getTanggalKemabli());
        ps.executeUpdate();
    }

    public void Delete(Peminjaman pm) throws Exception {

    }

    public Peminjaman getPm(String kodeBuku) throws Exception {
        String get = "SELECT * FROM Peminjaman WHERE kodeAnggota= ?";
        PreparedStatement ps = cn.prepareStatement(get);
        ps.setString(1, kodeBuku);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            pm.setKodeagg(rs.getString(1));
            pm.setNama(rs.getString(2));
            pm.setKodebuku(rs.getString(3));
            pm.setTanggalPinjam(rs.getString(4));
            pm.setTanggalKemabli(rs.getString(5));
        }
        return pm;
    }

    public List<Peminjaman> getAll() throws Exception {
        String tampil = "SELECT * FROM Peminjaman";
        PreparedStatement ps = cn.prepareStatement(tampil);
        ResultSet rs = ps.executeQuery();
        List<Peminjaman> data = new ArrayList<>();
        while (rs.next()) {
            pm = new Peminjaman();
            pm.setKodeagg(rs.getString(1));
            pm.setNama(rs.getString(2));
            pm.setKodebuku(rs.getString(3));
            pm.setTanggalPinjam(rs.getString(4));
            pm.setTanggalKemabli(rs.getString(5));
            data.add(pm);
        }
        return data;
    }
}
