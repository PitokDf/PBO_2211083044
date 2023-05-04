package Pito04152023.controller;

import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Pito04152023.Model.*;
import Pito04152023.view.FormPeminjaman1;

public class Peminjaman1Controller {
    private Peminjaman1 peminjaman;
    private Peminjaman1DaoImpl peminjamanDao;
    private FormPeminjaman1 form;

    private AnggotaDao anggotaDao;
    private BukuinDao bukuDao;

    public Peminjaman1Controller(FormPeminjaman1 form) {
        this.form = form;
        peminjamanDao = new Peminjaman1DaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuinDaoImpl();
    }

    public Peminjaman1Controller() {
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
        peminjaman = new Peminjaman1();
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
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String tglString = formatter.format(peminjaman.getTglpinjam());
            form.getTxtTglpinjam().setText(tglString);
            String tglStringk = formatter.format(peminjaman.getTglkembali());
            form.getTxtTglkembali().setText(tglStringk);
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
        List<Peminjaman1> list = peminjamanDao.getAll();
        for (Peminjaman1 peminjaman : list) {
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
