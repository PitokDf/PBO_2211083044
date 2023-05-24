package Karyawan.Model;

import java.util.List;

public interface GajiDao {
    void save(Gaji gaji);

    void update(int index, Gaji gaji);

    void delete(int index);

    Gaji getGaji(int index);

    List<Gaji> getAll();
}
