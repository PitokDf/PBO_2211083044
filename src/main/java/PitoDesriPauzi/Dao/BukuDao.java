package PitoDesriPauzi.Dao;

import java.util.List;

import PitoDesriPauzi.Model.Buku;

public interface BukuDao {
    void Insert(Buku buku) throws Exception;

    void Update(Buku buku) throws Exception;

    void Delete(Buku buku) throws Exception;

    Buku getBuku(String kode) throws Exception;

    List<Buku> getAll() throws Exception;
}
