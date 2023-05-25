package UTS_A.Model;

import java.util.ArrayList;
import java.util.List;

import Karyawan.Model.Karyawan;

public class PelangganDaoImpl implements PelangganDao {
    List<Pelanggan> data = new ArrayList<>();

    public PelangganDaoImpl() {
        data.add(new Pelanggan("1111", "Dimas", "VIP"));
    }

    public void save(Pelanggan pelanggan) {
        data.add(pelanggan);
    }

    public void update(int index, Pelanggan pelanggan) {
        data.set(index, pelanggan);
    }

    public void delete(int index) {
        data.remove(index);
    }

    public Pelanggan getPelanggan(int index) {
        return data.get(index);
    }

    public List<Pelanggan> getAll() {
        return data;
    }
}
