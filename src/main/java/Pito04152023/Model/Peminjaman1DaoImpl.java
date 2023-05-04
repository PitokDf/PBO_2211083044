package Pito04152023.Model;

import java.util.ArrayList;
import java.util.List;

public class Peminjaman1DaoImpl implements Peminjaman1Dao {
    List<Peminjaman1> data = new ArrayList<>();

    public Peminjaman1DaoImpl() {
        AnggotaDao daoAnggota = new AnggotaDaoImpl();
        BukuinDao bukuDao = new BukuinDaoImpl();

        data.add(new Peminjaman1(daoAnggota.getAnggota(0), bukuDao.getBukuin(0), "04/04/2023", "04/05/2024"));
        data.add(new Peminjaman1(daoAnggota.getAnggota(1), bukuDao.getBukuin(1), "03/05/2023", "03/05/2024"));
    }

    public void save(Peminjaman1 peminjaman) {
        data.add(peminjaman);
    }

    public void update(int idx, Peminjaman1 peminjaman) {
        data.set(idx, peminjaman);
    }

    public void delete(int idx) {
        data.remove(idx);
    }

    public Peminjaman1 getPeminjaman(int idx) {
        return data.get(idx);
    }

    public List<Peminjaman1> getAll() {
        return data;
    }
}
