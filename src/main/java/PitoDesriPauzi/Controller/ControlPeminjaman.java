package PitoDesriPauzi.Controller;

import java.sql.Connection;
import java.util.List;

import PitoDesriPauzi.DB.Koneksi;
import PitoDesriPauzi.Dao.*;
import PitoDesriPauzi.Model.*;
import PitoDesriPauzi.View.FormPeminjamandb;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlPeminjaman {
    private FormPeminjamandb form;
    private AnggotaDao daoAgg;
    private BukuDao daoBuku;
    private PeminjamanDao dao;
    private Peminjaman pm;
    private Connection cn;

    // Anggota agg = new Anggota();
    public ControlPeminjaman(FormPeminjamandb form) throws Exception {
        this.form = form;
        cn = Koneksi.getConnection();
        daoAgg = new AnggotaDaoImpl(cn);
        daoBuku = new BukuDaoImpl(cn);
        dao = new PeminjamanDaoImpl(cn);
        pm = new Peminjaman();

    }

    public void Clear() throws Exception {
        List<Buku> bukuD = daoBuku.getAll();
        List<Anggota> aggD = daoAgg.getAll();
        form.getTxtTglkembali().setText("yyyy-mm-dd");
        form.getTxtTglPinjam().setText("yyyy-mm-dd");
        form.getCboKodeAnggota().removeAllItems();
        form.getCboKodeBuku().removeAllItems();
        form.getCboKodeAnggota().addItem("");
        form.getCboKodeBuku().addItem("");

        for (Anggota agg : aggD) {
            form.getCboKodeAnggota().addItem(agg.getKodeanggota() + " - " + agg.getNamaanggota());
        }
        for (Buku buku : bukuD) {
            form.getCboKodeBuku().addItem(buku.getKodeBuku() + " - " + buku.getJudulBuku());
        }
    }

    public void Showdata() {
        DefaultTableModel tableModel = (DefaultTableModel) form.getTblPeminjaman().getModel();
        tableModel.setRowCount(0);
        try {
            List<Peminjaman> List = dao.getAll();
            for (Peminjaman pm : List) {
                Object[] data = {
                        pm.getKodeagg(),
                        pm.getKodebuku(),
                        pm.getTanggalPinjam(),
                        pm.getTanggalKemabli()
                };
                tableModel.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Klik() {
        try {
            String kode = form.getTblPeminjaman().getValueAt(form.getTblPeminjaman().getSelectedRow(), 1).toString();
            String kodeAngg = form.getTblPeminjaman().getValueAt(form.getTblPeminjaman().getSelectedRow(), 0)
                    .toString();
            String tglpinjam = form.getTblPeminjaman().getValueAt(form.getTblPeminjaman().getSelectedRow(), 2)
                    .toString();
            pm = dao.getPm(kode, kodeAngg, tglpinjam);
            Anggota agg = daoAgg.getAgg(pm.getKodeagg());
            Buku buku = daoBuku.getBuku(kode);
            form.getTxtTglkembali().setText(pm.getTanggalKemabli());
            form.getCboKodeAnggota().setSelectedItem(pm.getKodeagg() + " - " + agg.getNamaanggota());
            form.getCboKodeBuku().setSelectedItem(pm.getKodebuku() + " - " + buku.getJudulBuku());
            form.getTxtTglPinjam().setText(pm.getTanggalPinjam());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
        }
    }

    public void Insert() {
        try {
            String[] kodeAnggota = form.getCboKodeAnggota().getSelectedItem().toString().split(" - ");
            pm.setKodeagg(kodeAnggota[0]);
            String[] kodeBuku = form.getCboKodeBuku().getSelectedItem().toString().split(" -");
            pm.setKodebuku(kodeBuku[0]);
            pm.setTanggalPinjam(form.getTxtTglPinjam().getText());
            pm.setTanggalKemabli(form.getTxtTglkembali().getText());
            dao.Insert(pm);
            JOptionPane.showMessageDialog(form, "Insert Berhasil.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
        }
    }

    public void Update() {
        try {
            pm.setKodeagg(form.getTblPeminjaman().getValueAt(form.getTblPeminjaman().getSelectedRow(), 0).toString());
            pm.setKodebuku(form.getTblPeminjaman().getValueAt(form.getTblPeminjaman().getSelectedRow(), 1).toString());
            pm.setTanggalPinjam(form.getTxtTglPinjam().getText());
            pm.setTanggalKemabli(form.getTxtTglkembali().getText());
            dao.Update(pm);
            JOptionPane.showMessageDialog(form, "Update Berhasil.");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void Delete() {
        try {
            String[] kodeAnggota = form.getCboKodeAnggota().getSelectedItem().toString().split(" - ");
            pm.setKodeagg(kodeAnggota[0]);
            String[] kodeBuku = form.getCboKodeBuku().getSelectedItem().toString().split(" -");
            pm.setKodebuku(kodeBuku[0]);
            dao.Delete(pm);
            JOptionPane.showMessageDialog(form, "Delete Berhasil.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
        }
    }
}
