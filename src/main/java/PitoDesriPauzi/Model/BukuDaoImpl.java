package PitoDesriPauzi.Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BukuDaoImpl implements BukuDao {
    private Connection cn;

    public BukuDaoImpl(Connection cn) {
        this.cn = cn;
    }

    public void insert(Buku buku) throws Exception {
        String insert = "INSERT INTO daftarBuku (kodeBuku, judulBuku, pengarang, penerbit, tahunTerbit) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pr = cn.prepareStatement(insert);
        pr.setString(1, buku.getKodeBuku());
        pr.setString(2, buku.getJudulBuku());
        pr.setString(3, buku.getPengarang());
        pr.setString(4, buku.getPenerbit());
        pr.setString(5, buku.getTahunTerbit());
        pr.executeUpdate();
        pr.close();
    }

    public void Update(Buku buku, String kodeBuku) throws Exception {
        String update = "UPDATE daftarBuku SET kodeBuku = ?, judulBuku = ?, pengarang = ?, penerbit = ?, tahunTerbit = ? WHERE daftarBuku.kodeBuku = ?";
        PreparedStatement pr = cn.prepareStatement(update);
        pr.setString(1, buku.getKodeBuku());
        pr.setString(2, buku.getJudulBuku());
        pr.setString(3, buku.getPengarang());
        pr.setString(4, buku.getPenerbit());
        pr.setString(5, buku.getTahunTerbit());
        pr.setString(6, kodeBuku);
        pr.executeUpdate();
        pr.close();
    }

    public void Delete(String kodeBuku) throws Exception {
        String delete = "DELETE FROM daftarBuku WHERE daftarBuku.kodeBuku = ?";
        PreparedStatement pr = cn.prepareStatement(delete);
        pr.setString(1, kodeBuku);
        pr.executeUpdate();
        pr.close();
    }

    public List<Buku> getAll() throws Exception {
        String getAll = "SELECT * FROM daftarBuku";
        PreparedStatement ps = cn.prepareStatement(getAll);

        ResultSet rs = ps.executeQuery();
        Buku buku;
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

    public Buku getBuku(String kodeBuku) throws Exception {
        String getBuku = "SELECT * FROM daftarBuku WHERE kodeBuku = ?";
        PreparedStatement ps = cn.prepareStatement(getBuku);
        ps.setString(1, kodeBuku);
        ResultSet rs = ps.executeQuery();
        Buku buku = null;
        if (rs.next()) {
            buku = new Buku();
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            buku.setTahunTerbit(rs.getString(5));
        }
        return buku;
    }
}
