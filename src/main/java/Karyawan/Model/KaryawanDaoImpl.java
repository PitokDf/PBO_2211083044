package Karyawan.Model;

import java.util.ArrayList;
import java.util.List;

public class KaryawanDaoImpl implements KaryawanDao {
    List<Karyawan> data = new ArrayList<>();

    public KaryawanDaoImpl() {
        data.add(new Karyawan("Paul Jamsok", "Jakarta", "Single", "2211203487", "B", "PNS", 0));
        data.add(new Karyawan("Pito Desri Pauzi", "Lubuk Aur", "Menikah", "2211083044", "A", "CEO", 3));
        data.add(new Karyawan("Baghaztra", "Pekten", "Cerai", "1999099922", "A", "CEO", 3));
    }

    public void save(Karyawan karyawan) {
        data.add(karyawan);
    }

    public void update(int index, Karyawan karyawan) {
        data.set(index, karyawan);
    }

    public void delete(int index) {
        data.remove(index);
    }

    public Karyawan getKaryawan(int index) {
        return data.get(index);
    }

    public List<Karyawan> getAll() {
        return data;
    }
}
