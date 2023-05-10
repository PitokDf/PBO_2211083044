package Karyawan.Model;

import java.util.ArrayList;
import java.util.List;

public class KaryawanDaoImpl implements KaryawanDao{
    List<Karyawan> data = new ArrayList<>();
    public KaryawanDaoImpl(){
        data.add(new Karyawan("Pito Desri Pauzi", "Bayang", "Lajang", "2211083044", "2", "CEO"));
    }
    public void save(Karyawan karyawan){
        data.add(karyawan);
    }
    public void update(int index, Karyawan karyawan){
       data.set(index, karyawan);
    }
    public void delete (int index){
        data.remove(data);
    }
    public Karyawan getKaryawan(int index){
        return data.get(index);
    }
    public List<Karyawan> getAll(){
        return data;
    }
}
