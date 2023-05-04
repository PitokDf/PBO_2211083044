package Pito04152023.Model;

import java.util.ArrayList;
import java.util.List;

public class PengembalianDaoImpl implements PengembalianDao{
    List<Pengembalian> data = new ArrayList<>();

    public PengembalianDaoImpl() {
        AnggotaDao daoAnggota = new AnggotaDaoImpl();
        BukuinDao bukuDao = new BukuinDaoImpl();
        Peminjaman1Dao pemDao = new Peminjaman1DaoImpl();

        data.add(new Pengembalian(pemDao.getPeminjaman(0), 0, 0));
    }

    public void save(Pengembalian pengembalian) {
        data.add(pengembalian);
    }

    public void update(int idx, Pengembalian pengembalian) {
        data.set(idx, pengembalian);
    }

    public void delete(int idx) {
        data.remove(idx);
    }

    public Pengembalian getPengembalian(int idx) {
        return data.get(idx);
    }

    public List<Pengembalian> getAll() {
        return data;
    }
}
