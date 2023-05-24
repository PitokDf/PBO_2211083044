package Karyawan.Model;

import java.util.List;

public interface KaryawanDao {
    void save(Karyawan karyawan);

    void update(int index, Karyawan karyawan);

    void delete(int index);

    Karyawan getKaryawan(int index);

    List<Karyawan> getAll();
}
