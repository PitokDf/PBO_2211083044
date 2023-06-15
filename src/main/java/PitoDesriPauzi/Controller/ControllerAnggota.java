package PitoDesriPauzi.Controller;

import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import PitoDesriPauzi.DB.Koneksi;
import PitoDesriPauzi.Model.Anggota;
import PitoDesriPauzi.Model.AnggotaDao;
import PitoDesriPauzi.Model.AnggotaDaoImpl;
import PitoDesriPauzi.View.FormAnggotadb;

public class ControllerAnggota {
    private FormAnggotadb form;
    private AnggotaDao dao;
    private Connection cn;
    Anggota agg;

    public ControllerAnggota(FormAnggotadb form) {
        this.form = form;
    }

    public void insert() throws Exception {
        Anggota agg = new Anggota();
        cn = Koneksi.getConnection();
        AnggotaDao dao = new AnggotaDaoImpl(cn);
        agg.setKodeanggota(form.getTxtKodeAnggota().getText());
        agg.setNamaanggota(form.getTxtNama().getText());
        agg.setAlamat(form.getTxtAlamat().getText());
        agg.setJeniskelamin(form.getCboJenisKelamin().getSelectedItem().toString());
        dao.insert(agg);
    }

    public void cls() throws Exception {
        form.getTxtKodeAnggota().setText("");
        form.getTxtNama().setText("");
        form.getTxtAlamat().setText("");
        form.getCboJenisKelamin().setSelectedIndex(0);
    }

    public void tampilData() throws Exception {
        cn = Koneksi.getConnection();
        Statement statement = cn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM anggota");
        DefaultTableModel tableModel = (DefaultTableModel) form.getTblAnggota().getModel();
        tableModel.setRowCount(0);
        while (resultSet.next()) {
            Object[] data = {
                    resultSet.getString("kodeanggota"),
                    resultSet.getString("namaanggota"),
                    resultSet.getString("alamat"),
                    resultSet.getString("jeniskelamin")
            };
            tableModel.addRow(data);
        }
    }

    public void getAnggota() throws Exception {
        form.getTxtKodeAnggota()
                .setText(form.getTblAnggota().getValueAt(form.getTblAnggota().getSelectedRow(), 0).toString());
        form.getTxtNama().setText(form.getTblAnggota().getValueAt(form.getTblAnggota().getSelectedRow(), 1).toString());
        form.getTxtAlamat()
                .setText(form.getTblAnggota().getValueAt(form.getTblAnggota().getSelectedRow(), 2).toString());
        form.getCboJenisKelamin()
                .setSelectedItem(form.getTblAnggota().getValueAt(form.getTblAnggota().getSelectedRow(), 3));
    }

    public void delete() {
        try {
            Anggota agg = new Anggota();
            cn = Koneksi.getConnection();
            AnggotaDao dao = new AnggotaDaoImpl(cn);
            agg.setKodeanggota(form.getTxtKodeAnggota().getText());
            dao.Delete(agg);

        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(form, e);
        }
    }

    public void Update() throws Exception {
        try {
            Anggota agg = new Anggota();
            cn = Koneksi.getConnection();
            AnggotaDao dao = new AnggotaDaoImpl(cn);
            agg.setKodeanggota(form.getTxtKodeAnggota().getText());
            agg.setNamaanggota(form.getTxtNama().getText());
            agg.setAlamat(form.getTxtAlamat().getText());
            agg.setJeniskelamin(form.getCboJenisKelamin().getSelectedItem().toString());
            dao.Update(agg);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
