package Pito04152023.controller;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import Pito04152023.Model.*;
import Pito04152023.view.FormPengembalian;

public class PengembalianKontrol {
    private Pengembalian pengembalian;
    private PengembalianDaoImpl pengembalianDao;
    private FormPengembalian form;

    private AnggotaDao anggotaDao;
    private BukuinDao bukuDao;
    private Peminjaman1Dao peminjamanDao;

    public PengembalianKontrol(FormPengembalian form) {
        this.form = form;
        peminjamanDao = new Peminjaman1DaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuinDaoImpl();
        peminjamanDao = new Peminjaman1DaoImpl();
    }

    public PengembalianKontrol() {

    }

    public void cls() {
        form.getTxtTglpinjam().setText("");
        form.getTxtTglKembali().setText("");
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
        for (Bukuin bukuin : listBuku) {
            form.getCboBuku().addItem(bukuin.getKode());
        }
    }

    public void savePengembalian() {
        pengembalian = new Pengembalian();
        pengembalian.setAnggota(anggotaDao.getAnggota(form.getCboAnggota().getSelectedIndex()));
        pengembalian.setBukuin(bukuDao.getBukuin(form.getCboBuku().getSelectedIndex()));
        pengembalian.setTglkembali(form.getTxtTglKembali().getText());

    }

    public void tampilData() {
        DefaultTableModel tabelModel = (DefaultTableModel) form.getTxtTblPengembalian().getModel();
        tabelModel.setRowCount(0);
        List<Pengembalian> list = pengembalianDao.getAll();
        for (Pengembalian pengembalian : list) {
            Object[] data = {
                    pengembalian.getAnggota().getNobp(),
                    pengembalian.getAnggota().getNama(),
                    pengembalian.getBukuin().getKode(),
                    pengembalian.getPeminjaman().getTglpinjam(),
                    pengembalian.getPeminjaman().getTglkembali(),
                    pengembalian.getTerlambat(),
                    pengembalian.getDenda()
            };
            tabelModel.addRow(data);
        }
    }
}
