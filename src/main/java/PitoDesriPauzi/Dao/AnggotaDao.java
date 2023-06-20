package PitoDesriPauzi.Dao;

import java.util.List;

import PitoDesriPauzi.Model.*;

public interface AnggotaDao {
    void insert(Anggota agg) throws Exception;

    void update(Anggota agg) throws Exception;

    void delete(String kode) throws Exception;

    Anggota getAgg(String kode) throws Exception;

    List<Anggota> getAll() throws Exception;
}
