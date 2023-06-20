package PitoDesriPauzi.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import PitoDesriPauzi.Model.Buku;

public class BukuDaoImpl implements BukuDao {
    private Connection cn;
    private Buku buku = new Buku();

    public BukuDaoImpl(Connection cn) {
        this.cn = cn;
    }

    public void Insert(Buku buku) throws Exception {
        String insert = "INSERT INTO daftarBuku VALUES(?,?,?,?,?)";
        PreparedStatement ps = cn.prepareStatement(insert);
        ps.setString(1, buku.getKodeBuku());
        ps.setString(2, buku.getJudulBuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.setString(5, buku.getTahunTerbit());
        ps.executeUpdate();
    }

    public void Update(Buku buku) throws Exception {
        String update = "UPDATE daftarBuku SET judulBuku = ?, pengarang = ?, penerbit = ?, tahunTerbit = ? WHERE kodeBuku = ?";
        PreparedStatement ps = cn.prepareStatement(update);
        ps.setString(1, buku.getKodeBuku());
        ps.setString(2, buku.getJudulBuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.setString(5, buku.getTahunTerbit());
        ps.executeUpdate();
    }

    public void Delete(Buku buku) throws Exception {
        String delete = "DELETE FROM daftarBuku WHERE kodeBuku = ?";
        PreparedStatement ps = cn.prepareStatement(delete);
        ps.setString(1, buku.getKodeBuku());
        ps.executeUpdate();
    }

    public Buku getBuku(String kode) throws Exception {
        String all = "SELECT * FROM daftarBuku WHERE kodeBuku = ?";
        PreparedStatement ps = cn.prepareStatement(all);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            buku.setTahunTerbit(rs.getString(5));
        }
        return buku;
    }

    public List<Buku> getAll() throws Exception {
        String all = "SELECT * FROM daftarBuku";
        PreparedStatement ps = cn.prepareStatement(all);
        ResultSet rs = ps.executeQuery();
        List<Buku> list = new ArrayList<>();
        while (rs.next()) {
            buku = new Buku();
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            buku.setTahunTerbit(rs.getString(5));
            list.add(buku);
        }
        return list;
    }
}
