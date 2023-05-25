package UTS_A.Model;

import java.util.ArrayList;
import java.util.List;

public class WarnetDaoImpl implements WarnetDao {
    List<Warnet> data = new ArrayList<>();

    public WarnetDaoImpl() {
        PelangganDao pelangganDao = new PelangganDaoImpl();
        Warnet warnet = new Warnet();
        data.add(new Warnet(pelangganDao.getPelanggan(0), "25/05/2023", "12:00", "12:59", warnet.getTarif()));
    }

    public void save(Warnet warnet) {
        data.add(warnet);
    }

    public void update(int index, Warnet warnet) {
        data.set(index, warnet);
    }

    public void delete(int index) {
        data.remove(index);
    }

    public Warnet getWarnet(int index) {
        return data.get(index);
    }

    public List<Warnet> getAll() {
        return data;
    }
}
