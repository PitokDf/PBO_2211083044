package UTS_A.Model;

import java.util.List;

public interface PelangganDao {
    void save(Pelanggan pelanggan);

    void update(int index, Pelanggan pelanggan);

    void delete(int index);

    Pelanggan getPelanggan(int index);

    List<Pelanggan> getAll();
}
