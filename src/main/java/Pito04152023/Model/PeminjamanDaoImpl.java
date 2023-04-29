/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito04152023.Model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Pitok
 */
public class PeminjamanDaoImpl {
    List<Peminjaman> data = new ArrayList<>();

    public PeminjamanDaoImpl() {
        AnggotaDao daoAnggota = new AnggotaDaoImpl();
        BukuinDao bukuDao = new BukuinDaoImpl();

        data.add(new Peminjaman(daoAnggota.getAnggota(0), bukuDao.getBukuin(0), "04/29/2023", "04/29/2024"));
        data.add(new Peminjaman(daoAnggota.getAnggota(1), bukuDao.getBukuin(1), "03/29/2023", "03/29/2024"));
    }

    public void save(Peminjaman peminjaman) {
        data.add(peminjaman);
    }

    public void update(int idx, Peminjaman peminjaman) {
        data.set(idx, peminjaman);
    }

    public void delete(int idx) {
        data.remove(idx);
    }

    public Peminjaman getPeminjaman(int idx) {
        return data.get(idx);
    }

    public List<Peminjaman> getAll() {
        return data;
    }
}