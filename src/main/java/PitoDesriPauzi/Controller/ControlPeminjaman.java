package PitoDesriPauzi.Controller;

import java.sql.Connection;
import java.util.List;

import PitoDesriPauzi.DB.Koneksi;
import PitoDesriPauzi.Dao.*;
import PitoDesriPauzi.Model.*;
import PitoDesriPauzi.View.FormPeminjamandb;
import javax.swing.table.DefaultTableModel;

public class ControlPeminjaman {
    private FormPeminjamandb form;
    private AnggotaDao daoAgg;
    private BukuDao daoBuku;
    private PeminjamanDao dao;
    private Peminjaman pm;
    private Connection cn;

    public ControlPeminjaman(FormPeminjamandb form) throws Exception {
        this.form = form;
        cn = Koneksi.getConnection();
        daoAgg = new AnggotaDaoImpl(cn);
        daoBuku = new BukuDaoImpl(cn);
        dao = new PeminjamanDaoImpl(cn);
    }

    public void Clear() throws Exception {
        List<Buku> bukuD = daoBuku.getAll();
        List<Anggota> aggD = daoAgg.getAll();
        form.getTxtTglkembali().setText("");
        form.getTxtTglPinjam().setText("");
        form.getCboKodeAnggota().removeAllItems();
        form.getCboKodeBuku().removeAllItems();
        form.getCboKodeAnggota().addItem("");
        form.getCboKodeBuku().addItem("");

        for (Anggota agg : aggD) {
            form.getCboKodeAnggota().addItem(agg.getKodeanggota());
        }
        for (Buku buku : bukuD) {
            form.getCboKodeBuku().addItem(buku.getKodeBuku());
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
                        pm.getNama(),
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
            String kode = form.getTblPeminjaman().getValueAt(form.getTblPeminjaman().getSelectedRow(), 0).toString();
            pm = dao.getPm(kode);
            form.getTxtTglkembali().setText(pm.getTanggalKemabli());
            form.getCboKodeAnggota().setSelectedItem(pm.getKodeagg());
            form.getTxtTglPinjam().setText(pm.getTanggalPinjam());
            form.getCboKodeBuku().setSelectedItem(pm.getKodebuku());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
