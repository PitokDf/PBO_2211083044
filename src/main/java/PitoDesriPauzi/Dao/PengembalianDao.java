package PitoDesriPauzi.Dao;

import java.util.List;

import PitoDesriPauzi.Model.Pengembalian;

public interface PengembalianDao {
    void Insert(Pengembalian pg) throws Exception;

    void Update(Pengembalian pg) throws Exception;

    void Delete(Pengembalian pg) throws Exception;

    Pengembalian getPm(String kodeBuku, String kodeanggota, String tglpinjam) throws Exception;

    List<Pengembalian> getAll() throws Exception;

    int terlmbat(String tgl1, String tgl2) throws Exception;

    List<Pengembalian> cari(String kode, String cari) throws Exception;
}
