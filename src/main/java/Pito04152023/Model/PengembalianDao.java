package Pito04152023.Model;

import java.util.List;

public interface PengembalianDao {
    void save(Pengembalian pengembalian);

    void update(int index, Pengembalian pengembalian);

    void delete(int index);

    Pengembalian getPengembalian(int index);

    List<Pengembalian> getAll();
}
