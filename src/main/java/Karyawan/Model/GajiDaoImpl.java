package Karyawan.Model;

import java.util.ArrayList;
import java.util.List;

public class GajiDaoImpl implements GajiDao{
    List<Gaji> data = new ArrayList<>();

    public GajiDaoImpl(){
        KaryawanDao karyawanDao = new KaryawanDaoImpl();
       
        data.add(new Gaji(0, 0, karyawanDao.getKaryawan(0), 0, 0, 0, 0));
    }
    public void save(Gaji gaji){
        data.add(gaji);
    }
    public void update(int index, Gaji gaji){
        data.set(index, gaji);
    }
    public void delete (int index){
        data.remove(index);
    }
    public Gaji getGaji(int index){
        return data.get(index);
    }
    public List<Gaji> getAll(){
        return data;
    }
}
