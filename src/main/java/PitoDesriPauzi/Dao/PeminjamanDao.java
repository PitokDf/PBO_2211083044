package PitoDesriPauzi.Dao;

import java.util.List;

import PitoDesriPauzi.Model.Peminjaman;

public interface PeminjamanDao {
    void Insert(Peminjaman pm) throws Exception;

    void Update(Peminjaman pm) throws Exception;

    void Delete(Peminjaman pm) throws Exception;

    Peminjaman getPm(String kodeBuku, String kodeanggota, String tglpinjam) throws Exception;

    List<Peminjaman> getAll() throws Exception;
}
