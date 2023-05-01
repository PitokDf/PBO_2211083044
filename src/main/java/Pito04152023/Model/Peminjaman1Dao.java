package Pito04152023.Model;

import java.util.List;

public interface Peminjaman1Dao {
    void save(Peminjaman1 peminjaman);

    void update(int index, Peminjaman1 peminjaman);

    void delete(int index);

    Peminjaman1 getPeminjaman(int index);

    List<Peminjaman1> getAll();
}
