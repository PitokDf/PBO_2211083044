package Karyawan.Model;

import java.util.ArrayList;
import java.util.List;

public class GajiDaoImpl implements GajiDao {
    List<Gaji> data = new ArrayList<>();

    public GajiDaoImpl() {
        KaryawanDao karyawanDao = new KaryawanDaoImpl();
        Gaji gaji = new Gaji();

        data.add(new Gaji(karyawanDao.getKaryawan(0), 3, 2023));
        data.add(new Gaji(karyawanDao.getKaryawan(1), 3, 2023));
        data.add(new Gaji(karyawanDao.getKaryawan(2), 3, 2023));
    }

    public void save(Gaji gaji) {
        data.add(gaji);
    }

    public void update(int idx, Gaji gaji) {
        data.set(idx, gaji);
    }

    public void delete(int idx) {
        data.remove(idx);
    }

    public Gaji getGaji(int idx) {
        return data.get(idx);
    }

    public List<Gaji> getAll() {
        return data;
    }
}
