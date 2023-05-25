package UTS_A.Model;

import java.util.List;

public interface WarnetDao {
    void save(Warnet warnet);

    void update(int index, Warnet warnet);

    void delete(int index);

    Warnet getWarnet(int index);

    List<Warnet> getAll();
}
