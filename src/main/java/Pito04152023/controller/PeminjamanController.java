/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pito04152023.controller;

import Pito04152023.view.FormPeminjaman;
import Pito04152023.Model.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;

/**
 *
 * @author Pitok
 */
public class PeminjamanController {
    private Peminjaman peminjaman;
    private PeminjamanDaoImpl peminjamanDao;
    private FormPeminjaman form;

    private AnggotaDao anggotaDao;
    private BukuinDao bukuDao;

    public PeminjamanController(FormPeminjaman form) {
        this.form = form;
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuinDaoImpl();
    }

    public void cls() {
        form.getTxtTglpinjam().setText("");
        form.getTxtTglkembali().setText("");
    }

    public void isiCombo() {
        List<Anggota> listAnggota = anggotaDao.getAll();
        List<Bukuin> listBuku = bukuDao.getAll();
        form.getCboAnggota().removeAllItems();
        form.getCboBuku().removeAllItems();

        // isi
        for (Anggota anggota : listAnggota) {
            form.getCboAnggota().addItem(anggota.getNobp());
        }
        for (Bukuin buku : listBuku) {
            form.getCboBuku().addItem(buku.getKode());
        }
    }

    public void savePeminjaman() {
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggotaDao.getAnggota(form.getCboAnggota().getSelectedIndex()));
        peminjaman.setBukuin(bukuDao.getBukuin(form.getCboBuku().getSelectedIndex()));
        peminjaman.setTglpinjam(form.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(form.getTxtTglkembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
    }

    public void getPeminjaman() {
        int index = form.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if (peminjaman != null) {
            form.getCboAnggota().setSelectedItem(peminjaman.getAnggota().getNobp());
            form.getCboBuku().setSelectedItem(peminjaman.getBukuin().getKode());
            form.getTxtTglpinjam().setText(peminjaman.getTglpinjam());
            form.getTxtTglkembali().setText(peminjaman.getTglkembali());
        }
    }

    public void updatePeminjaman() {
        int idx = form.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(form.getCboAnggota().getSelectedIndex()));
        peminjaman.setBukuin(bukuDao.getBukuin(form.getCboBuku().getSelectedIndex()));
        peminjaman.setTglpinjam(form.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(form.getTxtTglkembali().getText());
        peminjamanDao.update(idx, peminjaman);
    }

    public void deletePeminjaman() {
        int idx = form.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }

    public void tampilData() {
        DefaultTableModel tabelModel = (DefaultTableModel) form.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAll();
        for (Peminjaman peminjaman : list) {
            Object[] data = {
                    peminjaman.getAnggota().getNobp(),
                    peminjaman.getAnggota().getNama(),
                    peminjaman.getBukuin().getKode(),
                    peminjaman.getTglpinjam(),
                    peminjaman.getTglkembali()
            };
            tabelModel.addRow(data);
        }
    }
}
