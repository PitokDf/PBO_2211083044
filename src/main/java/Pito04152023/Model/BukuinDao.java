package Pito04152023.Model;

import java.util.List;
public interface BukuinDao {
    void save(Bukuin bukuin);
    void update(int index, Bukuin bukuin);
    void delete(int index);
    Bukuin getBukuin(int index);
    List<Bukuin>getAll();
}
