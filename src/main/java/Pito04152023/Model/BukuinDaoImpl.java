package Pito04152023.Model;

import java.util.ArrayList;
import java.util.List;
public class BukuinDaoImpl implements BukuinDao{
    List<Bukuin> data = new ArrayList<>();

    public BukuinDaoImpl(){
        data.add(new Bukuin("7184152023", "Belajar koding", "Start", "Gelap Malam", "04-April-2023"));
        data.add(new Bukuin("7184152023", "Belajar koding", "Start", "Gelap Malam", "04-April-2023"));
    }

    public void save(Bukuin bukuin){
        data.add(bukuin);
    }
    public void update(int index, Bukuin bukuin){
        data.set(index, bukuin);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Bukuin getBukuin(int index){
        return data.get(index);
    }
    public List<Bukuin> getAll(){
        return data;
    }
}
