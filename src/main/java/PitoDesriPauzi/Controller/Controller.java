package PitoDesriPauzi.Controller;

import java.sql.Connection;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import PitoDesriPauzi.DB.Koneksi;
import PitoDesriPauzi.Dao.*;
import PitoDesriPauzi.Model.Anggota;
import PitoDesriPauzi.View.FormAnggotadb;

public class Controller {
    private FormAnggotadb form;
    private Anggota agg = new Anggota();
    private AnggotaDao dao;
    private Connection cn;

    public Controller(FormAnggotadb form) throws Exception {
        this.form = form;
        cn = Koneksi.getConnection();
        dao = new AnggotaDaoImpl(cn);
    }

    public void Clear() {
        form.getTxtKodeAnggota().setText("");
        form.getTxtNama().setText("");
        form.getTxtAlamat().setText("");
        form.getCboJenisKelamin().setSelectedIndex(0);
        form.getTxtKodeAnggota().setEditable(true);
    }

    public void Showdata() {
        DefaultTableModel tableModel = (DefaultTableModel) form.getTblAnggota().getModel();
        tableModel.setRowCount(0);
        try {
            List<Anggota> anggotaList = dao.getAll();
            for (Anggota anggota : anggotaList) {
                Object[] data = {
                        anggota.getKodeanggota(),
                        anggota.getNamaanggota(),
                        anggota.getAlamat(),
                        anggota.getJeniskelamin()
                };
                tableModel.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Insert() {
        try {
            cn = Koneksi.getConnection();
            AnggotaDao dao = new AnggotaDaoImpl(cn);
            agg.setKodeanggota(form.getTxtKodeAnggota().getText());
            agg.setNamaanggota(form.getTxtNama().getText());
            agg.setAlamat(form.getTxtAlamat().getText());
            agg.setJeniskelamin(form.getCboJenisKelamin().getSelectedItem().toString());
            dao.insert(agg);
            JOptionPane.showMessageDialog(form, "Insert Ok!");
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(form, e);
        }
    }

    public void getAgg() {
        try {
            String kode = form.getTblAnggota().getValueAt(form.getTblAnggota().getSelectedRow(), 0).toString();
            agg = dao.getAgg(kode);
            form.getTxtKodeAnggota().setText(agg.getKodeanggota());
            form.getTxtNama().setText(agg.getNamaanggota());
            form.getTxtAlamat().setText(agg.getAlamat());
            form.getCboJenisKelamin().setSelectedItem(agg.getJeniskelamin());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
        }
    }

    public void Update() {
        try {
            cn = Koneksi.getConnection();
            AnggotaDao dao = new AnggotaDaoImpl(cn);
            agg.setKodeanggota(form.getTxtKodeAnggota().getText());
            agg.setNamaanggota(form.getTxtNama().getText());
            agg.setAlamat(form.getTxtAlamat().getText());
            agg.setJeniskelamin(form.getCboJenisKelamin().getSelectedItem().toString());
            dao.update(agg);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
        }
    }

    public void Delete() {
        try {
            String kode = form.getTxtKodeAnggota().getText();
            dao.delete(kode);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
        }
    }
}
