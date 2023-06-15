package PitoDesriPauzi.Model;

import java.util.List;

public interface BukuDao {
    void insert(Buku buku) throws Exception;

    void Delete(String kodeBuku) throws Exception;

    void Update(Buku buku, String kodeBuku) throws Exception;

    Buku getBuku(String kodeBuku) throws Exception;

    List<Buku> getAll() throws Exception;
}
